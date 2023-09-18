import java.util.ArrayList;

public class Tree implements MultisetADT {
    private int root;
    private ArrayList<Tree> subtrees;

    public Tree(int root, ArrayList<Tree> subtrees) {
        this.root = root;

        if (subtrees.isEmpty()) {
            this.subtrees = null;
        }
        else {
            this.subtrees = subtrees;
        }
    }


    @Override
    public boolean add(Object item) {
        return false;
    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public int count(Object item) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}