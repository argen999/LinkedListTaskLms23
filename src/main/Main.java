package main;

import java.util.*;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,2);
            arrayList.add(random.nextInt(0,2) );
            linkedList.add(random.nextInt(0,2) );
        }

        System.out.println("Array sort: \n"+Arrays.toString(sort(array) ) );
        System.out.println("ArrayList sort: \n"+sort(arrayList) );
        System.out.println("LinkedList sort: \n"+sort(linkedList) );

    }
    public static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }
    public static LinkedList<Integer> sort(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        return linkedList;
    }

}