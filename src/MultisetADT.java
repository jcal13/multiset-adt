public interface MultisetADT {
    public boolean add(Object item);
    public void remove(Object item);
    public boolean contains(Object item);
    public boolean is_empty();
    public int count(Object item);
    public int size();

}
