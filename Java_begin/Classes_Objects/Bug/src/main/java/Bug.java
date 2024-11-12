public class Bug {
    String name;
    boolean ableToFly;
    int numberOfLegs;

    public Bug(String bugName, boolean canFly, int numLegs) {
        name = bugName;
        ableToFly = canFly;
        numberOfLegs = numLegs;
    }
    public static void main(String[] args) {
        Bug ladybug = new Bug("Lady Bug", true, 6);
    }
}
