public class ArrayListMultiSet<T> implements MultiSet<T> {

    private Node front;

    private int size;

    public ArrayListMultiSet() {
        this.front = null;
        this.size = 0;
    }

    public boolean add(T item) {
        Node newNode = new Node(item);
        newNode.next = front;
        front = newNode;
        size += 1;
        return true;
    }

    public void remove(T item) {
        Node curr = front;
        Node prev = null;

        while (curr != null) {
            if (curr.item == item) {
                size -= 1;
                if (prev != null) {
                    prev.next = curr.next;
                }
                else {
                    front = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        return;

    }

    public boolean contains(T item) {
        Node curr = front;

        while (curr != null) {
            if (curr.item == item) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int count(T item) {
        int numSeen = 0;
        Node curr = front;
        while (curr != null) {
            if (curr.item == item) {
                numSeen += 1;
            }
            curr = curr.next;
        }
        return numSeen;
    }

    public int size() {
        return size;
    }

}
