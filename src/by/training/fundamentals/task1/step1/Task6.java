package by.training.fundamentals.task1.step1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, sum;

        System.out.println("Enter first number");
        firstNumber = enterNumber();
        System.out.println("Enter second number");
        secondNumber = enterNumber();
        System.out.println("Enter third number");
        thirdNumber = enterNumber();

        sum = findMaxNumber(firstNumber, secondNumber, thirdNumber) + findMinNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(sum);
    }

    private static int enterNumber() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextInt();
    }

    private static int findMaxNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    private static int findMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            return firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
