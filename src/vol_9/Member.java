package vol_9;

public class Member {

    private String gakuseki;
    private String shimei;

    public Member(String gakuseki, String shimei){
        this.gakuseki = gakuseki;
        this.shimei = shimei;
    }

    public void print(){
        System.out.println("学籍番号："+gakuseki+"、氏名："+shimei);
    }

}
