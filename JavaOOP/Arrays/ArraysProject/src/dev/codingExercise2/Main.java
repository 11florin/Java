package dev.codingExercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int readInt = readInteger();
        System.out.println(readInt);

        int[] readEl = readElements(readInt);
        System.out.println(Arrays.toString(readEl));

        int findM = findMin(readEl);
        System.out.println("Min num = " + findM);

    }
    private static int readInteger() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scan.nextInt();
        return count;
    }
    private static int[] readElements(int count) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array) {
        int cmv = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < cmv) {
                cmv = array[i];
            }
        }
        return cmv;
    }
    
}
