public class OpenAIRunner{
public static void main(String args[]){
OpenAI.chatGpt();
OpenAI.Monica();
OpenAI.chatGpt(true,1000,0);
OpenAI.Monica(false,100,0);
System.out.println(OpenAI.chatGpt2());
System.out.println(OpenAI.Monica2());
System.out.println(OpenAI.chatGpt2(true));
System.out.println(OpenAI.Monica2(false));




}
}