public interface MultiSet<T> {

    public abstract boolean add(T item);

    public abstract void remove(T item);

    public abstract boolean contains(T item);

    public abstract boolean isEmpty();

    public abstract int count(T item);

    public abstract int size();

}
