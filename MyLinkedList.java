package org.example;

import static sun.util.locale.LocaleUtils.isEmpty;

/*
        Create a new class called MyLinkedList that implements the List interface.
        Define a private inner class called Node that contains an element of type E and references to the next and previous nodes in the list.
        Define a private instance variable called head that references the first node in the list.
        Define a private instance variable called tail that references the last node in the list.
        Define an int variable called size to keep track of the number of elements in the list.
        Implement the add(E element) method by creating a new Node with the specified element, setting its next reference to null (since it will be the new tail), and its previous reference to the current tail. If the list is empty, set both the head and tail references to the new node. Otherwise, set the next reference of the current tail to the new node and update the tail reference to the new node. Finally, increment the size variable.
        Implement the get(int index) method by traversing the list from the head (or tail, depending on which is closer to the specified index) and returning the element at the specified index.
        Implement the remove(int index) method by first traversing the list to the node at the specified index. Then, update the next and previous references of the surrounding nodes to remove the node from the list, and decrement the size variable.
        Implement the size() method by returning the size variable.
        Implement any other methods specified by the List interface.
        Test all methods of MyLinkedList
*/
public class MyLinkedList implements MyList {
    //Define a private inner class called Node that contains an element of type E and references to the next and previous nodes in the list.
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private Object element;
        private Node next;
        private Node prev;
        public Node(Object element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    //Implement the add(E element) method by creating a new Node with the specified element,
    // setting its next reference to null (since it will be the new tail),
    // and its previous reference to the current tail. If the list is empty,
    // set both the head and tail references to the new node.
    // Otherwise, set the next reference of the current tail to the new node and
    // update the tail reference to the new node. Finally, increment the size variable.
    public void add(Object element) {
        Node newNode = new Node(element, null, tail);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    //Implement the get(int index) method by traversing the list from the head (or tail,
    // depending on which is closer to the specified index) and returning the element at the specified index.
    public Object get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }
    //Implement the remove(int index) method by first traversing the list to the node at the specified index. Then, update the next and previous references of the surrounding nodes to remove the node from the list, and decrement the size variable.
    public void remove(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }
    //Implement the size() method by returning the size variable.
    public int size() {
        return size;
    }
}
