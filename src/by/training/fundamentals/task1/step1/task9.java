package by.training.fundamentals.task1.step1;

import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int k;
        Random rand = new Random();

        System.out.println("Enter k");
        k = enterNum();

        System.out.println("Enter size of first array");
        int arr1[] = new int[enterNum()];
        System.out.println("Enter size of second array");
        int arr2[] = new int[enterNum()];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(100);
        }
        showArr(arr1);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }
        showArr(arr2);

        int resArr[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < k; i++) {  //Заполняем первую половину
            resArr[i] = arr1[i];
        }
        int index = 0;
        for (int i = k; i < resArr.length - k; i++, index++) {  //Вставляем второй массив
            resArr[i] = arr2[index];
        }
        index = k;
        for (int i = resArr.length - k; i < resArr.length; i++, index++) {  //Заполняем вторую половину первого
            resArr[i] = arr1[index];
        }
        showArr(resArr);
    }

    private static int enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextInt();
    }

    private static void showArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println();
    }
}
