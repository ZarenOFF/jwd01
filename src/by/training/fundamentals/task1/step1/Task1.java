package by.training.fundamentals.task1.step1;

/*Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number, digitOne, digitTwo, digitThree, digitFour;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number\n>");
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Wrong format. Try again");
        }
        number = scan.nextInt();

        digitOne = number / 1000;
        digitTwo = (number - digitOne * 1000) / 100;
        digitThree = (number - digitOne * 1000 - digitTwo * 100) / 10;
        digitFour = number % 10;

        if (digitOne + digitTwo == digitThree + digitFour) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
