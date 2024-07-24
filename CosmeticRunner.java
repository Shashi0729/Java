public class CosmeticRunner {
  public static void main(String[] args) {
    Cosmetic cosmetic = new Cosmetic("L'Oreal", "Moisturizer", 150.0, 5, "Moisturizer");
    cosmetic.checkAvailability();
    cosmetic.applyDiscount();
    cosmetic.checkType();
    cosmetic.restock();
    cosmetic.displayDetails();
  }
}





