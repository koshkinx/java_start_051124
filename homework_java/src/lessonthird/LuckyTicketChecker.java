package lessonthird;
import java.util.Scanner;

public class LuckyTicketChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырехзначное число: ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Ошибка: введите четырехзначное число.");
        } else {
            int firstDigit = number / 1000;
            int secondDigit = (number / 100) % 10;
            int thirdDigit = (number / 10) % 10;
            int fourthDigit = number % 10;


            int leftSum = firstDigit + secondDigit;
            int rightSum = thirdDigit + fourthDigit;

            if (leftSum == rightSum) {
                System.out.println("Число является счастливым билетом!");
            } else {
                System.out.println("Число не является счастливым билетом.");
            }
        }
    }
}

