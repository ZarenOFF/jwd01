package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        double a, b, per, sq;

        System.out.println("Enter a");
        a = enterNum();
        System.out.println("Enter b");
        b = enterNum();

        per = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)) + a +b;
        System.out.println(per);
        sq = (a*b)/2;
        System.out.println(sq);

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
