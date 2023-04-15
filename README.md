# Assignment 2
<p>Classes MyArrayList and MyLinkedList, which are implementations of ArrayList and LinkedList respectively.<p>

## MyArrayList requirements:
  <ul>
    <li>Create a new class called MyArrayList that implements the MyList interface.</li>
    <li>Define a private instance variable of type Object[] to hold the elements of the list.</li>
    <li>Define an int variable called size to keep track of the number of elements in the list.</li>
    <li>Implement the add(E element) method by first checking if the size of the array is large enough to accommodate the new element. If it is not, create a new array with double the size of the original array, copy over the elements from the original array, and then add the new element. Otherwise, simply add the new element to the end of the array and increment the size variable.</li>
    <li>Implement the get(int index) method by returning the element at the specified index.</li>
    <li>Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.</li>
    <li>Implement the size() method by returning the size variable.</li>
    <li>Implement any other methods specified by the MyList interface.</li>
    <li>Test all methods of MyArrayList</li>
  </ul>
