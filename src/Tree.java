import java.util;
import java.util.ArrayList;

public class Tree {
    private Object root;
    private ArrayList<Tree> subtrees;

    Tree(Object root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }
}
