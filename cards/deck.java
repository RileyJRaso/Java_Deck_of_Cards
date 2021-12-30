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

  public Card[] dealCards(Card[] deck, int amountofCards){
    Card[] Cards = new Card[amountofCards];
    int decksize = deck.length - 1;

    for(int i = 0; i < amountofCards; i++){
      Cards[i] = deck[0];
      reorderdeck(deck, decksize);
      deck[decksize - i] = null;
    }

    return Cards;
  }

  private void reorderdeck(Card[] deck, int decksize){
    for(int j = 0; j < decksize; j++){
      deck[j] = deck[j + 1];
    }
  }



}
