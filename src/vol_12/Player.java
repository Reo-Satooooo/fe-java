package vol_12;

public class Player {

    protected String playerName;
    protected Card card1;
    protected Card card2;
    protected int cardNum;

    public Player(){
        this.card1 = card1;
        this.card2 = card2;
        this.playerName = playerName;
    }

    public int checkNum(){
        cardNum = card1.checkNumber() + card2.checkNumber();
        return cardNum;
    }

    public void checkCard(){
        System.out.print(this.playerName + "の1枚目：");
        card1.print();
        System.out.print(this.playerName + "の2枚目：");
        card2.print();
        System.out.print("合計：" + cardNum);
        System.out.print("\n");
    }

}
