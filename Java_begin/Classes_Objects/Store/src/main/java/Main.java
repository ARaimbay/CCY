public class Main {
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade");
        Store cookieShop = new Store("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
        //Store newStore = new Store();
    }
}
