package vol_9;

import java.util.Scanner;

public class Kadai96 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("部活名を入力");
        String clubName = input.next();
        Club club = new Club(clubName);
    }

}
