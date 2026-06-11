# Wizard Duel Arena

A console-based, turn-based wizard duel simulation developed in Java using Object-Oriented Programming (OOP) principles. The player controls Harry Potter to battle against an AI-controlled Voldemort, strategically managing spells and potions to survive and win the duel.

## Features

* **Turn-Based Combat System:** The player chooses to either cast a spell or use a potion during their turn, followed immediately by the opponent's counter-action.
* **Accuracy Mechanics (RNG):** Every spell has a distinct accuracy rate. Whether a spell successfully hits the target or misses is calculated dynamically using randomized probabilities.
* **Wand Power Modifiers:** Core materials of the wands (Phoenix Feather, Dragon Heartstring, Unicorn Hair) act as damage multipliers, boosting the base damage of the spells cast.
* **Dynamic Health & Inventory Management:** Wizards can restore health by consuming potions from their pocket inventory. Health points are capped at a specific maximum limit, and used potions are automatically consumed and removed from the inventory.

## Project Structure (Classes)

* `DuelArena.java`: The entry point of the application containing the main game loop. It initializes the wizards, assigns their wands, populates their spells/potions, and orchestrates the turn-based combat mechanics.
* `Wizard.java`: Encapsulates the core attributes of a wizard (health, house, wand, spellbook, and pocket inventory). It manages behaviors such as learning spells, finding/using potions, casting spells, and taking damage.
* `Wand.java`: Represents a wizard's wand, holding properties for its core material and length. It includes the `getPowerModifier()` method to dynamically determine damage amplification based on the core type.
* `Spell.java`: Defines the spells available in the game, storing their name, base damage, and accuracy value, alongside success-checking logic.
* `Potion.java`: A simple data class representing healing potions and their respective health restoration values.
* `House.java`: An enumeration (Enum) defining the four wizarding houses (Gryffindor, Slytherin, Ravenclaw, Hufflepuff).

## Core Concepts Applied

* **Java Core Programming**
* **Object-Oriented Programming (OOP):** Employs encapsulation to protect data and composition to establish relationships between wizards, wands, spells, and potions.
* **Data Structures:** Utilizes `ArrayList` for dynamic inventory management (spellbook and potion pocket).
* **Randomized Logic:** Implements `java.util.Random` for accuracy checks and AI spell selection.
* **Stream I/O:** Uses `java.util.Scanner` to capture and process real-time user terminal inputs.
