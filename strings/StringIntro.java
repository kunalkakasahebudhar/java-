public class StringIntro {
   public StringIntro() {
   }
   public static void main(String[] var0) {

      String var1 = "Shivraj";
      String var2 = "Jadhav";
    
      String var3 = var1 + " " + var2;
    
      System.out.println("Full Name: " + var3);
    
      System.out.println("Length: " + var3.length());
    
      System.out.println("Uppercase: " + var3.toUpperCase());
    
      System.out.println("Lowercase: " + var3.toLowerCase());
    
      System.out.println("indexOf('o'): " + var3.indexOf(111));
    
      System.out.println("indexOf(\"Jadhav\"): " + var3.indexOf("Jadhav"));
    
      System.out.println("charAt(0): " + var3.charAt(0));
    
      System.out.println("substring(5): " + var3.substring(5));
    
      System.out.println("replace('o','0'): " + var3.replace('o', '0'));
    
      System.out.println("contains(\"Shivraj\"): " + var3.contains("Shivraj"));
    
      System.out.println("trim: " + "  hello  ".trim());
   }
}