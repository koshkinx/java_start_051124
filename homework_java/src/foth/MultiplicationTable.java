package foth;

public class MultiplicationTable {
    public static void main(String[] args) {
        int multiplier = 5;

        System.out.println("Таблица умножения на " + multiplier + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + multiplier + " = " + (i * multiplier));
        }
    }
}
