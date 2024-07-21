
public class Lenovo {
    String model;
    String processor;
    int ram;
    int storage;
    String graphics;
	
    Lenovo(String model, String processor, int ram, int storage, String graphics) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphics = graphics;
		System.out.println(model+","+processor+","+","+ram+","+storage+","+graphics);
    }

    public static void main(String[] args) {
        Lenovo l1 = new Lenovo("ThinkPad", "Intel Core i3", 4, 128,"Nvidia");
		Lenovo l2 = new Lenovo("IdeaPad", "AMD Ryzen 5", 8, 256,"Nvidia");
		Lenovo l3 = new Lenovo("ThinkStation", "Intel Core i7", 16, 512,"Nvidia");
		Lenovo l4 = new Lenovo("Yoga", "Intel Core i5", 8, 256,"Nvidia");
		Lenovo l5 = new Lenovo("Legion", "AMD Ryzen 7", 16, 512,"Nvidia");

    }
}
