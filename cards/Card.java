package cards;

public class Card {
  String suit;
  String rank;

  public Card(int given_suit, int given_rank) {
    //assigning the suit of the card
    if (given_suit == 1) {
      suit = "Clubs";
    } else if (given_suit == 2) {
      suit = "Diamonds";
    } else if (given_suit == 3) {
      suit = "Hearts";
    } else {
      suit = "Spades";
    }

    //assinging the rank of the card
    if (given_rank == 1) {
      rank = "Ace";
    } else if (given_rank >= 2 && given_rank <= 10) {
      rank = Integer.toString(given_rank);
    } else if (given_rank == 11) {
      rank = "Jack";
    } else if (given_rank == 12) {
      rank = "Queen";
    } else {
      rank = "King";
    }

  }

  public String Show_suit() {
    return suit;
  }

  public String Show_rank() {
    return rank;
  }

}
