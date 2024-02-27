import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private ArrayList<Card> cardDeck;

  public Deck() {
    cardDeck = new ArrayList<Card>();
    addColorCards("Red");
    addColorCards("Green");
    addColorCards("Blue");
    addColorCards("Yellow");
    for (int wildCard = 0; wildCard < 4; wildCard++) {
      cardDeck.add(new Card("Wild", "wild"));
      cardDeck.add(new Card("Wild Draw Four", "wild"));
    }
  }

  private void addColorCards(String color) {
    cardDeck.add(new Card(color + " 0", color));
    for (int numberCard = 1; numberCard < 10; numberCard++) {
      cardDeck.add(new Card(color + " " + numberCard, color));
      cardDeck.add(new Card(color + " " + numberCard, color));
    }

    for (int actionCard = 0; actionCard < 2; actionCard++) {
      cardDeck.add(new Card(color + " Draw Two", color));
      cardDeck.add(new Card(color + " Reverse", color));
      cardDeck.add(new Card(color + " Skip", color));
    }
  }

  public ArrayList<Card> getDeck() {
    return cardDeck;
  }

  public void shuffle() {
    Collections.shuffle(cardDeck);
  }
}
