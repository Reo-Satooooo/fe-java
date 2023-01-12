package vol_10;

public class Square extends Zukei{

    public Square(float tate, float yoko, float takasa){
        this.tate = tate;
        this.yoko = yoko;
        this.takasa = takasa;
    }

    @Override
    protected float calcMenseki(){
        float tate = this.tate;
        float yoko = this.yoko;
        float ans = tate * yoko;
        return ans;
    }
}
