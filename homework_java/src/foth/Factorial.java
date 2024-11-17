package foth;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Введите число n (4 < n < 16): ");
            n = sc.nextInt();
            if (n <= 4 || n >= 16) {
                System.out.println("Ошибка: число должно быть в диапазоне от 5 до 15!");
            }
        } while (n <= 4 || n >= 16);


        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }
}

