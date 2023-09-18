import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMultiSet implements MultiSet {

    private ArrayList list;

    ArrayListMultiSet() {
        list = new ArrayList<>();
    }

    @Override
    public boolean add(Object item) {
        list.add(item);
        return true;
    }

    @Override
    public void remove(Object item) {
        if (list.contains(item)) list.remove(item);
    }

    @Override
    public boolean contains(Object item) {
        return list.contains(item);
    }

    @Override
    public boolean is_empty() {
        return list.size() == 0;
    }

    @Override
    public int count(Object item) {
        return Collections.frequency(list, item);
    }

    @Override
    public int size() {
        return list.size();
    }
}
