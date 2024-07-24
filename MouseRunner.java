public class MouseRunner{
  public static void main(String[] args) {
    Mouse mouse = new Mouse("Logitech", "G502", 70.0, 1200, true);
    mouse.checkDpi();
    mouse.checkWireless();
    mouse.applyDiscount();
    mouse.comparePrice(60.0);
    mouse.displayDetails();
  }
}