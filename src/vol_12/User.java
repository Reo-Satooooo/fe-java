package vol_12;

import java.util.Scanner;

public class User extends Player{

    public User() {
        this.playerName = "あなた";
    }

    public void drawCard(Deck deck){
        System.out.println("カードを2枚引きます。");
        int remainCard = deck.checkCardRemain();
        System.out.println(this.playerName + "：0~" + (remainCard-1) + "から任意の整数を1つ入力してください。");

        Scanner input1 = new Scanner(System.in);
        System.out.print("1枚目：");
        int num1 = input1.nextInt();
        try{
            Card card1 = deck.drawCard(num1);
            this.card1 = card1;
        }catch (IndexOutOfBoundsException e){
            System.out.println("指定した要素番号が範囲外です");
        }

        remainCard = deck.checkCardRemain();
        System.out.println(this.playerName + "：0~" + (remainCard-1) + "から任意の整数を1つ入力してください。");
        Scanner input2 = new Scanner(System.in);
        System.out.print("2枚目：");
        int num2 = input2.nextInt();
        try{
            Card card2 = deck.drawCard(num2);
            this.card2 = card2;
        }catch (IndexOutOfBoundsException e){
            System.out.println("指定した要素番号が範囲外です");
        }
    }

    public void setName(){
        System.out.print("あなたの名前を入力してください：");
        Scanner input = new Scanner(System.in);
        String inputName = input.nextLine();
        System.out.print("\n");
        this.playerName = inputName;
    }
}
