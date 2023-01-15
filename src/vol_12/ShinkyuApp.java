package vol_12;

import java.util.Scanner;

public class ShinkyuApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("進級される学生の学籍番号：");
        String gakuseki = input.next();
        try{
            Shinkyu shinkyu = new Shinkyu();
            shinkyu.moveUp(gakuseki);
            String msg = gakuseki + "を進級させました";
            System.out.println(msg);
        }
        catch (UnknownGakuseiException e){
            System.out.println("正しい学籍番号を入力してください");
        }
    }

}
