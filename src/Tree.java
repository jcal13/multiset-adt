import java.util.Collections;
import java.util.List;

public class Tree {
    private Object _root;
    private List<Tree> _subtrees;

    public Tree(Object root, Object subtrees) {
        this._root = root;
        if (subtrees == null) {
            this._subtrees = Collections.emptyList();

            }
        }
    }

