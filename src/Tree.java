import java.util.ArrayList;

public class Tree<T> implements MultiSet<T>{
    private Tree<T> root;
    private ArrayList<Tree<T>> subtrees;

    public Tree(){
        root = null;
        subtrees = new ArrayList<>();
    }

    @Override
    public boolean add(T item) {
        return false;
    }

    @Override
    public void remove(T item) {

    }

    @Override
    public boolean contains(T item) {
        return false;
    }

    @Override
    public boolean is_empty() {
        return false;
    }

    @Override
    public int count(T item) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
