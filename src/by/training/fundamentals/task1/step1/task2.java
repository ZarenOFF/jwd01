package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        double a, b, c, res;

        System.out.println("Enter a");
        a = enterNum();
        System.out.println("Enter b");
        b = enterNum();
        System.out.println("Enter c");
        c = enterNum();

        res = ((b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println(res);

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
