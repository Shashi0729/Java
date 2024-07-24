class ClothB{

public String name[] = new String[4];
public int index=0;

public int getLenght(){
	return this.name.length;
	
}
 public void setBrand(String element ){
	 if(this.index<this.getLenght()){
		 System.out.println("Array is not full");
		 System.out.println("Brand is:"+element);
		 this.name[index]=element;
		 index++;
	 }
	else{
		System.out.println("Array is full");
	}
 }
	 
	 public void displayElement(){
		 
		 for(int index=0;index<this.getLenght();index++){
			 System.out.println("Brands are:"+name[index]);
			 
		 }
	 }
 }

