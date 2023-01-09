package vol_9;

public class Member {

    private String gakuseki;
    private String shimei;
    private String komon;

    public Member(String gakuseki, String shimei){
        this.gakuseki = gakuseki;
        this.shimei = shimei;
    }

    public Member(String komon){
        this.komon = komon;
    }

    public void print(){
        System.out.println("学籍番号："+gakuseki+"、氏名："+shimei);
    }

    public String getGakuseki(){
        return gakuseki;
    }

}
