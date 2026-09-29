public class Main {
    public static void main(String[] args) {

        // Set the item price
        double itemPrice = 125.00;

        // Check if the item price is $100 or more
        if (itemPrice >= 100) {
            // Shipping is free
            double shippingCost = 0.00;

            // Calculate total price
            double totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + totalPrice);
        } else {
            // Shipping is 2% of the item price
            double shippingCost = itemPrice * 0.02;

            // Calculate total price
            double totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + totalPrice);
        }
    }
}