# ADS Task 2
This is an implementation of MyList by two data structures. They are ArrayList and LinkedList. Both can hold any type of data as long as it is `Comparable`.
# Example
It is a result of test class([Main.java](Main.java)):
```
START OF TESTS
TESTING MyArrayList
[1, 2, 3, 4, 5]
Size: 5
Contains 3: true
Contains 6: false
[1, 2, 6, 3, 4, 5]
Size: 6
[1, 2, 3, 4, 5]
[1, 2, 4, 3, 4, 5, 4]
Index of 4: 2
Last index of 4: 6
[1, 2, 3, 4, 4, 4, 5]


TESTING MyLinkedList
[1, 2, 3, 4, 5]
Size: 5
Contains 3: true
Contains 6: false
[1, 2, 6, 3, 4, 5]
Size: 6
[1, 2, 3, 4, 5]
[1, 2, 4, 3, 4, 5, 4]
Index of 4: 2
Last index of 4: 6
[1, 2, 3, 4, 4, 4, 5]
END OF TESTS

Process finished with exit code 0
```
As you can see all methods seem to work perfectly fine.
# Notes
Unfortunately, I was not able to implement proper sorting for ArrayList, because it creates `Object[]` as array, so it is impossible to cast it back to `T` if it implements `Comparable`. So, I just used `toString()` and just compared two strings. Fortunately, it works just fine.
