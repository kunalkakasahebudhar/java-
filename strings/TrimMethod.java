/*
 * Method  : trim() / strip()
 * Use     : String chya suruvati aani shevti aslele spaces kadhto
 *           trim()  - spaces remove karto (older method)
 *           strip() - trim() sarkha pan Unicode spaces pan handle karto (Java 11+)
 * Syntax  : str.trim()
 *           str.strip()
 * Returns : String
 */
public class TrimMethod {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        System.out.println("String: '" + str + "'");
        System.out.println("trim(): '" + str.trim() + "'");
        System.out.println("strip(): '" + str.strip() + "'");
    }
}
