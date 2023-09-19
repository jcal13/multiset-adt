public class TreeMultiSet<T> implements MultiSet<T> {

    private Tree tree;

    public TreeMultiSet() {
        tree = new Tree(null, null);
    }

    public boolean add(T item) {
        tree.insert(item);
        return true;
    }

    public void remove(T item) {
        tree.deleteItem(item);
    }

    public boolean contains(T item) {
        return tree.contains(item);
    }

    public boolean isEmpty() {
        return tree.is_empty();
    }

    public int count(T item) {
        return tree.count(item);
    }

    public int size() {
        return tree.size();
    }

}
