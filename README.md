This is a project that I am using to practice/implement design principles 

- Trying to practice using SOLID design priciples in a context that I enjoy, Magic The Gathering
- I thought it would be useful to design the app using Hexagonal arrchitecture and FSM since the game has a series of phases

Designing (Taking a step back)

Game
  - The game has 2 **players**
  - The game has a **battlefield** to track the **permanents** that have _resolved_ (Should this just be a list of each player's battlefields)
  - The game has a **stack** to track **spells** that have been _cast_
  - The game has **global_effects**
  - The game has **phases** to track what point int the game it is

Player
  - The Player has a life total to track their progress towards winning
  - The Player has a **Deck**
  - The Player has a **battlefield**
  - The Player has a **graveyard**
  - The Player has an **exile zone**

Battlefield
  - The Battlefield contains a List of (cards/spells/permanents) (played/cast/resolved?) by a player

Stack 
  - The Stack is a LIFO queue that tracks which cards have been cast by the players and the order in which they are resolved

Global Effects
  - The global effects track effects that apply to the game, but are not attached to a particular permanent

Permanent
  - Permanents are cards that when cast/played and resolved stay on the battle field
      - Planeswalkers
      - Enchantments
      - Creatures
      - Artifacts
      - Lands
