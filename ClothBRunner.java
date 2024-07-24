public class ClothBRunner{

public static void main(String... args){
ClothB cloth=new ClothB();
int i=cloth.getLenght();
System.out.println("length is:"+i);
cloth.setBrand("PUMA");
cloth.setBrand("ADIDAS");
cloth.setBrand("POLO");
cloth.setBrand("ONE8");
cloth.setBrand("NIKE");
cloth.displayElement();

}

}