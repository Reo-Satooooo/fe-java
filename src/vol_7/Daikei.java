package vol_7;

public class Daikei {
    float t;// 上底
    float b;// 下底
    float h;// 高さ

    Daikei(float t, float b, float h){
        this.t = t;
        this.b = b;
        this.h = h;
    }

    float menseki(){
        float area;
        area = (t + b) * h * 0.5f;
        return area;
    }

    void view(){
        System.out.println("上底：" + t);
        System.out.println("下底：" + b);
        System.out.println("高さ：" + h);
        System.out.println("面積：" + menseki());
    }
}
