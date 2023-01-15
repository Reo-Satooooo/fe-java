package vol_12;

import java.util.Scanner;

public class SimpleBJ {

    public static void main(String[] args) {

        // 開始を宣言
        System.out.println("ブラックジャックを開始します\n");

        // 山札の準備
        Deck deck = new Deck();

        // ユーザーのターン
        User user = new User();
        user.setName();
        user.drawCard(deck);

        // CPUのターン
        CPU cpu = new CPU();
        cpu.drawCard(deck);

        // 勝敗判定
        System.out.println("【勝敗】");
        Jugement juge = new Jugement();
        juge.jugement(user,cpu);
    }

}
