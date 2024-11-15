public class Window {
    boolean isOpen;
    int height;
    int width;

    public Window(boolean open, int windowHeight, int windowWidth) {
        isOpen = open;
        height = windowHeight;
        width = windowWidth;
    }

    public static void main(String[] args) {
        Window bedroomWindow = new Window(true, 72, 34);
    }
}
