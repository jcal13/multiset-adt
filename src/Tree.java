public class Tree {
    private int root;
    private Tree[] subtree;
    public Tree(int root, Tree[] subtree){
        this.root = root;
        this.subtree = subtree;
    }
    public Tree(int root){
        this.root = root;
        this.subtree = new Tree[]{};
    }

}
