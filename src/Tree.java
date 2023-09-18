import java.util.List;
import java.util.Optional;

import static java.util.Collections.emptyList;

public class Tree {

    private Optional root;
    private List<Tree> subtrees;
    public Tree(Optional root1, List<Tree> sub1){

        root = root1;
        if (subtrees.equals(null)){
            subtrees = emptyList();
        }
        else{
            subtrees = sub1;
        }


    }

}
