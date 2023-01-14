package vol_11;

import java.io.IOException;

public class KadaiA4 {

    public static void main(String[] args) {
        try {
            FileManager fileManager = new FileManager("messages.txt");
            String[] lines = fileManager.getAsArray();
            System.out.println(lines[0]);
            System.out.println(lines[1]);
            System.out.println(lines[2]);

        }
        catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入れてください。");
        }
        catch (IOException e2){
            System.out.println("ファイルを読み込めません。");
        }
        System.out.println("終了");
    }

}
