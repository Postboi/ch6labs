package Shopping;
import java.util.Scanner;

public class ShopTest {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        ShoppingCart3 coolCart = new ShoppingCart3();

        System.out.println("Would you like to go shopping?(Y/N)");
        String yesNo = userInput.nextLine();
            while(yesNo.equalsIgnoreCase("y")|| yesNo.equalsIgnoreCase("yes")){
                System.out.println("What would you like to buy?");
                item = userInput.next();
                System.out.println("How much does it cost?");
                price = userInput.nextDouble();
                System.out.println("How many do you want?");
                quantity = userInput.nextInt();
                coolCart.addToCart(item, price, quantity);

                System.out.println("Would you like to get anything else?");
                yesNo = userInput.next();
            }

        System.out.println("Thanks for stopping by!");
        System.out.println(coolCart.toString());
        System.out.println(coolCart.getCartLength());
    }
}
