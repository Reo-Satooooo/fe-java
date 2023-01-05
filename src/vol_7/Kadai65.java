package vol_7;

import java.util.Random;
import java.util.Scanner;

public class Kadai65 {
    public static void main(String[] args) {
        // Scannerと乱数表を準備する
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // 変数tAにTargetをlabel="A",x=4,y=4でインスタンス化する
        Target tA = new Target("A",4,4);

        // 変数tEにTargetをlabel="E",x=乱数Ex,y=乱数Eyでインスタンス化する
        int ex = rand.nextInt(4);
        int ey = rand.nextInt(4);
        Target tE = new Target("E",ex,ey);

        // 変数tGにTargetをlabel="G",x=乱数gx,y=乱数gyでインスタンス化する
        // gx,gyの乱数は、0から3までの4つから選ばれる
        int gx = rand.nextInt(4);
        int gy = rand.nextInt(4);
        Target tG =  new Target("G",gx,gy);

        // 無限ループの開始
        while (true){
            for (int y=0; y<5; y++){
                for (int x=0; x<5; x++){
                    if(x == tA.x && y == tA.y){
                        // x,yがtAのものと一致すればtAの表示名を表示
                        System.out.print(tA.label);
                    }
                    else if(x == tG.x && y == tG.y){
                        // x,yがtGのものと一致すればtGの表示名を表示
                        System.out.print(tG.label);
                    }
                    else if (x == tE.x && y == tE.y){
                        System.out.print(tE.label);
                    }
                    else {
                        // x,yがtA,tGのどちらのものとも一致しなければ、"."を表示
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }

            // 標準入力"w","a","s","d"の入力でtAのmove機能を実行する
            System.out.print("どちらに移動する？：");
            String key = input.next();

            tA.move(key);
            tE.move(tE.getKey());
            tG.move(tG.getKey());

            // tAとtGのx,y座標が完全一致すれば、プログラム終了する。
            if(tA.x == tG.x && tA.y == tG.y){
                System.out.println("Goal");
                System.exit(0);
            }
            else if(tA.x == tE.x && tA.y == tE.y){
                System.out.println("You Lose...");
                System.exit(0);
            }

        }

    }
}
