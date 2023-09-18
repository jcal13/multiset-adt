import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {


    }

    public void profileMultiSet(MultiSet my_input, int n){
        ArrayList<Integer> items_added = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i<n; i++){
            int x = rand.nextInt(101);
            my_input.add(x);
            items_added.add(x);
        }
        assert my_input.size == n;
        long start = System.currentTimeMillis();
        for (int x: items_added){
            items_added.remove(x);
        }
        long end = System.currentTimeMillis();

        assert items_added.isEmpty();
        System.out.println("too lazy for now, will fix later" + "time: " + (start - end));

    }
}
