/*
 * Program  : Capitalize First Character of Each Word
 * Use      : User kadun string input gheto aani pratyek word cha 1st character capitalize karto
 * Logic    : String split karto spaces ne, mag pratyek word cha 1st letter uppercase karto
 * Example  : "hello world java" -> "Hello World Java"
 */
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        System.out.println("Capitalized: " + result.toString().trim());

        sc.close();
    }
}
