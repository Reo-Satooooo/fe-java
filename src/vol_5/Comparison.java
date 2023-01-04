package vol_5;

public class Comparison {

    int getMax(int a, int b){
        if (a >= b){
            return a;
        }
        return b;
    }

    int getMin(int a, int b){
        if(a <= b){
            return a;
        }
        return b;
    }

    void getResult(int a, int b){
        int x = this.getMax(a,b);
        int y = this.getMin(a,b);
        System.out.println("大きいのは" + x);
        System.out.println("小さいのは" + y);
    }

}
