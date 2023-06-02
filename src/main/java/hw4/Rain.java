package hw4;

public class Rain {
    public static void main(String[] args) {
//Создайте две boolean переменные isWeekend и isRain.
//Создайте переменную canWalk, значение которой должно быть истинным,
//если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
   boolean isWeekend = true;
   boolean isRain = false;
   boolean canWalk = true;

   if (isWeekend == canWalk) {
       System.out.println("Weekend Can Walk: " + true);
   }if ((isWeekend == canWalk) == isRain) {
            System.out.println("Weekend Can Walk: " + false);
        }
    }
}
