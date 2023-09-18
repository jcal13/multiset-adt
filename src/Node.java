public class Node<T> {
    public T item;
    public Node<T> next;

    public Node(T item) {
        this.item = item;
        this.next = null;
    }
}