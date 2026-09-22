/*
 * Method  : equals() / equalsIgnoreCase()
 * Use     : Don strings equal aahet ka te check karto
 *           equals()            - case-sensitive comparison (H != h)
 *           equalsIgnoreCase()  - case-insensitive comparison (H == h)
 * Syntax  : s1.equals(s2)
 *           s1.equalsIgnoreCase(s2)
 * Returns : boolean (true / false)
 * Note    : == operator use karu naka, equals() use kara
 */
public class EqualsMethod {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        System.out.println("s1: " + s1 + ", s2: " + s2 + ", s3: " + s3);
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
    }
}
