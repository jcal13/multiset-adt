public class TreeMultiSet<T> implements MultiSet<T> {
    private static Tree _tree;
    public boolean add(T item){
        TreeMultiSet._tree.insert(item);
    }
}
