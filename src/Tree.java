import java.util.ArrayList;

public class Tree<T> implements MultiSet<T>{
    private Tree<T> root;
    private ArrayList<Object> subtrees;

    public Tree(){
        this.root = null;
        this.subtrees = new ArrayList<>();
    }

    public Tree(Tree<T> root, ArrayList<Object> subtrees){
        this.root = root;
        this.subtrees = (ArrayList<Object>)subtrees.clone();
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
