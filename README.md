# ADS Task 2
This is an implementation of MyList by two data structures. They are ArrayList and LinkedList. Both can hold any type of data as long as it is `Comparable`.
# Example
It is a result of test class([Main.java](Main.java)):
```
START OF TESTS
TESTING MyArrayList
[1, 22, 3, 4, 55]
Size: 5
Contains 3: true
Contains 6: false
[1, 22, 6, 3, 4, 55]
Size: 6
[1, 22, 3, 4, 55]
[1, 22, 4, 3, 4, 55, 4]
Index of 4: 2
Last index of 4: 6
[1, 3, 4, 4, 4, 22, 55]


TESTING MyLinkedList
[11, 2, 33, 4, 5]
Size: 5
Contains 3: false
Contains 6: false
[11, 2, 6, 33, 4, 5]
Size: 6
[11, 2, 33, 4, 5]
[11, 2, 4, 33, 4, 5, 4]
Index of 4: 2
Last index of 4: 6
[2, 4, 4, 4, 5, 11, 33]
END OF TESTS

Process finished with exit code 0
```
As you can see all methods seem to work perfectly fine.
# Notes
It was extremely hard to implement this classes in such way that they can be easily sorted. I was able to come up with a solution, I created class with boundary types. Now, it requires `Comparable` interface from data type.