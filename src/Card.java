public class Card {
    CardType cardType;
    CardColor cardColor;

    public Card(CardType cardType, CardColor cardColor){
        this.cardType = cardType;
        this.cardColor = cardColor;
    }
}

enum CardType{
    A(1500),
    TWO(200),
    THREE(300),
    FOUR(400),
    FIVE(500),
    SIX(600),
    SEVEN(700),
    EIGHT(800),
    NINE(900),
    TEN(1000),
    J(1100),
    Q(1200),
    K(1300);

    final int valueOfCard;

    CardType(int valueOfCard) {
        this.valueOfCard = valueOfCard;
    }

    public int getValueOfCard(){
        return valueOfCard;
    }
}

enum CardColor{
    SPADE, HEART, DIAMOND, CLUB;
}