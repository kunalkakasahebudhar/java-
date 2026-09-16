import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        int n500, n200, n100, n50, n20, n10;

        n500 = amount / 500;
        amount = amount % 500;

        n200 = amount / 200;
        amount = amount % 200;

        n100 = amount / 100;
        amount = amount % 100;

        n50 = amount / 50;
        amount = amount % 50;

        n20 = amount / 20;
        amount = amount % 20;

        n10 = amount / 10;
        amount = amount % 10;

        System.out.println("₹500 notes = " + n500);
        System.out.println("₹200 notes = " + n200);
        System.out.println("₹100 notes = " + n100);
        System.out.println("₹50 notes  = " + n50);
        System.out.println("₹20 notes  = " + n20);
        System.out.println("₹10 notes  = " + n10);

        if (amount != 0) {
            System.out.println("Remaining amount cannot be dispensed: ₹" + amount);
        }
    }
}