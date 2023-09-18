public class Tree {
    private Object[] root;
    private Tree[] subtrees;

    Tree(Object[] root, Tree[] subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }
}
