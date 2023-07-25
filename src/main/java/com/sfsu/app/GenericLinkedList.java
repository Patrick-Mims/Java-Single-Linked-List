package com.sfsu.app;

public class GenericLinkedList<T> {
    private static class Node<T> {
        private final T data;
        private final Node<T> link;

        public Node() {
            data = null;
            link = null;
        }

        public Node(T newData, Node<T> linkValue) {
            data = newData;
            link = linkValue;
        }
    }

    private Node<T> head;

    public GenericLinkedList() {
        head = null;
    }

    /*
     * Add a node at the start of the list with the specified data.
     * The added node with be the first node in the list.
     * */
    public void createHead(T item) {
        head = new Node<T> (item, head);
    }

    public int size() {
        int count = 0;

        Node<T> position = head;

        while(position != null)
        {
            count++;
            position = position.link;
        }

        return count;
    }
}