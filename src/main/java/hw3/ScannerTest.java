package hw3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Ввела 2 слова с клавиатуры Global Training!
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Two even words" + word);
    }

}
