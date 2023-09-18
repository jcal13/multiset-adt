public class LinkedListMultiSet<T>
{
    private Node front;
    private int size;

    public LinkedListMultiSet()
    {
        front = null;
        size = 0;
    }

    public boolean add(T item)
    {
        Node newNode = new Node(item);
        newNode.next = front;
        front = newNode;
        size++;
        return true;
    }

    public void remove(T item)
    {
        Node cur = front;
        Node prev = null;

        while (cur != null)
        {
            if (cur.item == item)
            {
                size--;

                if(prev != null)
                {
                    prev.next = cur.next;
                }
                else
                {
                    front = cur.next;
                }

                return;
            }

            prev = cur;
            cur = cur.next;
        }
    }

    public boolean contains(T item)
    {
        Node cur = front;

        while (cur != null)
        {
            if (cur.item == item)
            {
                return true;
            }

            cur = cur.next;
        }

        return false;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public int count(T item)
    {
        int numSeen = 0;
        Node cur = front;

        while (cur != null)
        {
            if (cur.item == item)
            {
                numSeen++;
            }

            cur = cur.next;
        }

        return numSeen;
    }

    public int getSize()
    {
        return size;
    }

    private class Node
    {
        public T item;
        public Node next;

        public Node (T item)
        {
            this.item = item;
            next = null;
        }
    }
}