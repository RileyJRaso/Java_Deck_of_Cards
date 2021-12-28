# Java_Deck_of_Cards

classes that can simulate a deck of cards, the whole program is run by the main class which imports all the classes from the cards package. each card is an object of the Card class which holds it's suit and rank. the deck abstraction implements the deck creation method (to make a deck of a given size, works best for a deck of 52, 49, 26, or 13 to get every rank of cards) but leaves the shuffle method to be implemented by other classes that extend the deck class. the first extention of the deck class made is the random deck which has a shuffle method to simulate how a deck is shuffled in a casino that returns a random order of cards everytime it is called. 

# Installation

in order to get the program run: 

```bash
git clone https://github.com/RileyJRaso/Java_Deck_of_Cards.git

```

# Steps to run program

first thing you need to do is run the build steps using the makefile:

```bash
make all

```

the make all step will make all the java classes than make the main class like such:

```bash
javac -d ./cards ./cards/Card.java
javac -d ./cards ./cards/deck.java
javac -d ./cards ./cards/randomdeck.java
javac main.java

```

next run the main program to get an ordered deck, and than a shuffled deck:

```bash
java main
```

# Future plans

the following are a list of ideas for future features and changes to the program:


- add more user input such as the deck size before the deck class is called
- add a mode to get hands of cards rather than the whole deck
- add another extention of the deck class that returns an ordered deck everytime
