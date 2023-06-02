package hw3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Ввела 2 чётных слова с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String word2 = scanner.nextLine();
        System.out.println("Two even words " + word);
        System.out.println("Two even words " + word2);

        int result = word.length() /2;
        int result2 = word2.length() /2;

        System.out.println(result);
        System.out.println(result2);

        String s = word.substring(0, result) + word2.substring(result2);
        System.out.println("Write me letters: " + s);

    }

}
