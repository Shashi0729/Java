class Method_OL{
public static void Method(){
	System.out.println("Method is loaded");
}
public static void Method(int id){
	System.out.println("Method id id:"+id);
}
public static void Method(int id, char name){
	System.out.println("Method name:"+name);
}
public static void Method(int id,char name,int parameters){
	System.out.println("Method parameters size:"+parameters);
}
public static void Method(int id, char name,int parameters, int method_number){
	System.out.println("Method Number:"+method_number);
}
public static String Method(int id,char name,int parameters, int method_number, char Developer){
	System.out.println("Method Developer name:"+Developer);
	return Developer;
}
public static int Method(int id,char name,int parameters, int method_number, char Developer, int Dev_id){
	System.out.println("Method Developer id:"+ Dev_id);
	return Dev_id;
}
public static String Method(int id,char name,int parameters, int method_number, char Developer, int Dev_id, char Dev_type){
	System.out.println("Method Developer Type:"+Dev_type);
	return Dev_type;
}
public static int Method(int id,char name,int parameters, int method_number, char Developer, int Dev_id, char Dev_type, int salary){
	System.out.println("Method Developer salary:"+salary);
	return salary;
	
}//non primitive

public static void Method(String Company){
	if(Company == "Xworkz"){
		System.out.println("Company name:"+Company);
	}
	
}
public static void Method( String Company,int id){
	
	if(Company!="Kodnest" || id == 001){
		System.out.println("Company name:"+Company);
		System.out.println("Company id:"+id);
	}
	
}
public static void Method(String Company,int id, String... Branches){
	if(Company =="Xworkz" || id == 001 && Branches[2] == "BTM"){
		System.out.println("Company name:"+Company);
		System.out.println("Company id:"+id);
		System.out.println("Company Branches:"+Branches[2]);
	}
}
public static void Method(String Company,int id,int... Branch_ids){
		if(Company!="Xworkz" || id == 002 && Branch_ids[2] == 0022){
		System.out.println("Company name:"+Company);
		System.out.println("Company id:"+id);
		System.out.println("Company Branches:"+Branch_ids[2]);
	}
}
}