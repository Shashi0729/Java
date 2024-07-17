class TVChannel{

 public String cname;
 public short price;
 public int cnum;
 public String[] cLang;
 
 public TVChannel(){
 System.out.println("Default Constructor");
 }

public TVChannel(String cname,short price,int cnum,String[] cLang){
this.cname=cname;
this.price=price;
this.cnum=cnum;
this.cLang=cLang;

 System.out.println("Channel name:"+cname);
  System.out.println("Channel price:"+price);
   System.out.println("Channel number:"+cnum);
    System.out.println("Channel Languages:");

for (int index=0;index<cLang.length;index++){
   System.out.println(cLang[index]);
}

}
public static void main(String[] args){
	
	TVChannel channel=new TVChannel();
	String[] cLang={"Kannada","Hindi","English","Tamil"};
		TVChannel channelval=new TVChannel("Zee",(short)120,812,cLang);	
}
}