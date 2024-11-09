package homework.lesson2;

public class Way {
    public static void main(String[] args) {

        double gasCost = 1.2;
        double carSpend = 8.0;
        double dist = 120;
        double totalCost = (dist / 100) * carSpend * gasCost;

        System.out.println("Стоимость топлива для поездки: "+ totalCost + "$");


    }
}
