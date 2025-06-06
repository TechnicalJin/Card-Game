public class CardComparator {
    public static int compareCards(Card card1, Card card2) {
        return Integer.compare(card1.cardType.getValueOfCard(), card2.cardType.getValueOfCard());
    }
}