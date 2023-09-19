public class TreeMultiSet<T> implements MultiSet<T> {
    private Tree<T> tree;
    TreeMultiSet() {
        tree = new Tree<T>(null);
    }
    public boolean add(T item) {
        tree.insert(item);
        return true;
    }

    public void remove(T item) {
        tree.delete_item(item);
    }

    public boolean contains(T item) {
        return tree.__contains__(item);
    }

    public boolean is_empty() {
        return tree.is_empty();
    }

    public int count(T item) {
        return tree.count(item);
    }

    public int size() {
        return tree.__len__();
    }
}
