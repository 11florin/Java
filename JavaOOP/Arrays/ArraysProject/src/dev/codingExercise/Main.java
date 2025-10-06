package dev.codingExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int[] myArray = SortedArray.getIntegers(5);
        int[] sorted = SortedArray.getIntegers(myArray);

        SortedArray.printArray(sorted);
    }
    
}
class SortedArray {

    public static int[] getIntegers(int capacity) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integers value: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}