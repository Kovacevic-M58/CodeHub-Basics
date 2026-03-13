/*Camel Case*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String s = scanner.nextLine();

        CamelCase camelCase = new CamelCase();

        System.out.println(camelCase.getNumberOfWords(s));

        scanner.close();
    }
}


