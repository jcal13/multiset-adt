import java.util.*;
public class Tree<T> {
    private T root;
    private List<Tree> subtrees;

    public Tree(T root) {
        this(root, null);
    }

    public Tree(T root, List<Tree> subtrees) {
        this.root = root;
        if (root == null) {
            this.subtrees = null;
        }
        else {
            this.subtrees = subtrees;
        }
    }

    public Tree len()
}
