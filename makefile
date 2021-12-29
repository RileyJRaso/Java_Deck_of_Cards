all: Card.class deck.class randomdeck.class main.class

Card.class: ./cards/Card.java
	   javac -d ./cards ./cards/Card.java

deck.class: ./cards/deck.java
	   javac -d ./cards ./cards/deck.java

randomdeck.class: ./cards/randomdeck.java
		 javac -d ./cards ./cards/randomdeck.java
		 touch main.java

main.class: main.java
		 javac main.java
