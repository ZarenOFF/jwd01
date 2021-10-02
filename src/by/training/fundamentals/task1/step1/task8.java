package by.training.fundamentals.task1.step1;

import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int n, k, sum = 0;
        Random rand = new Random();

        System.out.println("Enter size of array");
        n = enterNum();
        System.out.println("Enter K");
        k = enterNum();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
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