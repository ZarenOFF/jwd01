package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Enter a");
        a = enterNum();
        System.out.println("Enter b");
        b = enterNum();
        System.out.println("Enter c");
        c = enterNum();

        System.out.println("a - " + pow(a));
        System.out.println("b - " + pow(b));
        System.out.println("c - " + pow(c));
    }

    private static double enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextDouble();
    }

    private static double pow(double num) {
        if(num>=0){
            return Math.pow(num, 2);
        }
        else {
            return Math.pow(num, 4);
        }
    }
}
