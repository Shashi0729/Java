class Price
{

public int prices[] = new int[4];
public int index=0;

public int getLenght(){
	return this.prices.length;
	
}
 public void setName(int price){
	 if(this.index<this.getLenght()){
		 System.out.println("Array is not full");
		 System.out.println("price is:"+price);
		 this.prices[index]=price;
		 index++;
	 }
	else{
		System.out.println("Array is full");
	}
 }
	 
	 public void displayElement(){
		 
		 for(int index=0;index<this.getLenght();index++){
			 System.out.println("Prices are:"+prices[index]);
			 
		 }
	 }
	 
 }

