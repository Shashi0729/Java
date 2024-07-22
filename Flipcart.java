class Flipcart{

public Flipcart(){
	System.out.println("BIG BILLION DAY SALE.......!");
	System.out.println("");
}
public static void products(String item){
int laptopPrice=70000;
int mobilePrice=150000;
int shirtPrice=2000;
int pantPrice=5000;
int shoePrice=20000;
int bagPrice=1000;
	 if(item == "laptop"){
		 	System.out.println("Lenovo ideapad 330");
			System.out.println("Laptop original price:"+laptopPrice);
			System.out.println("20% Discount on price");
			double sum= (laptopPrice*20)/100;
			System.out.println("Laptop Discount price:"+sum);
			double total = laptopPrice - sum;
			System.out.println("Laptop total price is:"+total);
			System.out.println("");
		 
	 }else if(item == "mobile"){
		 	System.out.println("Samsung S24 Ultra 256GB");
			System.out.println("Mobile original price:"+mobilePrice);
			System.out.println("10% Discount on price");
			double sum= (mobilePrice*10)/100;
			System.out.println("mobilePrice Discount price:"+sum);
			double total = mobilePrice - sum;
			System.out.println("Laptop total price is:"+total);
			System.out.println("");
		 
	 }else if(item == "shirt"){
		 	System.out.println("Netplay for men");
			System.out.println("Shirt original price:"+shirtPrice);
			System.out.println("5% Discount on price");
			double sum= (shirtPrice*5)/100;
			System.out.println("Shirt Discount price:"+sum);
			double total = shirtPrice - sum;
			System.out.println("Shirt total price is:"+total);
			System.out.println("");
		 
	 }else if(item == "pant"){
		 	System.out.println("Raymonds ");
			System.out.println("Pant original price:"+pantPrice);
			System.out.println("15% Discount on price");
			double sum= (pantPrice*15)/100;
			System.out.println("Pant Discount price:"+sum);
			double total = pantPrice - sum;
			System.out.println("Pant total price is:"+total);
			System.out.println("");
		 
	 } else if(item == "shoes"){
		 	System.out.println("Nike Air");
			System.out.println("Shoe original price:"+shoePrice);
			System.out.println("17.5% Discount on price");
			double sum= (shoePrice*17.5)/100;
			System.out.println("Shoe Discount price:"+sum);
			double total = shoePrice - sum;
			System.out.println("Shoe total price is:"+total);
			System.out.println("");
		 
	 } else if(item == "bag"){
		 	System.out.println("PUMA Bagpack 500");
			System.out.println("Bag original price:"+bagPrice);
			System.out.println("20% Discount on price");
			double sum= (bagPrice*20)/100;
			System.out.println("Bag Discount price:"+sum);
			double total = bagPrice - sum;
			System.out.println("Bag total price is:"+total);
			System.out.println("");
		 
	    } 
	}
	 
	 	public Flipcart(String[] itemsname,int[] price)
		{
		 for(int i=0;i<=5;i++){
			 System.out.println("Item name:"+itemsname[i]);
			System.out.println("Item original price:"+price[i]);
			System.out.println("");
		}
	
}
public static void main(String[] args){
	String[] items={"Lenovo_ideapad_330","Samsung_S24_Ultra_256GB","Netplay_for_men","Raymonds","Nike_Air","PUMA_Bagpack_500"};
		int[] price={70000,150000,2000,5000,20000,1000};
	Flipcart fc = new Flipcart();
	products("bag");
	Flipcart allitems = new Flipcart(items,price);
}


}