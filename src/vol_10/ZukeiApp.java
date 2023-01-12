package vol_10;

import java.util.Scanner;

public class ZukeiApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("縦：");
        float tate = input.nextFloat();
        System.out.print("横：");
        float yoko = input.nextFloat();
        System.out.print("高さ：");
        float takasa = input.nextFloat();

        Square square = new Square(tate,yoko,takasa);
        square.print();

        Triangle triangle = new Triangle(tate,yoko,takasa);
        triangle.print();
    }

}
