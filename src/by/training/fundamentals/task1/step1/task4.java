package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int x, y;

        System.out.println("Enter x");
        x = enterNum();
        System.out.println("Enter y");
        y = enterNum();

        if (y < 0 && y >= -3) {
            if (x >= -4 && x <= 4) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else if (y >= 0 && y <= 4) {
            if (x >= -2 && x <= 2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
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
