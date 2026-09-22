/*
 * Method  : split()
 * Use     : String la specific delimiter (separator) ne todto aani array madhe store karto
 * Syntax  : str.split("delimiter")
 * Returns : String[] (String array)
 * Example : "A,B,C".split(",") => ["A", "B", "C"]
 */
public class SplitMethod {
    public static void main(String[] args) {
        String str = "Apple,Banana,Mango,Orange";
        System.out.println("String: " + str);
        String[] fruits = str.split(",");
        System.out.println("split by ',':");
        for (String fruit : fruits) {
            System.out.println("  " + fruit);
        }
    }
}
