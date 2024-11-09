package homework.lesson2;

public class Gerona {
	public static void main(String[] args) {

	double sideA = 0.3;
	double sideB = 0.4;
	double sideC = 0.5;
	double p = (sideA+sideB+sideC) / 2;
	double area = Math.sqrt(p * (p - sideA)*(p - sideB) * (p - sideC));
	System.out.printf("Площадь треугольника: %.2f", area);
}
}