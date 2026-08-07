package com.example.wordquest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameOverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        val tvGameOver = findViewById<TextView>(R.id.tvGameOver)
        val tvFinalScore = findViewById<TextView>(R.id.tvFinalScore)
        val btnRestart = findViewById<Button>(R.id.btnRestart)

        val score = intent.getIntExtra("score", 0)
        val level = intent.getIntExtra("level", 1)

        tvGameOver.text = "😢 GAME OVER"
        tvFinalScore.text =
            "🏆 Final Score: $score\n⭐ Level Reached: $level"

        btnRestart.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }
    }
}