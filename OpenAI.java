class OpenAI{

public static void chatGpt(){
boolean paid=true;
if(paid){
	System.out.println("chatGpt is paid AI");
}else{
	System.out.println("chatGpt is not paid AI");
	
}
System.out.println("");
}

public static void Monica(){
boolean paid=false;
if(paid){
	System.out.println("Monica is paid AI");
}else{
	System.out.println("Monica is not paid AI");
	
}
System.out.println("");
}
public static void chatGpt(boolean paid, int amount, int amount1){
if(paid){
	System.out.println("chatGpt is paid AI");
	System.out.println("Amount:"+amount);
}else{
	System.out.println("chatGpt is not paid AI");
	System.out.println("Amount:"+amount1);
	
}
System.out.println("");
}

public static void Monica(boolean paid, int amount, int amount1){

if(paid){
	System.out.println("Monica is paid AI");
		System.out.println("Amount:"+amount);
}else{
	System.out.println("Monica is not paid AI");
		System.out.println("Amount:"+amount1);
}
System.out.println("");
}

public static int chatGpt2(){
	boolean paid=true;
if(paid){
	System.out.println("chatGpt2 is paid AI");
	System.out.println("");
	return 1000;
}else{
	System.out.println("chatGpt2 is not paid AI");
	System.out.println("");
	return 0;
}

}

public static int Monica2(){
boolean paid=false;
if(paid){
	System.out.println("Monica2 is paid AI");
	System.out.println("");
	return 1000;
}else{
	System.out.println("Monica2 is not paid AI");
	System.out.println("");
	return 0;
}

}
public static int chatGpt2(boolean paid){
if(paid){
	System.out.println("chatGpt2 is paid AI");
	
	return 2000;
}else{
	System.out.println("chatGpt2 is not paid AI");
	
	return 0;
}

}

public static String Monica2(boolean paid){

if(paid){
	System.out.println("Monica2 is paid AI");
	
	return "paid";
}else{
	System.out.println("");
	System.out.println("Monica2 is not paid AI");

	return "not paid";
}

}
}