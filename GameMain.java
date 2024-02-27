public class GameMain {
  public void start() {
    System.out.println("Welcome to the Game!");
    Deck cardDeck = new Deck();
    System.out.println(cardDeck.getDeck().size());
    for (Card card : cardDeck.getDeck()) {
      System.out.println(card.getValue());
    }
    System.out.println();

    cardDeck.shuffle();
    for (Card card : cardDeck.getDeck()) {
      System.out.println(card.getValue());
    }
    System.out.println();

    cardDeck.shuffle();
    for (Card card : cardDeck.getDeck()) {
      System.out.println(card.getValue());
    }
  }
}
