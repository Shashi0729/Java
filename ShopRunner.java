public class ShopRunner{

public static void main(String... args){
Shop shop=new Shop();
int i=shop.getLenght();
System.out.println("length is:"+i);
shop.setName("BSC");
shop.setName("ORIAN");
shop.setName("MALL OF ASIA");
shop.setName("MANTRI MALL");
shop.setName("SUDARSHAN");
shop.displayElement();

System.out.println("-----Search-----");
String RETURN=shop.searchName("BSC");
System.out.println(RETURN);
System.out.println("-----Update-----");
String UPDATE=shop.updateName("BSC","GT MALL");
System.out.println(UPDATE);
shop.displayElement();
System.out.println("-----Delete-----");
String DELETE=shop.deleteName("GT MALL");
System.out.println(DELETE);
shop.displayElement();

}

}