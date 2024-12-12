public class Store {
    // instance fields
    String productType;
    public double price;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // Add advertise method below
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");

    }
    public void greetCustomer(String customerName) {
        System.out.println("Welcome to the store, " + customerName + "!"  );

    }
    public void increasePrice(double priceToAdd){
        double newPrice=price+priceToAdd;
        price = newPrice;

    }
    public double getPriceWithTax(){
        double totalPrice = price+price*tax;
        return totalPrice;

    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";

    }


}
