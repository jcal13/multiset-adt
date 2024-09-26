import java.util.ArrayList;
import java.lang.Object;

public class Tree {

    //root of the tree
    private Object root;
    // list of all subtrees
    private ArrayList<Tree> subtrees;

    public Tree(Object root, ArrayList<Tree> subtrees){
        this.root = root;
        this.subtrees = subtrees;
        if (subtrees.isEmpty()){
            this.subtrees = new ArrayList<>();
        }
        else {
            this.subtrees = subtrees;
        }
    }

    public boolean is_empty(){
        return this.root == null;
    }
}