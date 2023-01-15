package vol_12;

import java.util.Random;
import java.util.Scanner;

public class CPU extends Player{

    public CPU(){
        this.playerName = "CPU";
    }

    public void drawCard(Deck deck){

        // 1枚目
        int remainCard = deck.checkCardRemain();
        Random rand = new Random();
        int num1 = rand.nextInt(remainCard);
        try{
            Card card1 = deck.drawCard(num1);
            this.card1 = card1;
        }catch (IndexOutOfBoundsException e){
            System.out.println("指定した要素番号が範囲外です");
        }

        // 2枚目
        remainCard = deck.checkCardRemain();
        int num2 = rand.nextInt(remainCard);
        try{
            Card card2 = deck.drawCard(num2);
            this.card2 = card2;
        }catch (IndexOutOfBoundsException e){
            System.out.println("指定した要素番号が範囲外です");
        }
    }



}
