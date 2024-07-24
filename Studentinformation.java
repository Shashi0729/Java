class Studentinformation{
String sname;
int[] marks; 

public Studentinformation(String sname,int[] marks){
this.sname=sname;
this.marks=marks;
}

public double cavg(){
	int totalmarks=625;
	int sum=0;
	 for (int i=0;i<this.marks.length;i++){
       sum = sum+marks[i];
	}
	double avg=((double)sum/totalmarks)*100;
	return avg;
}
    public int findHighest() {
        int highest =this.marks[0];
        for (int i = 1; i < this.marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }
        return highest;
	
		}
		 public int findLowest() {
        int Lowest =this.marks[0];
        for (int i = 1; i < this.marks.length; i++) {
            if (marks[i] < Lowest) {
                Lowest = marks[i];
            }
        }
        return Lowest;

			
		}
	}





