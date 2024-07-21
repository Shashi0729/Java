class Sort{
public static void main (String args[]){ 
int[] a={5,7,9,2,4,5};

for(int i=0;i<=a.length;i++){
	
	int temp=a[i];
	if(temp<a[i+1]){
		temp=a[i+1];
		a[i]=temp;
		
		System.out.println("sorted:"+a[i]);
	}
}


}

}