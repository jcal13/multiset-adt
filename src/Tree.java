import java.util.ArrayList;

public class Tree {
    private Object root;
    private  ArrayList<Tree> subtree;

    public Tree( Object root, ArrayList<Tree> subtree){
        this.root = root;
        if (subtree == null){
            this.subtree = new Arraylist<Tree>();
        }
        else {
            this.subtree = subtree;
        }
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    public int len(){
        if (this.isEmpty()){
            return 0;
        }
        else{
            int size = 1;
            for(Tree i : this.subtree){
                size += i.len();
            }
            return size;
        }
    }


}
