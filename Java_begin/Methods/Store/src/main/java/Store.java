public class Store {
    // instance fields
    String productType;

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


}
