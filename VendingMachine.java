import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.println("Enter product code!");
       String productId = scanner.nextLine();


       VendingMachine myMachine = new VendingMachine();


       myMachine.CheckProduct(productId);
   }
}


class VendingMachine{
   public void CheckProduct(String productID){
       switch(productID){
           case "A1":
               System.out.println("Product 'Soda' - Price $1.50");
               break;
           case "B2":
               System.out.println("Product 'Chips' - Price $1.25");
               break;
           case "C3":
               System.out.println("Product 'Candy' - Price $0.75");
               break;
           case "D4":
               System.out.println("Product 'Water' - Price $1.00");
               break;
           default:
               System.out.println("Invalid product ID");
               break;
       }
   }
}
