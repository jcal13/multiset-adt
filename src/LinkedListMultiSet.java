public class LinkedListMultiSet {
    // the main body for the LinkedListMultiSet class still needs to be implemented

    // the Node class is meant to only be used by the LinkedListMultiSet class so I made it private and nested
    // if anyone knows another way to do this can you show me/
    private class Node {
        private Object item;
        private Node next;
        public Node(Object item) {
            this.item = item;
            this.next = null;

        }
    }
}
