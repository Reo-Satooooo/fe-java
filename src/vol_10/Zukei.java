package vol_10;

public class Zukei {

    protected float tate;
    protected float yoko;
    protected float takasa;

    protected float calcMenseki(){
        return 0.0f;
    }

    protected float calcTaiseki(){
        float ans = takasa * calcMenseki();
        return ans;
    }

    public void print(){
        float ansMenseki = calcMenseki();
        float ansTaiseki = calcTaiseki();
        System.out.println("面積：" + ansMenseki);
        System.out.println("体積：" + ansTaiseki);
    }

}
