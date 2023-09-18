import java.util.ArrayList;

public class Tree {

    private Object root;
    private ArrayList<Tree> subtrees;


    public Tree(Object root, Object subtrees) {
    this.root = root;
    if (subtrees == null) {
        this.subtrees = new ArrayList<Tree>();
    }
    else {
        this.subtrees = new ArrayList<Tree>(subtrees); // idk how to do this aaaa
    }
    }

public boolean is_empty() {
    return false;
}

}
