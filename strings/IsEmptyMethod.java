/*
 * Method  : isEmpty() / isBlank()
 * Use     : String rikt aahe ka te check karto
 *           isEmpty() - String chi length 0 asel tar true (spaces count hota)
 *           isBlank() - String empty ya fakt spaces asel tar true (Java 11+)
 * Syntax  : str.isEmpty()
 *           str.isBlank()
 * Returns : boolean (true / false)
 */
public class IsEmptyMethod {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "   ";
        String s3 = "Hello";
        System.out.println("s1.isEmpty(): " + s1.isEmpty());
        System.out.println("s2.isEmpty(): " + s2.isEmpty());
        System.out.println("s2.isBlank(): " + s2.isBlank());
        System.out.println("s3.isEmpty(): " + s3.isEmpty());
    }
}
