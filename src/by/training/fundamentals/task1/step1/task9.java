package by.training.fundamentals.task1.step1;

import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int delimiter;
        Random rand = new Random();

        System.out.println("Enter k");
        delimiter = enterNum();

        System.out.println("Enter size of first array");
        int firstArray[] = new int[enterNum()];
        System.out.println("Enter size of second array");
        int secondArray[] = new int[enterNum()];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(100);
        }
        showArray(firstArray);
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = rand.nextInt(100);
        }
        showArray(secondArray);

        int resultArray[] = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < delimiter; i++) {  //Заполняем первую половину
            resultArray[i] = firstArray[i];
        }
        int index = 0;
        for (int i = delimiter; i < secondArray.length + delimiter; i++, index++) {  //Вставляем второй массив
            resultArray[i] = secondArray[index];
        }
        index = delimiter;
        for (int i = secondArray.length - delimiter; i < resultArray.length; i++, index++) {  //Заполняем вторую половину первого
            resultArray[i] = firstArray[index];
        }
        showArray(resultArray);
    }

    private static int enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextInt();
    }

    private static void showArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();
    }
}
