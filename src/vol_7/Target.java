package vol_7;

import java.util.Random;

public class Target {
    String label;
    int x;
    int y;

    Target(String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    void hidari(){
        if (x > 0){
            x--;
        }
    }

    void migi(){
        if (x < 4){
            x++;
        }
    }

    void ue(){
        if (y > 0){
            y--;
        }
    }

    void shita(){
        if (y < 4){
            y++;
        }
    }

    String getKey(){
        Random rand = new Random();
        int keyNum = rand.nextInt(4);
        switch (keyNum){
            case 0:
                return "w";
            case 1:
                return "a";
            case 2:
                return "d";
            case 3:
                return "s";
        }
        return "";
    }

    void move(String key){
        switch (key){
            case "w":
                ue();
                break;

            case "a":
                hidari();
                break;

            case "d":
                migi();
                break;

            case "s":
                shita();
                break;

            default:
                System.out.println("入力が無効です");
                break;
        }
    }
}
