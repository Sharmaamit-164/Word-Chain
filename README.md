# 🎮 Word Chain Kids Game

An educational Android application designed for children to improve their English vocabulary through an interactive word-chain game.

## 📖 About the Project

Word Chain Kids Game helps children learn new English words while having fun. The game starts with a word, and the player must enter another valid word that begins with the last letter of the previous word.

### Example

APPLE → ELEPHANT → TIGER → RABBIT → TREE

The game continues as long as the player enters correct words within the given time limit.

---

## 🎯 Features

- 👤 Player Name Registration
- ⏱️ 15-Second Countdown Timer
- 🔤 Word Chain Gameplay
- 📊 Score Tracking
- 🎮 Game Over Screen
- 🔄 Restart Functionality
- 🧒 Child-Friendly Interface

---

## 🛠️ Technology Stack

- **Language:** Kotlin
- **IDE:** Android Studio
- **UI Design:** XML
- **Timer:** CountDownTimer
- **Architecture:** MVVM (Planned)
- **Database:** Room Database (Future)
- **API Integration:** Retrofit (Future)

---

## 🎮 Game Rules

1. Enter your name and start the game.
2. A word will be displayed.
3. Enter a valid English word that starts with the last letter of the displayed word.
4. You have 15 seconds to answer.
5. Each correct answer increases your score.
6. The timer resets after every correct answer.
7. The game ends if:
   - Time runs out
   - An invalid word is entered
   - The word starts with the wrong letter
8. After Game Over, the player returns to Level 1 and starts again.

---

## 📱 Screens

### Welcome Screen
- Player Name Input
- Start Game Button

### Game Screen
- Current Word Display
- Countdown Timer
- Score Display
- Word Input Field
- Submit Button

### Game Over Screen
- Final Score
- Play Again Button

---

## 📂 Project Structure

```text
app
├── activities
│   ├── MainActivity
│   ├── GameActivity
│   └── ResultActivity
├── adapters
├── models
├── repository
├── utils
└── database
```

---

## 🚀 Future Enhancements

- Dictionary API Integration
- High Score System
- Leaderboard
- Multiple Difficulty Levels
- Sound Effects
- Animations
- Category-Based Learning
- Multiplayer Mode
- Voice Input Support

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

### Clone the Repository

```bash
git clone https://github.com/your-username/word-chain-kids-game.git
```

### Open in Android Studio

1. Open Android Studio
2. Click "Open Project"
3. Select the cloned repository
4. Sync Gradle
5. Run the application

---

## 👨‍💻 Author

**Amit Sharma**

- B.Tech (2024–2028)
- Centurion University of Technology and Management
- Aspiring Full Stack & Android Developer

### Connect With Me

- GitHub: https://github.com/Sharmaamit-164
- LinkedIn: https://www.linkedin.com/in/amitks16

---

## 📄 License

This project is developed for educational purposes and learning. Feel free to use and modify it for academic and personal projects.

---

⭐ If you like this project, don't forget to star the repository!
