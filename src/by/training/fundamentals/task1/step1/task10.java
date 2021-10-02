package by.training.fundamentals.task1.step1;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

public class task10 {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter n");
        n = enterNum();

        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = j + 1;
                }
            } else {
                int t = 1;
                for (int j = arr[i].length-1; j >= 0; j--) {
                    arr[i][j] = t;
                    t++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("["+arr[i][j]+"]");
                }
            System.out.println();
        }
    }

    private static int enterNum() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("Try again");
        }
        return scan.nextInt();
    }
}
