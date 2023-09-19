public interface MultiSet<T> {

    public boolean add(T item);

    public void remove(T item);

    public boolean contains(T item);

    public boolean is_empty();

    public int count(T item);

    public int size();

}
