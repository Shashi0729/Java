public class DmartRunner{

public static void main(String... args){
Dmart shop=new Dmart();
int i=shop.getLenght();
System.out.println("length is:"+i);
shop.setName("TOWEL");
shop.setName("SOAP");
shop.setName("BRUSH");
shop.setName("BAG");
shop.setName("7UP");
shop.displayElement();

System.out.println("-----Search-----");
String RETURN=shop.searchName("BAG");
System.out.println(RETURN);
System.out.println("-----Update-----");
String UPDATE=shop.updateName("BAG","TOOTHPASTE");
System.out.println(UPDATE);
shop.displayElement();
System.out.println("-----Delete-----");
String DELETE=shop.deleteName("SOAP");
System.out.println(DELETE);
shop.displayElement();

}

}