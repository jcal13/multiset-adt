public class Tree {
    private Integer root;
    private Tree[] subtrees;

    public Tree (Integer root, Tree[] subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    public String printRoot() {
        return root.toString();
    }
}
