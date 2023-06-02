package hw4;

public class Temperature {
    public static void main(String[] args) {
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов,
//а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//Метод принимает на вход две эти переменные и выводит в консоль true или false.
    int temperature1 = 100+1;
    int temperature2 = 100-1;
    boolean result = temperature1 > temperature2;
    boolean result2 = temperature1 == temperature2;
    boolean result3 = temperature1 < temperature2;

    if (result) {
        System.out.println("Устройство работает: " + true);
    } if (result2) {
            System.out.println("Устройство работает: " + false);
    } if (result3) {
            System.out.println("Устройство работает: " + false);
        }
    }
}
