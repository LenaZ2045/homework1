package hw3;

public class Pizza {
    public static void main(String[] args) {
        double bigPizza = 28;
        double smallPizza = 24;
        double bigArea = calculatePizzaArea(bigPizza);
        double smallArea = calculatePizzaArea(smallPizza);

        System.out.println("Площадь б-пиццы: " + (3.14 * bigPizza / 2 * bigPizza / 2));
        System.out.println("Площадь м-пиццы: " + (3.14 * smallPizza / 2 * smallPizza / 2));
        System.out.println("Б-пицца кал: " + bigArea * 40);
        System.out.println("М-пицца кал: " + smallArea * 40);

        System.out.println("В б-пицце содержится на " + (bigArea - smallArea) * 40 + " калорий больше!");


    }
    public static double calculatePizzaArea(double diameter) {
        return 3.14 * diameter * diameter / 4;
    }
}
