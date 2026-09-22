/*
 * Method  : substring()
 * Use     : String cha ek bhag (part) kadhto
 *           substring(start)       - start index pasun shevat paryant
 *           substring(start, end)  - start te end-1 paryant
 * Syntax  : str.substring(startIndex)
 *           str.substring(startIndex, endIndex)
 * Returns : String
 */
public class SubstringMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        System.out.println("substring(6): " + str.substring(6));
        System.out.println("substring(0,5): " + str.substring(0, 5));
    }
}
