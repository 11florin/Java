# 🃏 Blackjack – Java Console Edition

A simplified, text-based Blackjack game built in Java. Test your luck and strategy against a computer dealer in this classic casino-style game — right in your terminal!

---

## 🎮 Gameplay Overview

Blackjack, also known as 21, is a card game where the goal is to beat the dealer by having a hand value closer to 21 — without going over.

### 👇 Basic Rules

- You are dealt **2 random cards**.
- The dealer is also dealt **2 cards**: one face-up, one hidden.
- All numbered cards count as their value (2–10).
- Face cards (J, Q, K) count as **10**.
- Aces are currently treated as **1** (not 1 or 11).
- You can choose to:
  - **Hit**: draw another card
  - **Stay**: end your turn
- If your total exceeds 21, you **bust** and lose.
- The dealer then draws until their total is 17 or higher.
- The highest hand (<= 21) wins.

---

## 📦 Features

- Interactive command-line gameplay
- Random card draw logic
- ASCII art playing cards
- Input validation (e.g. only accepts `"hit"` or `"stay"`)
- Simple win/loss messages

---

## 🚀 How to Run

1. Make sure you have Java installed (version 8 or higher).
2. Clone or download this repository.
3. Open a terminal in the project folder.
4. Compile the code:

   ```bash
   javac Blackjack.java
