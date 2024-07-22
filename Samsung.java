

public class Samsung {
 
  public Samsung() {
    this("Samsung", "Android");
	System.out.println("Displaying details...");
	System.out.println("");
  }

  public Samsung(String brand) {
    this(brand, "Android");
	System.out.println(brand);
	System.out.println("");
  }

  public Samsung(String brand, String os) {
    this(brand, os, 4);
	System.out.println(brand+" "+os);
	System.out.println("");
  }

  public Samsung(String brand, String os, int cameraCount) {
    this(brand, os, cameraCount, 5000);
	System.out.println(brand+" "+os+" "+cameraCount);
	System.out.println("");
  }

  public Samsung(String brand, String os, int cameraCount, int batteryLife) {
    System.out.println(brand+" "+os+" "+cameraCount+" "+batteryLife);
	System.out.println("");
  }


  public static void main(String[] args) {
    Samsung s1 = new Samsung();
   

    Samsung s2 = new Samsung("Samsung");
   

    Samsung s3 = new Samsung("Samsung", "Android");
   

    Samsung s4 = new Samsung("Samsung", "Android", 4);
 

    Samsung s5 = new Samsung("Samsung", "Android", 4, 5000);
    
  }
}


