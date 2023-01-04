package vol_5;

import java.util.Scanner;

public class InputManager {
    public int a;
    public int b;

    void scan(){
        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        this.a = input.nextInt();
        System.out.println("b = ");
        this.b = input.nextInt();
    }
}
