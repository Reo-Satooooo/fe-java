package vol_12;

import java.util.Scanner;

public class DeckCheck {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCardList();
        Scanner input =  new Scanner(System.in);
        System.out.print("任意の整数を入力してください：");
        int number = input.nextInt();
        try{
            Card card = deck.drawCard(number);
            card.print();
        }catch (IndexOutOfBoundsException e){
            System.out.println("指定した要素番号が範囲外です");
        }

    }

}
