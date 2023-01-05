package vol_6;

public class Triangle {
    float tate;
    float yoko;
    float takasa;

    float menseki(){
        return this.tate * this.yoko * 0.5f;
    }

    float taiseki(){
        return this.tate * this.yoko * 0.5f * this.takasa;
    }
}
