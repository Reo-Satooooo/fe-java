package vol_5;

import java.util.Scanner;

public class Kadai48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n = ");
        int n = input.nextInt();
        Hantei hantei = new Hantei();

        System.out.println(n + " は " + hantei.evenOrOdd(n));

    }
}
