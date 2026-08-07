# 🎮 Word Quest

An educational Android game designed to improve English vocabulary through an interactive word-chain challenge.

---

## 📖 About the Project

Word Quest is a fun and engaging Android application where players learn English vocabulary while playing. The game presents a word, and the player must enter another valid English word that starts with the last letter of the current word.

### Example

APPLE → ELEPHANT → TIGER → RABBIT → TREE

The game continues as long as the player enters correct words within the given time limit.

---

## ✨ Features

- 👤 Player Name Registration
- ⏱️ Countdown Timer
- 🔤 Word Chain Gameplay
- 📈 Live Score Tracking
- 🔊 Sound Effects for Correct and Wrong Answers
- 🎮 Game Over Screen
- 🏆 Success Screen
- 🔄 Play Again Functionality
- 🎨 Custom Word Quest App Icon
- 📱 Child-Friendly User Interface

---

## 🛠️ Technology Stack

| Technology | Used |
|------------|------|
| Language | Kotlin |
| IDE | Android Studio |
| UI Design | XML |
| Networking | Retrofit |
| Timer | CountDownTimer |
| Version Control | Git & GitHub |

---

## 🎯 Game Rules

1. Enter your name and start the game.
2. A word is displayed on the screen.
3. Enter a valid English word starting with the last letter of the displayed word.
4. Submit your answer before the timer ends.
5. Every correct answer increases your score.
6. The timer resets after each correct answer.
7. The game ends if:
   - Time runs out
   - Invalid word entered
   - Word starts with the wrong letter
8. After Game Over, the player can start again from Level 1.

---

## 📱 Application Screens

### 🏠 Welcome Screen

- Enter Player Name
- Start Game Button
- Designed By Amit Kumar Sharma

### 🎮 Game Screen

- Current Word Display
- Timer Display
- Score Display
- Word Input Field
- Submit Button

### ❌ Game Over Screen

- Final Score
- Play Again Button

### 🏆 Success Screen

- Congratulations Message
- Final Score Display

---

## 📂 Project Structure

```text
app
├── src
│   ├── main
│   │   ├── java/com/example/wordquest
│   │   │   ├── MainActivity.kt
│   │   │   ├── GameActivity.kt
│   │   │   ├── GameOverActivity.kt
│   │   │   ├── SuccessActivity.kt
│   │   │   └── network
│   │   │       ├── DictionaryApi.kt
│   │   │       └── RetrofitClient.kt
│   │   └── res
│   │       ├── layout
│   │       ├── drawable
│   │       ├── mipmap
│   │       └── raw
│   │           ├── correct.mp3
│   │           └── wrong.mp3
```

---

## 🚀 Future Enhancements

- 🌐 Dictionary API Validation
- 🏅 High Score System
- 📊 Leaderboard
- 🎚️ Multiple Difficulty Levels
- 🎨 Better Animations
- 🗂️ Category-Based Learning
- 👥 Multiplayer Mode
- 🎤 Voice Input Support
- ☁️ Online Score Storage

---

## 🔄 Game Flow

```text
Start App
    ↓
Enter Name
    ↓
Start Game
    ↓
Display Word
    ↓
Enter New Word
    ↓
Validate Word
    ↓
Correct?
 ↙       ↘
Yes       No
 ↓         ↓
Score+1  Game Over
 ↓
Reset Timer
 ↓
Next Word
```

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/Sharmaamit-164/Word-Chain.git
```

### Open in Android Studio

1. Open Android Studio
2. Click Open Project
3. Select the Word Quest project
4. Sync Gradle Files
5. Run the Application

---

## 👨‍💻 Developer

**Amit Kumar Sharma**

🎓 B.Tech (2024–2028)  
🏫 Centurion University of Technology and Management  
💻 Aspiring Full Stack & Android Developer

### Connect With Me

- GitHub: https://github.com/Sharmaamit-164
- LinkedIn: https://www.linkedin.com/in/amitks16

---

## 🖼️ Word Quest Logo

<p align="center">
  <img src="screenshots/wordquest.png" alt="Word Quest Logo" width="300">
</p>

---

## 📄 License

This project was developed for educational and learning purposes. Feel free to use and modify it for academic and personal projects.

---

<p align="center">
⭐ If you like this project, don't forget to star the repository!
</p><img width="1292" height="1005" alt="Screenshot 2026-08-08 033041" src="https://github.com/user-attachments/assets/348db17c-cfe2-41b7-9db8-599917500704" />
