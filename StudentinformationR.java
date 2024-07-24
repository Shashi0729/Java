class StudentinformationR{
public static void main(String... args){
	int marks[]={50,65,86,54,32,52};
 Studentinformation student=new Studentinformation("Shashi",marks);
 
 double i=student.cavg();
 System.out.println("Avg is:"+i);
  System.out.println("highest is:"+student.findHighest());
  System.out.println("lowest is:"+student.findLowest());
 
 //student.Studentinformation("Shashi",491);

}
}