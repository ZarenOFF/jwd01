package by.training.simplestapp.main;

public class test {
    public static void main(String[] args) {
        int i = 3;
        //i = -i++ + i++;
        i = -i-- + -i++ + i++ - i;
        System.out.println(i);
        //i = -i++ + -i;
        //System.out.println(i);
    }
}
