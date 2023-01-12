package vol_10;

public class Triangle extends Zukei{

    public Triangle(float tate, float yoko, float takasa){
        this.tate = tate;
        this.yoko = yoko;
        this.takasa = takasa;
    }

    @Override
    protected float calcMenseki(){
        float tate = this.tate;
        float yoko = this.yoko;
        float ans = tate * yoko * 0.5f;
        return ans;
    }

}
