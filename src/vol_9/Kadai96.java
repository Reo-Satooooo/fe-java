package vol_9;

import java.util.Scanner;

public class Kadai96 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("部活名を入力：");
        String clubName = input.next();
        System.out.print("顧問を入力：");
        String komonName = input.next();
        Member komon = new Member(komonName);
        Club club = new Club(clubName, komon);

        while (true){
            System.out.println("入部=1、表示=2、削除=3、終了=0");
            System.out.println("数字を入力");

            int i = input.nextInt();

            if (i == 1) {
                System.out.print("学籍番号を入力：");
                String gakuseki = input.next();

                // Javaの都合上、氏名に空白を入れるとうまく動かない
                System.out.print("氏名を入力：");
                String shimei = input.next();

                Member member = new Member(gakuseki, shimei);
                club.join(member);
            }
            else if (i == 2) {
                club.print();
            }
            else if (i == 3){
                System.out.println("学籍番号を入力：");
                String gakuseki = input.next();
                club.delete(gakuseki);
            }
            else if(i == 0){
                System.exit(0);
            }
        }
    }

}
