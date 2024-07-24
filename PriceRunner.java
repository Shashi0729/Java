public class PriceRunner{

public static void main(String... args){
Price price=new Price();
int i=price.getLenght();
System.out.println("length is:"+i);
price.setName(100);
price.setName(200);
price.setName(300);
price.setName(400);
price.setName(500);
price.displayElement();

}

}