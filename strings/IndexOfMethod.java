/*
 * Method  : indexOf() / lastIndexOf()
 * Use     : String madhe character ya substring cha index shodhto
 *           indexOf()     - pahila occurrence cha index deto
 *           lastIndexOf() - shevtacha occurrence cha index deto
 * Syntax  : str.indexOf('x')  or  str.indexOf("abc")
 * Returns : int (not found asel tar -1 return karto)
 */
public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("indexOf(\"World\"): " + str.indexOf("World"));
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));
    }
}
