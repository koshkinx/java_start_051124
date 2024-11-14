package lessonthird;

import java.util.Scanner;

public class ApartmentFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();


        if (apartmentNumber < 1 || apartmentNumber > 180) {
            System.out.println("Такой квартиры нет в этом доме.");
        } else {

            int entrance = (apartmentNumber - 1) / 36 + 1;
            int positionInEntrance = (apartmentNumber - 1) % 36;
            int floor = positionInEntrance / 4 + 1;

            System.out.println("Квартира находится в " + entrance + " подъезде, на " + floor + " этаже.");
        }
    }
}
