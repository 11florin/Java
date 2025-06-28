package Arrays;

import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades  = new int[3][4];
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;
        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;
        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        //An easy way to immplement
        int[][] grades2 = {
            {72,74,78,76},
            {65, 64,61,67},
            {95, 98, 99, 100}
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione : " + Arrays.toString(grades[2]));

        System.out.println("------------------------------------------");

        System.out.println("\tHarry: " + Arrays.toString(grades2[0]));
        System.out.println("\tRon: " + Arrays.toString(grades2[1]));
        System.out.println("\tHermione : " + Arrays.toString(grades2[2]));

        System.out.println("-------------------------------------------");

        System.out.println("\tHarry: " + grades2[0][0] + " " + grades2[0][1] + " " + grades[0][2] + " " + grades2[0][3]);
        System.out.println("\tRon: " +  grades2[1][0] + " " + grades2[1][1] + " " + grades[1][2] + " " + grades2[1][3]);
        System.out.println("\tHermione : " +  grades2[2][0] + " " + grades2[2][1] + " " + grades[2][2] + " " + grades2[2][3]);
    }
}
