class Shop{

public String names[] = new String[4];
public int index=0;

public int getLenght(){
	return this.names.length;
	
}
 public void setName(String name){
	 if(this.index<this.getLenght()){
		 System.out.println("Array is not full");
		 System.out.println("Shops is:"+name);
		 this.names[index]=name;
		 index++;
	 }
	else{
		System.out.println("Array is full");
	}
 }
	 
	 public void displayElement(){
		 
		 for(int index=0;index<this.getLenght();index++){
			 System.out.println("Shop are:"+names[index]);
			 
		 }
	 }
	 
 }

