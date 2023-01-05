package vol_6;

import java.util.Scanner;

public class Kadai57 {
    public static void main(String[] args) {
        TriangleFinder triangleFinder = new TriangleFinder();
        triangleFinder.triangles = new Triangle[3];

        for (int i=0; i<3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("x = ");
            float x = input.nextFloat();
            System.out.println("y = ");
            float y = input.nextFloat();
            System.out.println("z = ");
            float z = input.nextFloat();

            Triangle t =  new Triangle();
            t.tate = x;
            t.yoko = y;
            t.takasa = z;

            triangleFinder.triangles[i] = t;
        }
        triangleFinder.findMaxMenseki();
        triangleFinder.findMaxTaiseki();
    }
}
