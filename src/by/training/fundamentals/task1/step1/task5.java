package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber;

        System.out.println("Enter first number");
        firstNumber = enterNum();
        System.out.println("Enter second number");
        secondNumber = enterNum();
        System.out.println("Enter third number");
        thirdNumber = enterNum();

        System.out.println("First number after exponentiation - " + pow(firstNumber));
        System.out.println("Second number after exponentiation - " + pow(secondNumber));
        System.out.println("Third number after exponentiation - " + pow(thirdNumber));
    }

    private static double enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextDouble();
    }

    private static double pow(double number) {
        if(number>=0){
            return Math.pow(number, 2);
        }
        else {
            return Math.pow(number, 4);
        }
    }
}
