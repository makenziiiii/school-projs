import java.util.Scanner;


class runMethods{
    
    
        double solvThis(double price){
        double total = price + (price * 0.10); 
        return total;
        }

        double solvThis(double price , double quantity){
            double subtotal =  price * quantity;
            double total = subtotal + (subtotal + 0.10);
            return total;
        }

        double solvThis(double price , double quantity , double discount){
            double total = price * quantity;
            double subtotal  =  total - discount;
            return subtotal;
        }

    }

        public class subukan{
            public static void main(String[] args) {
                Scanner sc = new Scanner (System.in);
                runMethods calc = new runMethods();
                System.out.println("hello welcome!");
                System.out.println();

               
                System.out.print("enter your name: ");
                String name = sc.nextLine().strip();

                System.out.print("enter your surname: ");           //add another string 
                 String surname = sc.nextLine().strip();

                 String fullname = name.concat(" ").concat(surname);

                System.out.println("\nname detected: " + fullname);

                 

                System.out.print("enter an price of your product: ");
                double price = sc.nextDouble();

                System.out.print("enter an quantity of your product: ");
                double quantity = sc.nextDouble();

                System.out.print("enter an discount: ");
                double discount = sc.nextDouble();

                double case1 = calc.solvThis(price);
                double case2 = calc.solvThis(price, quantity);
                double case3 = calc.solvThis(price, quantity, discount);

                System.out.println("\nCase 1 (price + 10%): " + case1);
                System.out.println("Case 2 (subtotal + 10%): " + case2);
                System.out.println("Case 3 (price after discount): " + case3);



               }
            }
        

