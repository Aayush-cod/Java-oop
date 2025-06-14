import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(10);
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        array1.add(6);
        array1.add(7);
        array1.add(8);
        array1.add(9);
        array1.add(10);
        // Collections.sort(array1);
        // System.out.println("Ascending "+ array1);

        Collections.sort(array1, Collections.reverseOrder());
        System.out.println("Descending "+ array1);

        for(int i: array1){
            System.out.println(i);
        }

    }
    
}
