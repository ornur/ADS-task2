package org.example;

public class MyArrayList {
    /*
    Define a private instance variable of type Object[] to hold the elements of the list.
    Define an int variable called size to keep track of the number of elements in the list.
    Implement the add(E element) method by first checking if the size of the array is large enough to accommodate the new element. If it is not, create a new array with double the size of the original array, copy over the elements from the original array, and then add the new element. Otherwise, simply add the new element to the end of the array and increment the size variable.
    Implement the get(int index) method by returning the element at the specified index.
    Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.
    Implement the size() method by returning the size variable.
    Implement any other methods specified by the List interface.
    Test all methods of MyArrayList
     */
    private Object[] hiddenArr;
    private int size;

    public void add(Object element) {
        if (size == hiddenArr.length) {
            Object[] newArr = new Object[hiddenArr.length * 2];
            for (int i = 0; i < hiddenArr.length; i++) {
                newArr[i] = hiddenArr[i];
            }
            hiddenArr = newArr;
        }
        hiddenArr[size] = element;
        size++;
    }
    //Implement the get(int index) method by returning the element at the specified index.
    public Object get(int index) {
        return hiddenArr[index];
    }
    //Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            hiddenArr[i] = hiddenArr[i + 1];
        }
        size--;
    }
}
