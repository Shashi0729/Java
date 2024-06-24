class ExamRunner{
 public static void main(String args[]){
 
        System.out.println("Maths:"+Exam.Maths);
        System.out.println("Science:"+Exam.Science);
        System.out.println("English: " + Exam.English);
        System.out.println("History: " + Exam.History);
        System.out.println("Geography:" + Exam.Geography);
		int TotalMarks= Exam.Maths+Exam.Science+Exam.English+Exam.History+Exam.Geography;
 System.out.println("TotalMarks:" +TotalMarks);
 }

}