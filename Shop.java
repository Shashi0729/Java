class Shop{

public String names[] = new String[4];
public int index=0;

public int getLenght(){
	return this.names.length;
	
}
 public void setName(String name){
	 if(this.index<this.getLenght()){
		// System.out.println("Array is not full");
		 //System.out.println("Shops is:"+name);
		 this.names[index]=name;
		 index++;
	 }
	else{
		//System.out.println("Array is full");
	}
 }
	 
	 public void displayElement(){
		 
		 for(int index=0;index<this.getLenght();index++){
			 System.out.println("Shop are:"+names[index]);
			 
		 }
	 }
	 
	 	 //search
	  public String searchName(String name){
	  for(String index : names){
	 if(index == name){
		  System.out.println("Shops is:"+index);
		  return "Shop found.";
	 }
	
	  }return "not found";
 }
 //update
 	  public String updateName(String oldName, String newName){
	  for(int i=0;i<this.getLenght();i++){
	 if(oldName==names[i]){
		  names[i]=newName;
		  return "Updated";
	 }
	
	  }return "not found";
 }
 
 //Delete
 	  public String deleteName(String ShopName){
	  for(int i=0;i<this.getLenght();i++){
	 if(ShopName==names[i]){
		  names[i]=null;
		  return "Deleted";
	 }
	
	  }return "not found";
 }
 }

