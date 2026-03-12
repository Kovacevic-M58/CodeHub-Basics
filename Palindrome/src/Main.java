/*Palindrome task*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your word: ");
    String word = scanner.nextLine();

    Methods methods = new Methods();

    System.out.println(methods.isPalindrome(word));

    scanner.close();
    }
}