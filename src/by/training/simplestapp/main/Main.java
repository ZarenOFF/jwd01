package by.training.simplestapp.main;

public class Main {
    public static void main(String[] args) {
        int x = 2_147_483_647;
        int y = -2_147_483_648;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x +=10;
        y-=10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
