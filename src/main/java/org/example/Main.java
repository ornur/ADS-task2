package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("START OF TESTS");
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Size: " + list.size());
        System.out.println("Contains 3: " + list.contains(3));
        System.out.println("Contains 6: " + list.contains(6));
        list.add(6, 2);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Size: " + list.size());
        // Remove 3
        list.remove(2);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        for(int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("Size: " + list2.size());
        System.out.println("Contains 3: " + list2.contains(3));
        System.out.println("Contains 6: " + list2.contains(6));
        list2.add(6, 2);
        for(int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("Size: " + list2.size());
        // Remove 3
        list2.remove(2);
        for(int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("END OF TESTS");
    }
}