package lessonthird;
import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x: ");
        int x = scanner.nextInt();

        System.out.print("Введите координату y: ");
        int y = scanner.nextInt();

        int radius = 4;

        if (x * x + y * y <= radius * radius) {
            System.out.println("Точка лежит внутри круга или на его границе.");
        } else {
            System.out.println("Точка лежит за пределами круга.");
        }
    }
}

