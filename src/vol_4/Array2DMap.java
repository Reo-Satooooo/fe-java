package vol_4;

import java.util.Scanner;

public class Array2DMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[5][5];

        int locationX = 0;
        int locationY = 0;
        array[locationY][locationX] = 1;

        while (true){
            for (int y=0; y<array.length; y++){
                for (int x=0; x<array[y].length; x++){
                    if (locationX == x  && locationY == y){
                        array[y][x] = 1;
                    }
                    else {
                        array[y][x] = 0;
                    }
                    System.out.print(array[y][x] + " ");
                }
                System.out.println("");
            }
            System.out.println("どちらに移動する？");

            String key = scanner.next();

            switch (key){
                case "a":
                    if(locationX <= 0){
                        System.out.println("左に移動できません。再入力してください");
                        break;
                    }
                    locationX = locationX - 1;
                    System.out.println("左に移動");
                    break;
                case "d":
                    if(locationX >= 4){
                        System.out.println("右に移動できません。再入力してください");
                        break;
                    }
                    locationX = locationX + 1;
                    System.out.println("右に移動");
                    break;
                case "w":
                    if(locationY <= 0){
                        System.out.println("上に移動できません。再入力してください");
                        break;
                    }
                    locationY = locationY - 1;
                    System.out.println("上に移動");
                    break;
                case "s":
                    if(locationY >= 4){
                        System.out.println("下に移動できません。再入力してください");
                        break;
                    }
                    locationY = locationY + 1;
                    System.out.println("下に移動");
                    break;
                case "q":
                    System.out.println("終了");
                    System.exit(0);
            }

        }

    }
}
