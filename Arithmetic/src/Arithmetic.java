import java.util.Scanner;
import java.sql.SQLOutput;

public class Arithmetic {
    //private static int x = 10;
    //private static int y = 20;

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");

        int x = (new Scanner(System.in)).nextInt();

        System.out.println("Введите второе число: ");

        int y = (new Scanner(System.in)).nextInt();


        System.out.println("Числа: " + x + " и " + y);
        maxmin2Ch(x, y);
        System.out.println("Сумма этих 2х чисел = " + summaCh(x, y));
        System.out.println("Произведение этих 2х чисел = " + proizvCh(x, y));

    }

    public static int summaCh(int x1, int y1) {

        return (x1 + y1);
    }

    public static int proizvCh(int x2, int y2) {

        return (x2 * y2);
    }

    public static void maxmin2Ch(int x3, int y3) {
        if (x3 > y3) {
            System.out.println("Максимальное значение из этих 2х чисел: " + x3);
            System.out.println("Минимальное значение из этих 2х чисел: " + y3);
        } else {
            System.out.println("Максимальное значение из этих 2х чисел: " + y3);
            System.out.println("Минимальное значение из этих 2х чисел: " + x3);
        }
    }
}




