 class Customer {
 int customerId;
 String customerName;
   String address;
  String city;
   String state;
   int zip;
   String phone;
   String email;
   double creditLimit;
   boolean isActive;

  public Customer() {
    System.out.println("CUSTOMER DETAILS......!");
  }

  public Customer(int customerId, String customerName, String address, String city, String state, int zip, String phone, String email, double creditLimit, boolean isActive) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phone = phone;
    this.email = email;
    this.creditLimit = creditLimit;
    this.isActive = isActive;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }


  public String getCustomerDetails(int id) {
    return "Customer ID: " + id + ", Name: " + customerName;
  }

  public void displayCustomerInfo() {
    System.out.println("Customer ID: " + customerId);
    System.out.println("Customer Name: " + customerName);
    System.out.println("Address: " + address);
    System.out.println("City: " + city);
    System.out.println("State: " + state);
    System.out.println("Zip: " + zip);
    System.out.println("Phone: " + phone);
    System.out.println("Email: " + email);
    System.out.println("Credit Limit: " + creditLimit);
    System.out.println("Active Status: " + isActive);
  }
}
