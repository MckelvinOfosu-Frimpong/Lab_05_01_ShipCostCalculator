public class Main {

    public static void main(String[] args)
    {
	        double itemPrice = 350;
            double shippingRate = 0.02;
            double shippingCost = 0;
            double totalPrice = 0;

            if (itemPrice > 100)
            {
                System.out.println("Your total is " + itemPrice + " and you had free shipping");
            }
             else
            {
              shippingCost = shippingRate * itemPrice;
              totalPrice = itemPrice + shippingCost;
                System.out.println("Your total is " + totalPrice + " and your shipping was " + shippingCost);
            }
    }
}
