import cards.Card;
import cards.randomdeck;

public class main {

  public static void main(String[] args) {

    randomdeck newdeck = new randomdeck();
    int size = 52;
    Card[] deckof52 = newdeck.createdeck(size);
    Card[] firsthand = new Card[2];
    Card[] communitycards = new Card[5];

    DisplayHeader("Ordered deck of cards:");

    DisplayCards(deckof52);

    deckof52 = newdeck.shuffledeck(deckof52, size);

    DisplayHeader("Shuffled deck of cards:");

    DisplayCards(deckof52);

    firsthand = newdeck.dealCards(deckof52, 2);

    DisplayHeader("dealt hand of cards:");

    DisplayCards(firsthand);

    Card[] River = newdeck.dealCards(deckof52, 3);
    for(int i = 0; i < 3; i++) {
      communitycards[i] = River[i];
    }

    DisplayHeader("dealt River:");

    DisplayCards(communitycards);

    DisplayHeader("remaning deck of cards:");

    DisplayCards(deckof52);

  }

  private static void DisplayCards(Card[] Givencards){

    for (int i = 0; i < Givencards.length; i++) {
      if(Givencards[i] == null){
        ;
      } else {
        System.out.println("suit of card " + (i + 1) +" is: " + Givencards[i].Show_suit() + " rank is: " + Givencards[i].Show_rank());
      }
    }

  }

  private static void DisplayHeader(String text){

    System.out.println("");
    System.out.println(text);
    System.out.println("");


  }


}
