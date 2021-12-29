import cards.Card;
import cards.randomdeck;

public class main {

  public static void main(String[] args) {

    randomdeck newdeck = new randomdeck();
    int size = 52;
    Card[] deckof52 = newdeck.createdeck(size);
    Card[] firsthand = new Card[2];

    System.out.println("");
    System.out.println("Ordered deck of cards:");
    System.out.println("");

    for (int i = 0; i < size; i++) {
    System.out.println("suit of card " + (i + 1) +" is: " + deckof52[i].Show_suit() + " rank is: " + deckof52[i].Show_rank());
    }

    deckof52 = newdeck.shuffledeck(deckof52, size);

    System.out.println("");
    System.out.println("Shuffled deck of cards:");
    System.out.println("");

    for (int i = 0; i < size; i++) {
    System.out.println("suit of card " + (i + 1) +" is: " + deckof52[i].Show_suit() + " rank is: " + deckof52[i].Show_rank());
    }

    firsthand = newdeck.dealhand(deckof52, 2);

    System.out.println("");
    System.out.println("dealt hand of cards:");
    System.out.println("");

    for (int i = 0; i < 2; i++) {
    System.out.println("suit of card " + (i + 1) +" is: " + firsthand[i].Show_suit() + " rank is: " + firsthand[i].Show_rank());
    }

    System.out.println("");
    System.out.println("remaning deck of cards:");
    System.out.println("");

    for (int i = 0; i < size; i++) {
      if(deckof52[i] == null){
        ;
      } else {
          System.out.println("suit of card " + (i + 1) +" is: " + deckof52[i].Show_suit() + " rank is: " + deckof52[i].Show_rank());
      }
    }

  }
}
