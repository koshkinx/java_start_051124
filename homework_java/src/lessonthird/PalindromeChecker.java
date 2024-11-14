package lessonthird;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначное число: ");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Ошибка: введите шестизначное число.");
        } else {

            int firstDigit = number / 100000;          // Первая цифра
            int secondDigit = (number / 10000) % 10;   // Вторая цифра
            int thirdDigit = (number / 1000) % 10;     // Третья цифра
            int fourthDigit = (number / 100) % 10;     // Четвертая цифра
            int fifthDigit = (number / 10) % 10;       // Пятая цифра
            int sixthDigit = number % 10;              // Шестая цифра


            if (firstDigit == sixthDigit && secondDigit == fifthDigit && thirdDigit == fourthDigit) {
                System.out.println("Число является палиндромом.");
            } else {
                System.out.println("Число не является палиндромом.");
            }
        }
    }
}

