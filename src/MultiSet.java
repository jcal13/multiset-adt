/**
 * This interface represent the MulstiSet ADT, which supports
 * add, remove, is_empty, count, and contains operations.
 * */
public interface MultiSet<T> {

    /**
     * Retrieves data from the data source.
     *
     * @param item The item to be added to the list.
     * @return A boolean value of whether an item was added or not.
     * @since 1.0
     */
    boolean add(T item);

    /**
     * Removes the given item from the MultiSet
     *
     * @param item The item to be remove from the list.
     * @return A boolean value of whether an item was added or not.
     * @since 1.0
     */
    void remove(T item);

    /**
     * Checks whether the given item is in the MultiSet
     *
     * @param item The item which we are looking for.
     * @return A boolean value of whether the MultiSet contains the item.
     * @since 1.0
     */
    boolean contains(T item);

    /**
     * Returns whether the MultiSet is emtpy or not.
     *
     * @return A boolean value of whether the MultiSet is empty or not.
     * @since 1.0
     */
    boolean is_empty();

    /**
     * Retrieves the number of the given item present in the MultiSet.
     *
     * @param item The item to be counted.
     * @return An integer number of how many instances of item are present in the MultiSet
     * @since 1.0
     */
    int count(T item);

    /**
     * Returns the size of the MultiSet (Number of elements).
     *
     * @return An integer value of the size of the MultiSet.
     * @since 1.0
     */
    int size();
}
