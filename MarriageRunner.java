public class MarriageRunner{
 public static void main(String... args){
 
 Marriage marry=new Marriage("Prashant",24,"B.E",5.0f);
 marry.getProfileDetails("Prashant");
 marry.getProfileDetails("Prashant",24);
 marry.getProfileDetails("Prashant",24,"B.E");
 marry.getProfileDetails("Prashant",24,"B.E",5.0f);
 
 }
}