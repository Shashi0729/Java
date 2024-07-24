class Employeeinformation{
String ename;
int[] sal; 

public Employeeinformation(String ename,int[] sal){
this.ename=ename;
this.sal=sal;
}

public double tavg(){
	int sum=0;
	 for (int i=0;i<this.sal.length;i++){
       sum = sum+sal[i];
	}
	return sum;
}

public double savg(){
	int months=12;
	int sum=0;
	 for (int i=0;i<this.sal.length;i++){
       sum = sum+sal[i];
	}
	double avg=(sum/months);
	return avg;
}
    public int findHighest() {
      //  int highest =sal[0];
        for (int i = 1; i < this.sal.length; i++) {
            if (sal[i] > sal[0]) {
                highest = sal[i];
            }
        }
        return highest;
	
		}
		 public int findLowest() {
        int Lowest =this.sal[0];
        for (int i = 1; i < this.sal.length; i++) {
            if (sal[i] < Lowest) {
                Lowest = sal[i];
            }
        }
        return Lowest;

			
		}
	}





