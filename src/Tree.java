import java.sql.Array;
import java.util.*;


public class Tree<T extends Comparable<T>>{
    private T root;
    private ArrayList<Tree<T>> subtrees;


    public Tree(T root, ArrayList<Tree<T>> subtrees){
        if (root == null){
            this.subtrees = new ArrayList<>();
        } else {
            this.root = root;
            this.subtrees = subtrees;
        }
    }


    public int count(T item){
        if (this.root == null){
            return 0;
        } else {
            int counter = 0;
            if (this.root.equals(item)){
                counter++;
            }
            for (Tree<T> subtree : subtrees){
                counter += subtree.count(item);
            }
            return counter;
        }
    }


    public String __str__(){
        return this.str_indented();
    }


    private String _str_indented(int depth){
        if (this.is_empty()) {
            return "";
        } else {
            StringBuilder s = new StringBuilder(' ' * depth + (String) this.root + "\n");
            for (Tree<T> subtree : this.subtrees){
                s.append(subtree._str_indented(depth + 1));
            }
            return s.toString();
        }
    }
    private String _str_indented(){
        if (this.is_empty()){
            return "";
        } else {
            StringBuilder s = new StringBuilder((String) this.root + "\n");
            for (Tree<T> subtree : this.subtrees){
                s.append(subtree._str_indented(1));
            }
            return s.toString();
        }
    }


}
