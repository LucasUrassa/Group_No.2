
/**
 * Write a description of class exercise10 here.
 *
 * @author (24BIA042)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class ArrayOperations{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < 5; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        double avg = sum / 5.0;

        System.out.println("Numbers are:");
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}


    