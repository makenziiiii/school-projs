import java.util.Scanner;

class AmountDue {

    
    double computeAmountDue(double price){
        double total = price + (price * 0.12);
        return total;
    }

    
    double computeAmountDue(double price, int quantity){
        double subtotal = price * quantity;
        double total = subtotal + (subtotal * 0.12);
        return total;
    }

    
    double computeAmountDue(double price, int quantity, double discount){
        double subtotal = price * quantity;
        double afterDiscount = subtotal - discount;
        
        double tax = 36;
        double total = afterDiscount + tax;
        return total;
    }
}

public class RunAmountDue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        AmountDue due = new AmountDue();

        System.out.println("\nPress any of the following then enter values separated by spaces:");
        System.out.println("1 - Price only");
        System.out.println("2 - Price and Quantity");
        System.out.println("3 - Price, Quantity, and Discount\n");
        int choice = sc.nextInt();

        double total = 0;

        if (choice == 1) {
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            total = due.computeAmountDue(price);

        } else if (choice == 2) {
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            total = due.computeAmountDue(price, qty);

        } else if (choice == 3) {
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter discount: ");
            double discount = sc.nextDouble();
            total = due.computeAmountDue(price, qty, discount);

        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.printf("Total Amount Due: %.2f\n", total);
        sc.close();
    }
}
