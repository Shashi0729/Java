class Days{
public static void main (String args[]){ 
String[] a={"MON","TUE","WED","THU","FRI","SAT","SUN"};

for(int i=0;i<=a.length-1;i++){
	

	if(a[i]=="SAT" || a[i]=="SUN"){
	System.out.println("Weekend:"+a[i]);
		
		
	}else{
	System.out.println("Workingdays:"+a[i]);
	
	}
	
}



}

}