import java.util.ArrayList;

public class Tree<T extends Comparable<T>> {

    private T root;
    private ArrayList<Tree<T>> subtrees;

    public Tree(T root, ArrayList<Tree<T>> subtrees) {
        if (root == null){
            this.subtrees = new ArrayList<>();
        }
        else{
            this.root = root;
            this.subtrees = subtrees;
        }
    }


    public boolean isEmpty(){
        /* Return whether this tree is empty.

        >>> t1 = Tree(None, [])
        >>> t1.is_empty()
        True
        >>> t2 = Tree(3, [])
        >>> t2.is_empty()
        False
        */
        return this.root == null;
    }

    public int size(){
        if (subtrees.isEmpty()){
            return 0;
        }
        else{
            int len = 1;
            for (Tree<T> subtree : subtrees){
                len += subtree.size();
            }
            return len;
        }
    }

//    public double avarage(){
//        if (subtrees.isEmpty()){
//            return 0.0
//        }
//        else{
//
//        }
//    }


}
