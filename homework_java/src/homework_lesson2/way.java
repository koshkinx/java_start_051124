package homework_lesson2;

public class way {
    public static void main(String[] args) {

        double GasCost = 1.2;
        double CarSpend = 8.0;
        double Dist = 120;
        double totalCost = (Dist / 100) * CarSpend * GasCost;

        System.out.println("Стоимость топлива для поездки: "+ totalCost + "$");


    }
}
