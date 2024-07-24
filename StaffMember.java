
public class StaffMember {
  private int staffId;
  private String staffName;
  private String department;
  private double salary;
  private boolean isManager;
  private String jobTitle;
  private String location;
  private int yearsOfService;
  private String highestEducation;
  private double performanceRating;

  public StaffMember() {
 System.out.println("STAFFMEMBER DETAILS...!");
  }

  public StaffMember(int staffId, String staffName, String department, double salary, boolean isManager, String jobTitle, String location, int yearsOfService, String highestEducation, double performanceRating) {
    this.staffId = staffId;
    this.staffName = staffName;
    this.department = department;
    this.salary = salary;
    this.isManager = isManager;
    this.jobTitle = jobTitle;
    this.location = location;
    this.yearsOfService = yearsOfService;
    this.highestEducation = highestEducation;
    this.performanceRating = performanceRating;
  }


  public void displayStaffInfo() {
    System.out.println("Staff ID: " + staffId);
    System.out.println("Staff Name: " + staffName);
    System.out.println("Department: " + department);
    System.out.println("Salary: " + salary);
    System.out.println("Manager Status: " + isManager);
    System.out.println("Job Title: " + jobTitle);
    System.out.println("Location: " + location);
    System.out.println("Years of Service: " + yearsOfService);
    System.out.println("Highest Education: " + highestEducation);
    System.out.println("Performance Rating: " + performanceRating);
  }

  public String getStaffDetails() {
    return "Staff ID: " + staffId + ", Name: " + staffName;
  }

  public void updateSalary(double newSalary) {
    this.salary = newSalary;
  }

  public void promoteToManager() {
    this.isManager = true;
  }
}

