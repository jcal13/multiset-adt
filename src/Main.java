import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Main
{

    public static void profileMultiSet(MultiSet<Integer> myInput, int n)
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

        for (int i: itemsAdded)
        {
            myInput.remove(i);
        }

        end = System.currentTimeMillis();

        assert myInput.isEmpty();

        System.out.print(String.format("%5d", n)
                + String.format("%1$26s", myInput.getClass())
                + "  "
                + String.format("%6f%n", (end - start)/1000.0));
    }

    public static void main(String[] args)
    {
        Integer[] numArray = {500, 1000, 2000, 4000};
        List<MultiSet<Integer>> multisets = Arrays.asList(
                new TreeMultiSet<>(),
                new ArrayListMultiSet<>(),
                new LinkedListMultiSet<>());

        for (MultiSet<Integer> multiset: multisets)
        {
            for (int n: numArray)
            {
                profileMultiSet(multiset, n);
            }
        }
    }
}
