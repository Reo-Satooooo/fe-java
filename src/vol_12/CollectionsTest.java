package vol_12;

import vol_5.Comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsTest {

    public static void main(String[] args) {
        // 要素の長さを自由に変化できるArrayList型のintsインスタンスを準備する
        // Integerは、整数を参照側として扱うためのクラス
        ArrayList<Integer> inList = new ArrayList<>();

        // ArrayListクラスのaddメソッドで、inListインスタンスに整数の要素を追加する
        inList.add(8);
        inList.add(9);
        inList.add(5);
        inList.add(6);

        // ArrayListクラスのgetメソッドでinListのうち2番目の要素を取り出す
        int n1 = inList.get(2);
        System.out.println("n1=" + n1);

        // Collectionsクラスのshuffleクラスメソッドで、intListの要素をランダム順に並べ替える
        Collections.shuffle(inList);

        // ArrayListクラスのgetメソッドで、ランダム順に並び替えたinListのうち2番目の要素を取り出す
        int n2 = inList.get(2);
        System.out.println("n2=" + n2);

    }

}
