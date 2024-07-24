
public class Mouse {
  private String brandName;
  private String modelName;
  private double price;
  private int dpi;
  private boolean wireless;

  public Mouse(String brandName, String modelName, double price, int dpi, boolean wireless) {
    this.brandName = brandName;
    this.modelName = modelName;
    this.price = price;
    this.dpi = dpi;
    this.wireless = wireless;
  }

  public void checkDpi() {
    if (dpi >= 1200) {
      System.out.println(modelName + " has high DPI.");
    } else {
      System.out.println(modelName + " has low DPI.");
    }
  }

  public void checkWireless() {
    if (wireless) {
      System.out.println(modelName + " is wireless.");
    } else {
      System.out.println(modelName + " is not wireless.");
    }
  }

  public void applyDiscount() {
    if (price > 50) {
      price *= 0.95; // 5% discount
      System.out.println("Discount applied. New price: " + price);
    } else {
      System.out.println("No discount applicable.");
    }
  }

  public void comparePrice(double otherPrice) {
    if (price < otherPrice) {
      System.out.println(modelName + " is cheaper.");
    } else {
      System.out.println(modelName + " is more expensive.");
    }
  }

  public void displayDetails() {
    System.out.println("Brand Name: " + brandName);
    System.out.println("Model Name: " + modelName);
    System.out.println("Price: " + price);
    System.out.println("DPI: " + dpi);
    System.out.println("Wireless: " + wireless);
  }
}
