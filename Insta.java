class Insta{
 public static void Usage(){
 
 System.out.println("Method 1");
 Insta.like();
 }
 
 public static void like(){
 
 System.out.println("Method 2");
 //Insta.Usage();
}
 static private  void main(String[] args){
Insta.Usage();

}
}