/*
 * Method  : startsWith() / endsWith()
 * Use     : String specific substring ne start ya end hoto ka te check karto
 *           startsWith() - suruvat check karto
 *           endsWith()   - shevat check karto
 * Syntax  : str.startsWith("abc")
 *           str.endsWith("xyz")
 * Returns : boolean (true / false)
 */
public class StartsEndsMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        System.out.println("startsWith(\"Hello\"): " + str.startsWith("Hello"));
        System.out.println("endsWith(\"World\"): " + str.endsWith("World"));
        System.out.println("startsWith(\"World\"): " + str.startsWith("World"));
    }
}
