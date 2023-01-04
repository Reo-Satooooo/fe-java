package vol_5;

import java.util.Scanner;

public class Kadai47 {
    public static void main(String[] args) {
        InputManager inputManager = new InputManager();
        inputManager.scan();
        Comparison comp = new Comparison();
        comp.getResult(inputManager.a, inputManager.b);
    }


}
