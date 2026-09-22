/*
 * Program  : Count Vowels in a String
 * Use      : User kadun string input gheto aani tyatil vowels (a, e, i, o, u) count karto
 * Logic    : Pratyek character check karto - a, e, i, o, u asel tar count vadhvto
 * Example  : "Hello World" -> vowels: e, o, o -> count = 3
 */
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println("String: " + input);
        System.out.println("Total Vowels: " + count);

        sc.close();
    }
}
