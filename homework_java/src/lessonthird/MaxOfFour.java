package lessonthird;
import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четыре целых числа:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num4 > max) {
            max = num4;
        }

        System.out.println("Наибольшее число: " + max);
    }
}