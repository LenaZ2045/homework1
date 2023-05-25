package hw3;

public class Operations {
    public static void main(String[] args) {
//        вывожу 2 слова состоящие из чётного кол-ва букв
//        и вывожу первую половину 1-го слова и вторую половину 2-го слова
        String s = "Global Training!";
        System.out.println(s.substring(0,3) + s.substring(11,15));

//        пишу программу + / - * 2ух чисел в разных методах
        int i = 6;
        char c = '9';
        String s1 = "3";
        double d = 4.5;
        float f = 2.333457F;
//        method 1 +
        int sum = i + Integer.parseInt(String.valueOf(c));
        System.out.println(sum);
//        method 2 /
        float div = i / f;
        System.out.println(div);
//        method 3 -
        double min = i - d;
        System.out.println(min);
//        method 4 -
        int add = i - Integer.parseInt(String.valueOf(c));
        System.out.println(add);
//        method 5 *
        double tim = i * d;
        System.out.println(tim);
//        method 6 +
        int sum1 = i + Character.getNumericValue(c);
        System.out.println(sum1);
//        method 7 string
        System.out.println(i + (s1));
    }

}
