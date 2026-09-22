/*
 * Program  : Palindrome String Check
 * Use      : User kadun string input gheto aani ti palindrome aahe ka te check karto
 * Logic    : String reverse karun original shi compare karto
 * Example  : "madam" -> reverse "madam" -> palindrome!
 *            "hello" -> reverse "olleh" -> not palindrome
 */
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome!");
        }

        sc.close();
    }
}
