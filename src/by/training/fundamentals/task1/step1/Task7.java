package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double result, x, step, beginLine, endLine, currentPosition;

        System.out.println("Enter a");
        beginLine = enterNum();
        currentPosition = beginLine;
        System.out.println("Enter b");
        endLine = enterNum();
        System.out.println("Enter step");
        step = enterNum();

        System.out.println(Math.sin(1.0));

        while (currentPosition <= endLine) {
            result = Math.pow(Math.sin(currentPosition), 2) - Math.cos(2 * currentPosition);
            System.out.printf("|%.1f|%.4f|\n", currentPosition, result);
            currentPosition += step;
        }
    }

    private static double enterNum() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.nextDouble();
            System.out.println("Try again");
        }
        return scan.nextDouble();
    }
}
