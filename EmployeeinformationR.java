class EmployeeinformationR{
public static void main(String... args){
	int sal[]={50000,65000,86000,54000,32000,52000};
 Employeeinformation emp=new Employeeinformation("Shashi",sal);
 
 double i=emp.savg();
 System.out.println("Avg is:"+i);
  System.out.println("highest is:"+emp.findHighest());
  System.out.println("lowest is:"+emp.findLowest());
  System.out.println("total is:"+emp.tavg());
 
 //student.Studentinformation("Shashi",491);

}
}