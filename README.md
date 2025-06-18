# 🎲 DiceJack

**DiceJack** is a simple console-based game written in Java, inspired by Blackjack but using dice instead of cards.

## 📜 How It Works

1. The computer rolls **three dice** secretly.
2. The player is asked to input **three numbers** between 1 and 6.
3. The sums of the player's numbers and the dice rolls are compared.
4. The player wins **if their total is higher than the computer's**, but **the difference must be less than 5** to keep things fair.

## 🧠 Game Logic

- If the player inputs a number outside the valid range (1–6), the game will end immediately.
- Winning condition:
  - Player's total must be **greater** than the dice total.
  - The **difference** between them must be **less than 5**.

## 🛠 Technologies Used

- Java (JDK 8+)
- No external libraries – pure standard input/output

## ▶️ How to Play

1. Compile the program:

   ```bash
   javac DiceJack.java
