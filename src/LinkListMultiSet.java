public class LinkListMultiSet<T> implements MultiSet<T>{
    private Node<T> front;
    private int size;
    LinkListMultiSet() {
        front = null;
        size = 0;
    }

    public boolean add(T item) {
        Node<T> new_node = new Node<T>(item);
        new_node.next = front;
        front = new_node;
        size += 1;
        return true;
    }

    public void remove(T item) {
        Node<T> cur = front;
        Node<T> prev = null;
        while (cur != null) {
            if (cur.item == item) {
                size -= 1;
                if (prev != null) {
                    prev.next = cur.next;
                } else {
                    front = cur.next;
                }
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }

    public boolean contains(T item) {
        Node<T> cur = front;
        while (cur != null) {
            if (cur.item == item) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public boolean is_empty() {
        return front == null;
    }

    public int count(T item) {
        int num_seen = 0;
        Node<T> cur = front;
        while (cur != null) {
            if (cur.item == item) {
                num_seen ++;
            }
            cur = cur.next;
        }
        return num_seen;
    }

    public int size() {
        return size;
    }
}
