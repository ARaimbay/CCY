public class Main {
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75 );
        Store cookieShop = new Store("Cookies", 5);
        lemonadeStand.advertise();
        lemonadeStand.greetCustomer("Codey");
        lemonadeStand.increasePrice(1.50);
        System.out.println(lemonadeStand.price);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
        System.out.println(cookieShop);

    }
}
