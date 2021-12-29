package cards;
import cards.Card;

abstract class deck {

  public Card[] createdeck(int size){
    int index;
    Card[] deckof52 = new Card[size];

    for (int i = 0; i < size; i++) {
        int suit = i / 13;
        int rank = i % 13;
        index = i;
        deckof52[index] = new Card((suit + 1),(rank + 1));
    }

    return deckof52;
  }

  //implemented by Polymorphism
  public abstract Card[] shuffledeck(Card[] deck, int size);

  public abstract Card[] dealhand(Card[] shuffledeck, int handsize);



}
