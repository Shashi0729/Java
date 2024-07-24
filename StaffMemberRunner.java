public class StaffMemberRunner {
  public static void main(String[] args) {
    StaffMember staff1 = new StaffMember(1, "John Doe", "IT", 40000.0, false, "Software Engineer", "Chicago", 3, "BS", 4.0);
    staff1.displayStaffInfo();
    System.out.println(staff1.getStaffDetails());
    staff1.updateSalary(50000.0);
    staff1.promoteToManager();
    staff1.displayStaffInfo();

  }
}
