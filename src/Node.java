public class Node<T> {
    public T item;
    public Node<T> next;
    Node(T item) {
        this.item = item;
        next = null;
    }
}
