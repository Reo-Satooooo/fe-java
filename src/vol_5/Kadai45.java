package vol_5;

import java.util.Scanner;

public class Kadai45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("a = ");
        int a = input.nextInt();
        System.out.println("b = ");
        int b = input.nextInt();

        Comparison comp = new Comparison();

        comp.getResult(a,b);
    }


}
