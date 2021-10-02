package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int a, b, c, sum;

        System.out.println("Enter a");
        a = enterNum();
        System.out.println("Enter b");
        b = enterNum();
        System.out.println("Enter c");
        c = enterNum();

        sum = findMax(a, b, c) + findMin(a, b, c);
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

    private static int findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    private static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
