package org.example;

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
public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
        transient Object [] arr;
        int size;
        public MyArrayList() {
            arr = new Object[10];
            size = 0;
        }
        public int size() {
            return size;
        }
        public boolean contains(Object o) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == o) {
                    return true;
                }
            }
            return false;
        }
        public void add(T item) {
            if (size == arr.length) {
                Object [] newArr = (T[]) new Object[arr.length * 2];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            arr[size] = item;
            size++;
        }
        public void add(T item, int index) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            if (size == arr.length) {
                Object [] newArr = (T[]) new Object[arr.length * 2];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = item;
            size++;
        }
        public boolean remove(T item) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == item) {
                    for (int j = i; j < size - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    size--;
                    return true;
                }
            }
            return false;
        }
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            return (T) arr[index];
        }
        public T remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            T item = (T) arr[index];
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            return item;
        }
        public void clear() {
            size = 0;
        }
        public int indexOf(Object o) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == o) {
                    return i;
                }
            }
            return -1;
        }
        public int lastIndexOf(Object o) {
            for (int i = size - 1; i >= 0; i--) {
                if (arr[i] == o) {
                    return i;
                }
            }
            return -1;
        }
        public void sort() {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (((T) arr[j]).compareTo((T) arr[j + 1]) > 0) {
                        T temp = (T) arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder str = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                str.append(arr[i]).append(", ");
            }
            if (str.length() > 1) {
                str = new StringBuilder(str.substring(0, str.length() - 2));
            }
            str.append("]");
            return str.toString();
        }
}