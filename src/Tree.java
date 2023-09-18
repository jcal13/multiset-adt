import java.util.ArrayList;
import java.util.Optional;

public class Tree {
    Optional<Object> root;
    ArrayList<Tree> subtrees;

    public Tree(Optional<Object> root, ArrayList<Tree> subtrees){
        this.root = root;
        if(subtrees == null){
            this.subtrees = new ArrayList<Tree>();
        }else{
            this.subtrees = new ArrayList<Tree>(subtrees);
        }
    }
}
