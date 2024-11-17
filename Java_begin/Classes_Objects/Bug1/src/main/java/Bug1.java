public class Bug1 {
    String name;
    boolean ableToFly;
    int numberOfLegs;

    public Bug1(String bugName, boolean canFly, int numLegs) {
        name = bugName;
        ableToFly = canFly;
        numberOfLegs = numLegs;
    }
    public static void main(String[] args) {
        Bug1 ladybug = new Bug1("Lady Bug", true, 6);
    }
}
