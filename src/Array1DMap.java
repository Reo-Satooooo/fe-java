import java.util.Scanner;

public class Array1DMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        int x = 2;

        while (true){
            for (int i=0; i<array.length; i++){
                if (i == x){
                    array[i] = 1;
                }
                else {
                    array[i] = 0;
                }
                System.out.println(array[i] + "");
            }
            System.out.println("どちらに移動する？");

            String key = scanner.nextLine();
            switch (key){
                case "a":
                    if(x <= 0){
                        System.out.println("左に移動できません。再入力してください");
                        break;
                    }
                    x = x - 1;
                    System.out.println("左に移動");
                    break;
                case "d":
                    if(x >= 4){
                        System.out.println("右に移動できません。再入力してください");
                        break;
                    }
                    x = x + 1;
                    System.out.println("右に移動");
                    break;
                case "q":
                    System.out.println("終了");
                    System.exit(0);
            }
        }
    }
}
