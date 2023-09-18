import java.util.ArrayList;

public class Tree {

    /**
     * A recursive tree data structure, which provides services required of the
     * MultiSet ADT. See TreeMultiSet, which is the next class defined.
     * This is a simplified version of the Tree data structure
     * adapted from CSC148.
     */

    // The item stored at this tree's root, or null if empty.
    private Object root = null;
    // The list of all subtrees of this tree.
    private ArrayList<Tree> subtrees;

    public Tree(Object root, ArrayList<Tree> subtrees) {
        this.root = root;
        if (root == null) {
            this.subtrees = new ArrayList<>();
        } else this.subtrees = new ArrayList<>(subtrees);
    }
}
