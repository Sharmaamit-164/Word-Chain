package com.example.wordquest

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wordquest.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class GameActivity : AppCompatActivity() {


    private var expectedLetter = 'A'
    private var level = 1
    private var score = 0


    // Store already used words
    private val usedWords = mutableSetOf<String>()


    private lateinit var tvLevel: TextView
    private lateinit var tvScore: TextView
    private lateinit var tvTimer: TextView
    private lateinit var tvCurrentWord: TextView
    private lateinit var etWord: EditText


    private var countDownTimer: CountDownTimer? = null


    // 🔊 Sound variables
    private lateinit var correctSound: MediaPlayer
    private lateinit var wrongSound: MediaPlayer



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_game)


        // 🔊 Initialize sounds
        correctSound = MediaPlayer.create(this, R.raw.correct)
        wrongSound = MediaPlayer.create(this, R.raw.wrong)



        tvCurrentWord = findViewById(R.id.tvCurrentWord)
        tvLevel = findViewById(R.id.tvLevel)
        tvScore = findViewById(R.id.tvScore)
        tvTimer = findViewById(R.id.tvTimer)

        etWord = findViewById(R.id.etWord)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)



        tvCurrentWord.text = "Start With: A"
        tvLevel.text = "⭐ Level 1"
        tvScore.text = "🏆 Score: 0"
        etWord.hint = "Enter a word starting with A"



        startTimer()



        btnSubmit.setOnClickListener {


            val enteredWord =
                etWord.text.toString().trim().uppercase()



            if (enteredWord.isEmpty()) {


                Toast.makeText(
                    this,
                    "Please enter a word",
                    Toast.LENGTH_SHORT
                ).show()


                return@setOnClickListener
            }




            // Check duplicate word
            if (usedWords.contains(enteredWord)) {


                playWrongSound()


                Toast.makeText(
                    this,
                    "❌ Word already used!",
                    Toast.LENGTH_SHORT
                ).show()


                return@setOnClickListener
            }




            // Check starting letter
            if (!enteredWord.startsWith(expectedLetter, true)) {


                playWrongSound()


                Toast.makeText(
                    this,
                    "Word must start with $expectedLetter",
                    Toast.LENGTH_SHORT
                ).show()


                return@setOnClickListener
            }




            RetrofitClient.api.checkWord(enteredWord)
                .enqueue(object : Callback<List<Any>> {


                    override fun onResponse(
                        call: Call<List<Any>>,
                        response: Response<List<Any>>
                    ) {


                        if (response.isSuccessful) {


                            // 🔊 Correct sound
                            playCorrectSound()



                            usedWords.add(enteredWord)


                            expectedLetter =
                                enteredWord.last()



                            level++

                            score += 10



                            tvLevel.text =
                                "⭐ Level $level"


                            tvScore.text =
                                "🏆 Score: $score"


                            tvCurrentWord.text =
                                "Start With: $expectedLetter"



                            etWord.setText("")

                            etWord.hint =
                                "Enter a word starting with $expectedLetter"



                            countDownTimer?.cancel()

                            startTimer()



                            Toast.makeText(
                                this@GameActivity,
                                "🎉 Correct! +10 Points",
                                Toast.LENGTH_SHORT
                            ).show()



                        } else {



                            // 🔊 Wrong sound
                            playWrongSound()



                            Toast.makeText(
                                this@GameActivity,
                                "❌ Invalid English Word",
                                Toast.LENGTH_SHORT
                            ).show()

                        }

                    }




                    override fun onFailure(
                        call: Call<List<Any>>,
                        t: Throwable
                    ) {


                        playWrongSound()



                        Toast.makeText(
                            this@GameActivity,
                            "🌐 Internet Error",
                            Toast.LENGTH_SHORT
                        ).show()

                    }


                })

        }

    }





    // 🔊 Play correct sound
    private fun playCorrectSound() {

        if (::correctSound.isInitialized) {

            correctSound.start()

        }

    }



    // 🔊 Play wrong sound
    private fun playWrongSound() {

        if (::wrongSound.isInitialized) {

            wrongSound.start()

        }

    }






    private fun startTimer() {


        countDownTimer =
            object : CountDownTimer(15000,1000) {


                override fun onTick(
                    millisUntilFinished: Long
                ) {


                    tvTimer.text =
                        (millisUntilFinished / 1000).toString()

                }



                override fun onFinish() {


                    val intent =
                        Intent(
                            this@GameActivity,
                            GameOverActivity::class.java
                        )



                    intent.putExtra(
                        "score",
                        score
                    )


                    intent.putExtra(
                        "level",
                        level
                    )



                    startActivity(intent)


                    finish()

                }

            }.start()

    }





    override fun onDestroy() {


        super.onDestroy()


        countDownTimer?.cancel()


        // 🔊 Release sounds
        if (::correctSound.isInitialized) {
            correctSound.release()
        }


        if (::wrongSound.isInitialized) {
            wrongSound.release()
        }

    }

}