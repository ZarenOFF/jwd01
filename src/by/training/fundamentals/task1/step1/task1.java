package by.training.fundamentals.task1.step1;

/*Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.
*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int num, numOne, numTwo, numThree, numFour;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number\n>");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        num = scan.nextInt();

        numOne = num / 1000;
        //System.out.println(numOne);
        numTwo = (num - numOne * 1000) / 100;
        //System.out.println(numTwo);
        numThree = (num - numOne * 1000 - numTwo * 100) / 10;
        //System.out.println(numThree);
        numFour = num % 10;
        //System.out.println(numFour);

        if (numOne + numTwo == numThree + numFour) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
