public class Tree<T>{
    T root;
    Tree<T>[] subtrees;
    Tree(T root) {

    }

    Tree(T root, Tree<T>[] subtrees) {

    }

    public boolean is_empty() {
        return false;
    }

    public int __len__() {
        return 0;
    }

    public int count(T item) {
        return 0;
    }

    public String __str__() {
        return "";
    }

    public boolean __contains__(T item) {
        return false;
    }

    //Mutating

    public boolean delete_item(T item) {
        return false;
    }

    public void insert(T item) {

    }
}
