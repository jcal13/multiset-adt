import java.util.ArrayList;
import java.util.Optional;

public class Tree {

    /**
     * The person's name (family name last).
     */
    private Optional<Object> root;
    /**
     * The person's UTORid
     */
    ArrayList<Tree> subtrees;

    /**
     * Initialize this Person named name with UTORid utorid.
     *
     * @param root   the person's name (family name last)
     * @param subtrees the person's UTORid
     */
    Tree (Optional<Object> root, ArrayList<Tree> subtrees) {
        /** Initialize a new Tree with the given root value and subtrees.

         If <root> is None, the tree is empty.
         Precondition: if <root> is None, then <subtrees> is empty.
         */

        this.root = root;
        if (subtrees == null) {
            this.subtrees = new ArrayList<Tree>();

        } else {
            this.subtrees = new ArrayList<>(this.subtrees);

        }


    }


    Tree () {
        /** Initialize a new Tree with the given root value and subtrees.

         If <root> is None, the tree is empty.
         Precondition: if <root> is None, then <subtrees> is empty.
         */

        this.root = root;
        this.subtrees = new ArrayList<Tree>();

    }

    boolean isEmpty() {
        return this.root == null;
    }

    int size() {
        if (this.isEmpty()) {
            return 0;
        } else {
            int size = 1;
            for (Tree subtree : this.subtrees) {
                size += subtree.size();
            }
            return size;
        }


    }
}