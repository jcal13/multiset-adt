import java.util.ArrayList;
import java.util.Random;

public class Main
{

    public static void profileMultiSet(MultiSet myInput, int n)
    {
        long start;
        long end;
        int x;
        Random rng = new Random();
        ArrayList<Integer> itemsAdded = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
        {
            x = rng.nextInt(101);
            myInput.add(x);
            itemsAdded.add(x);
        }

        assert myInput.getSize() == n;

        start = System.currentTimeMillis();

        for (int x: itemsAdded)
        {
            myInput.remove(x);
        }

        end = System.currentTimeMillis();

        assert myInput.isEmpty();

        System.out.println(String.format("%5d", n)
                + String.format("%37d", myInput.getClass())
                + String.format("%.6f%n", end - start));
    }

    public static void main(String[] args)
    {
        Integer[] numArray = {500, 1000, 2000, 4000};
        MultiSet[] multisets = {new TreeMultiSet<Integer>(),
                new ArrayListMultiSet<Integer>(),
                new LinkedListMultiSet<Integer>()};

        for (MultiSet multiset: multisets)
        {
            for (int n: numArray)
            {
                profileMultiSet(multiset, n);
            }
        }
    }
}
