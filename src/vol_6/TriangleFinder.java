package vol_6;

public class TriangleFinder {
    Triangle[] triangles;

    public void findMaxMenseki(){
        float maxMenseki = 0;
        int indexMax = 0;
        int i = 0;
        for (Triangle item : triangles){
            if (maxMenseki < item.menseki()){
                maxMenseki = item.menseki();
                indexMax = i;
            }
            i++;
        }
        System.out.println("最も面積が大きいインスタンスの配列番号は " + indexMax + " 面積は " + maxMenseki);
    }

    public void findMaxTaiseki(){
        float maxTaiseki = 0;
        int indexMax = 0;
        int i = 0;
        for (Triangle item : triangles){
            if (maxTaiseki < item.taiseki()){
                maxTaiseki = item.taiseki();
                indexMax = i;
            }
            i++;
        }
        System.out.println("最も体積が大きいインスタンスの配列番号は " + indexMax + " 体積は " + maxTaiseki);
    }
}
