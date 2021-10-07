package by.training.fundamentals.task1.step1;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int arraySize, divider, sum = 0;
        Random rand = new Random();

        System.out.println("Enter size of array");
        arraySize = enterNum();
        System.out.println("Enter K");
        divider = enterNum();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % divider == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    private static int enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextInt();
    }
}