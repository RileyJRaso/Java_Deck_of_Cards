package cards;
import cards.Card;
import cards.deck;
import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;


public class randomdeck extends deck {

  public Card[] shuffledeck(Card[] deck, int size){
    Random rand = new Random();
    Queue<Card> cutdeck1 = new LinkedList<>();
    Queue<Card> cutdeck2 = new LinkedList<>();

    for(int j = 0; j < 70; j++){

      //cutting the deck
      for(int i = 0; i < size/2 ; i++){
        cutdeck1.add(deck[i]);
      }
      for(int i = size/2; i < size; i++){
        cutdeck2.add(deck[i]);
      }

      for(int i = 0; i < size; i++){

        int int_random = rand.nextInt(2);
        if(int_random == 0){
          if(cutdeck1.peek() != null){
            Card currentcard = cutdeck1.poll();
            deck[i] = currentcard;
          } else if (cutdeck2.peek() != null){
            Card currentcard = cutdeck2.poll();
            deck[i] = currentcard;
          } else {
            ;
          }
        }

        if(int_random == 1){
          if(cutdeck2.peek() != null){
            Card currentcard = cutdeck2.poll();
            deck[i] = currentcard;
          } else if (cutdeck1.peek() != null){
            Card currentcard = cutdeck1.poll();
            deck[i] = currentcard;
          } else {
            ;
          }
        }

      }


    }

    return deck;
  }

}
