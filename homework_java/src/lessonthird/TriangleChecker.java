package lessonthird;
import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        int a = scanner.nextInt();

        System.out.print("Введите сторону b: ");
        int b = scanner.nextInt();

        System.out.print("Введите сторону c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник с такими сторонами существует.");
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }
    }
}
