public interface MultiSet {
    /*An abstract class representing the MultiSet ADT, which supports the
    add, remove, is_empty, count, and contains operations.

    This class itself does not handle how the underlying data is stored,
    so it just inherits Object.__init__.*/

    public boolean add(Object item);
    public void remove(Object item);
    public boolean contains(Object item);
    public boolean is_empty();
    public int count(Object item);
    public int size();
}
