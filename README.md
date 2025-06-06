# Card Game Logic – Java Implementation

## 🃏 Project Summary

This project provides a simple Java-based logic implementation for a card game. It includes basic models for **Players**, **Cards**, **Card Types**, and **Card Colors**, as well as comparison logic for determining the stronger card. It's designed as a foundation for building turn-based card games, simulations, or learning object-oriented programming with enums and lists.

---

## 📁 Project Structure

- `Player` – Represents a player with a name, hand of cards, and a score counter.
- `Card` – Represents a card, defined by a `CardType` and a `CardColor`.
- `CardType` – Enum defining card ranks (A, 2, 3... K) with custom point values.
- `CardColor` – Enum for suits (Spade, Heart, Diamond, Club).
- `CardComparator` – Utility class to compare two cards based on their type values.

---

## 🔧 Features

- Add cards to a player's hand.
- Track and increment player scores.
- Compare cards by value using a static method.
- Extendable for additional rules (e.g. color-based comparison or game logic).

---
