package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a, b, c, result;

        System.out.println("Enter a");
        a = enterNum();
        System.out.println("Enter b");
        b = enterNum();
        System.out.println("Enter c");
        c = enterNum();

        result = ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println(result);

    }

    private static double enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextDouble();
    }
}
