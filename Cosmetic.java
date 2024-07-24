
public class Cosmetic {
  private String brandName;
  private String productName;
  private double price;
  private int quantity;
  private String type;

  public Cosmetic(String brandName, String productName, double price, int quantity, String type) {
    this.brandName = brandName;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.type = type;
  }

  public void checkAvailability() {
    if (quantity > 0) {
      System.out.println(productName + " is available.");
    } else {
      System.out.println(productName + " is out of stock.");
    }
  }

  public void applyDiscount() {
    if (price > 100) {
      price *= 0.9;
      System.out.println("Discount applied. New price: " + price);
    } else {
      System.out.println("No discount applicable.");
    }
  }

  public void checkType() {
    if (type.equals("Moisturizer")) {
      System.out.println(productName + " is a moisturizer.");
    } else {
      System.out.println(productName + " is not a moisturizer.");
    }
  }

  public void restock() {
    if (quantity < 10) {
      quantity += 10; 
      System.out.println("Restocked " + productName + ". New quantity: " + quantity);
    } else {
      System.out.println(productName + " is already in stock.");
    }
  }

  public void displayDetails() {
    System.out.println("Brand Name: " + brandName);
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Type: " + type);
  }
}

