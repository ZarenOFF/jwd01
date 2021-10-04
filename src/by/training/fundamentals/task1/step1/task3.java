package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        double legA, legB, perimeter, area;

        System.out.println("Enter a");
        legA = enterNum();
        System.out.println("Enter b");
        legB = enterNum();

        perimeter = Math.sqrt(Math.pow(legA,2)+Math.pow(legB,2)) + legA +legB;
        System.out.println(perimeter);
        area = (legA*legB)/2;
        System.out.println(area);

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
