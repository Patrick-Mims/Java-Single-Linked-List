package com.sfsu.app;

public class SingleLinkedList {

    private static class Node {
       String item;
       Node node;

       public Node() {
          this.node = null;
          this.item = null;
       }
       public Node(Node newNode, String newItem) {
            this.item = newItem;
            this.node = newNode;
        }
    }

    private Node head;

    SingleLinkedList() {
        head = null;
    }

    public void insertBeginning(String item, int count) {
        head = new Node(head, item);
    }

    public void displayList() {

        Node position = head;

        while(position != null) {
            System.out.println("Company => " + position.item);
            position = position.node;
        }
    }

    public boolean deleteNode() {
       if(head != null)
       {
           head = head.node;
           return true;
       }

       return false;
    }

    public int size() {
        int count = 0;

        Node position = head;

        while(position != null)
        {
            count++;
            position = position.node;
        }

        return count;
    }

    public boolean contains(String item) {
       return (find(item) != null);
    }

    private Node find(String target)
    {
        Node position = head;

        String itemAtPosition;

        while(position != null) {
            itemAtPosition = position.item;

            if(itemAtPosition.equals(target))
                return position;

            position = position.node;
        }

        return null;
    }
}