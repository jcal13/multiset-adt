import java.util.*;

public interface MultiSet<E> {
    /**
     * Adds the specified item to this multiset.
     *
     * @param item item to be added
     * @return true if the item was added successfully, false otherwise
     */
    boolean add(E item);

    /**
     * Removes the specified item from this multiset.
     *
     * @param item item to be removed
     */
    void remove(E item);

    /**
     * Returns true if this multiset contains the specified item.
     *
     * @param item item whose presence in this multiset is to be tested
     * @return true if this multiset contains the specified item
     */
    boolean contains(E item);

    /**
     * Returns true if this multiset contains no items.
     *
     * @return true if this multiset contains no items
     */
    boolean isEmpty();

    /**
     * Returns the count of the specified item in this multiset.
     *
     * @param item item whose count is to be returned
     * @return the count of the specified item in this multiset
     */
    int count(E item);

    /**
     * Returns the number of items in this multiset.
     *
     * @return the number of items in this multiset
     */
    int size();
}

