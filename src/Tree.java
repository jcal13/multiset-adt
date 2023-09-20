import java.util.ArrayList;
import java.util.*;

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
        return this._str_indented();
    }


    private String _str_indented(int depth){
        if (this.isEmpty()) {
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
        if (this.isEmpty()){
            return "";
        } else {
            StringBuilder s = new StringBuilder((String) this.root + "\n");
            for (Tree<T> subtree : this.subtrees){
                s.append(subtree._str_indented(1));
            }
            return s.toString();
        }
    }