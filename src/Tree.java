import java.util.ArrayList;

public class Tree {
    private Object root;
    private ArrayList<Tree> subtrees;

    Tree(Object root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int length() {
        if (this.isEmpty()) {
            return 0;
        }
        else {
            return 1; // this is not right
        }
    }
}
