public class CustomerRunner {
  public static void main(String[] args) {
    Customer customer1 = new Customer();
    customer1.setCustomerId(1);

    System.out.println(customer1.getCustomerDetails(1));
    customer1.displayCustomerInfo();

    Customer customer2 = new Customer(2, "Jane Smith", "123 Main St", "Anytown", "CA", 12345, "123-456-7890", "jane.smith@email.com", 1000.0, true);
    System.out.println(customer2.getCustomerDetails(2));
    customer2.displayCustomerInfo();
	}
}
