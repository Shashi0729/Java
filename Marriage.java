class Marriage{

String name;
int age;
String qualification;
float height; 

public Marriage(String name,int age,String qualification,float height){
	this.name=name;
	this.age=age;
	this.qualification=qualification;
	this.height=height;
	
}

public void getProfileDetails(String name){
	if(this.name == name){
		System.out.println("Groom Found...!");
		System.out.println("Groom name:"+name);
	}else{
		System.out.println("Groom Not Found...!");
	}
	
}
public void getProfileDetails(String name,int age){
	if(this.name == name && this.age==age){
		System.out.println("Groom Found...!");
		System.out.println("Groom name:"+name);
		System.out.println("Groom age:"+age);	
	}else{
		System.out.println("Groom Not Found...!");
	}
	
}
public void getProfileDetails(String name,int age,String qualification){
	if(this.name == name && this.age==age && this.qualification==qualification){
		System.out.println("Groom Found...!");
		System.out.println("Groom name:"+name);
		System.out.println("Groom age:"+age);
		System.out.println("Groom qualification:"+qualification);
	}else{
		System.out.println("Groom Not Found...!");
	}
	
	
}
public void getProfileDetails(String name,int age,String qualification,float height){
	if(this.name == name && this.age==age && this.qualification==qualification && this.height==height){
		System.out.println("Groom Found...!");
		System.out.println("Groom name:"+name);
		System.out.println("Groom age:"+age);
		System.out.println("Groom qualification:"+qualification);
		System.out.println("Groom height:"+height);
	}else{
		System.out.println("Groom Not Found...!");
	}
	
	
}

}