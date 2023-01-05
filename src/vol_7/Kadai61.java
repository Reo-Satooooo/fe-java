package vol_7;

public class Kadai61 {
    String code;
    String name;

    Kadai61(String code, String name){
        this.code = code;
        this.name = name;
    }

    void view(){
        System.out.println("学籍番号：" + this.code + " 氏名：" + this.name);
    }
}
