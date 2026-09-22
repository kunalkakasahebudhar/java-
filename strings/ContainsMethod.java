/*
 * Method  : contains()
 * Use     : String madhe specific substring aahe ka nahi te check karto
 * Syntax  : str.contains("abc")
 * Returns : boolean (true / false)
 */
public class ContainsMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        System.out.println("contains(\"World\"): " + str.contains("World"));
        System.out.println("contains(\"Java\"): " + str.contains("Java"));
    }
}
