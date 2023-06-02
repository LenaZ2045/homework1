package hw4;

public class Food {
    public static void main(String[] args) {
//Создайте две boolean переменные isEdekaOpen и isReweOpen,
//значения которых зависят от того, открыты магазины или нет.
//Напишите метод canBuy, принимающий в качестве параметров две этих переменных
//и возвращающий true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду: » и значение. Например, «Я могу купить еду: false»
    boolean isEdekaOpen = true;
    boolean isEdekaClosed = false;
    boolean isReweOpen = true;
    boolean isReweClosed = false;
    boolean canBuy = true;
    boolean cannotBuy = false;

    if (isEdekaOpen == isReweOpen == canBuy) {
        System.out.println("Я могу купить еду: " + true);
    } else {
        System.out.println("Я могу купить еду: " + false);
    } if (isEdekaClosed == isReweClosed == cannotBuy) {
            System.out.println("Я могу купить еду: " + false);
    }

}
}
