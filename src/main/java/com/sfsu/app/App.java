package com.sfsu.app;

public class App {
    public static void main( String[] args ) {

        System.out.println( "Single LinkedList" );

        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.insertBeginning("Nvidia", 2);
        singleLinkedList.insertBeginning("Oracle", 3);
        singleLinkedList.insertBeginning("Microsoft", 1);

        singleLinkedList.displayList();

        System.out.println("Count: " + singleLinkedList.size());
    }
}