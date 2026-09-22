/*
 * Method  : concat() / join()
 * Use     : Don ya jast strings ek karto (join karto)
 *           concat()      - don strings join karto
 *           String.join() - multiple strings la separator ne join karto
 * Syntax  : s1.concat(s2)
 *           String.join("separator", s1, s2, s3)
 * Returns : String
 */
public class ConcatMethod {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World";
        System.out.println("concat(): " + s1.concat(s2));
        System.out.println("+ operator: " + s1 + s2);
        System.out.println("String.join(): " + String.join(", ", "Apple", "Banana", "Mango"));
    }
}
