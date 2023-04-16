package org.example;

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
public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{
    private class Node {
        T val;
        Node next;
        public Node(T val) {
            this.val = val;
            next = null;
        }
    }
    private Node head;
    public MyLinkedList() {
        head = null;
    }
    public int size(){
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.val == o) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void add(T item, int index) {
        Node newNode = new Node(item);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public boolean remove(T item) {
        if (head.val == item) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.val == item) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T remove(int index) {
        if (index == 0) {
            T temp = head.val;
            head = head.next;
            return temp;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        T temp = current.next.val;
        current.next = current.next.next;
        return temp;
    }
    public void clear() {
        head = null;
    }
    public T get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.val == o) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public int lastIndexOf(Object o) {
        Node current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.val == o) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }
    public void sort() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                if (compare(current.val, next.val) > 0) {
                    T temp = current.val;
                    current.val = next.val;
                    next.val = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    public static  <T extends Comparable<T>>int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.val);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}