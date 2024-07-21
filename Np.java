class Np{
public static void main (String args[]){ 
int[] a={5,7,9,2,4,5,-1,0};
int countp=0;
int countn=0;
for(int i=0;i<=a.length-1;i++){
	

	if(a[i]<0){
		countn++;
		
		
	}else if(a[i]>0){
	countp++;
	
	}
	
}System.out.println("positive:"+countp);
System.out.println("negative:"+countn);


}

}