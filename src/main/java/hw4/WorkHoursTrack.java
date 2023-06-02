package hw4;

import java.util.Random;
//import java.util.Scanner;

public class WorkHoursTrack {
    public static void main(String[] args) {
//Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
//Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
//когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
//а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//Итак: требуется написать программу, которая вместо секунд будет выводить
//на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Обьяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число
//из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах)
//и на следующей строке (для тех кто не понимает) должна выводиться фраза
// о количестве полных часов, содержащихся в n секундах.

//        Scanner scanner1 = new Scanner(System.in);
//        int seconds = scanner1.nextInt(0 >= 28800);
//
//        Scanner scanner2 = new Scanner(System.in);
//        String hours = scanner2.nextLine(8hours, 7-hours, 6-hours, 5-hours, 4-hours, 3-hours, 2-hours, 1-hours, 0.45-hours, 0.30-hours, 0.15-hours, 0-hours);
        Random random = new Random();
        int n = random.nextInt(28801);
        System.out.println("Seconds(n) 'til end of shift: " + n);
        int n1 = n / 3600;
        if (n1 == 0) {
            System.out.println("Less then an hour(n1) 'til end of shift");
        } else {
            System.out.println("Hours(n1) 'til end of shift: " + n1);
        }
    }
}