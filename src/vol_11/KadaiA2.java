package vol_11;

public class KadaiA2 {

    public static void main(String[] args) {
        try{
            Gakuseki g1 = new Gakuseki("b2191040");
            g1.print();
            Gakuseki g2 = new Gakuseki(null);
            g2.print();
        }
        catch (RuntimeException e){
            System.out.println("学籍が設定されていないインスタンス");
        }
        System.out.println("終了");
    }
}
