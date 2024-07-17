public class Vehicle {
    int speed;
    float fuelCapacity;
    String[] color;
    short wheels;
    boolean isRunning;

    public Vehicle(int s, float fc, String[] c, short w, boolean ir) {
        speed = s;
        fuelCapacity = fc;
        color = c;
        wheels = w;
        isRunning = ir;
    

   
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Capacity: " + fuelCapacity);
		for(int index=0;index<c.length;index++){
        System.out.println("Color: " + color[index]);
		}
        System.out.println("Wheels: " + wheels);
        System.out.println("Is Running: " + isRunning);
    }

    public static void main(String[] args) {
		String cl[]={"RED","BLUE","Green","Yellow"};
		
        Vehicle vehicle1 = new Vehicle(120, 50.0f, cl, (short) 4, true);
        Vehicle vehicle2 = new Vehicle(150, 60.0f, cl, (short) 4, false);
        Vehicle vehicle3 = new Vehicle(100, 40.0f, cl, (short) 4, true);
        Vehicle vehicle4 = new Vehicle(180, 70.0f, cl, (short) 4, false);

     
    }
}
