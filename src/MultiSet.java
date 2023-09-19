public abstract class MultiSet<T> {
    //    An abstract class representing the MultiSet ADT, which supports the
    //    add, remove, is_empty, count, and contains operations.
    //
    //    This class itself does not handle how the underlying data is stored,
    //    so it just inherits Object.__init__.

    public abstract boolean add(T item);
    public abstract void remove(T item);
    public abstract boolean contains(T item);
    public abstract boolean isEmpty ();
    public abstract Integer count(T item);
    public abstract Integer getSize();

}
