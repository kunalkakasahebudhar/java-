/*
 * Method  : replace()
 * Use     : String madhe ek character ya substring dusrya ne replace karto
 *           replace(oldChar, newChar)         - character replace
 *           replace(oldString, newString)     - substring replace
 * Syntax  : str.replace('a', 'b')
 *           str.replace("old", "new")
 * Returns : String
 */
public class ReplaceMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        System.out.println("replace('l','r'): " + str.replace('l', 'r'));
        System.out.println("replace(\"World\",\"Java\"): " + str.replace("World", "Java"));
    }
}
