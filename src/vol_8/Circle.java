package vol_8;

public class Circle {
    private float r;

    public Circle(){
        this.r = 1.0f;
    }

    public void setR(float r){
        this.r = r;
    }

    public void ensyu(){
        float length;
        length = r * 2.0f * 3.14f;
        System.out.println("円周の長さは" + length);
    }

    public void menseki(){
        float area;
        area = r * r * 3.14f;
        System.out.println("円の面積は" + area);
    }

}
