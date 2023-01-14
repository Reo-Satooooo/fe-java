package vol_11;

import java.io.IOException;
import java.util.List;

public class KadaiA5 {

    public static void main(String[] args) {
        try {
            FileManager fileManager = new FileManager("students.txt");
//            String[] lines = fileManager.getAsArray();
            List<String> lines= fileManager.getAsList();
            for (String line : lines){
                try {
                    Student student = new Student(line);
                    student.print();
                }
                catch (RuntimeException e){
                    System.out.println("不正なインスタンス");
                }

            }

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
