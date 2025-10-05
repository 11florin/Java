package dev.dcm;

import java.util.Arrays;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println("first array");

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("second array with fill() val 5");

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("third array");

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        System.out.println("fourth Array with copyOf third array");

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println("third array with sort");
        System.out.println(Arrays.toString(fourthArray));
        System.out.println("fourth array with sort");

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));
        System.out.println("third array with initialization of smaller array");

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));
        System.out.println("larger array 15 copyOf third array");

        System.out.println("-".repeat(20));
        System.out.println("binarySearch");
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5}; //true
        int[] s2 = {1, 2, 3, 4, 5}; //true

        // int[] s1 = {1, 2, 3, 4, 5}; //false
        // int[] s2 = {1, 2, 3, 4, 5, 0}; //false
        
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
