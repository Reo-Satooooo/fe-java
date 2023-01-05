package vol_8;

public class Kadai84 {
    public static void main(String[] args) {
        ExamResult r1 = new ExamResult("Hikari", 79);
        String kekka1 = r1.decide(80);
        System.out.println(kekka1);

        r1.setPoint(81);
        String kekka2 = r1.decide(80);
        System.out.println(kekka2);
    }
}
