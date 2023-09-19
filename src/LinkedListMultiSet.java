public class LinkedListMultiSet<T> extends MultiSet<T>
{
    private Node front;
    private int size;

    public LinkedListMultiSet()
    {
        super();
        front = null;
        size = 0;
    }


    @Override
    public boolean add(T item)
    {
        Node newNode = new Node(item);
        newNode.next = front;
        front = newNode;
        size++;
        return true;
    }

    @Override
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

    @Override
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

    @Override
    public boolean isEmpty() { return front == null; }

    @Override
    public Integer count(Object item)
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

    @Override
    public Integer getSize() { return size; }

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