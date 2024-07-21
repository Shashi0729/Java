public class IPad {
    String model;
    String processor;
    int ram;
    int storage;
    String graphics;

    IPad(String model, String processor, int ram, int storage, String graphics) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphics = graphics;
		System.out.println(model+","+processor+","+","+ram+","+storage+","+graphics);
    }

    public static void main(String[] args) {
        IPad l1 = new IPad("IPad Air", "Apple M1", 4, 128, "Apple GPU");
        IPad l2 = new IPad("IPad Pro", "Apple M2", 8, 256, "Apple GPU");
        IPad l3 = new IPad("IPad Mini", "Apple M1", 4, 128, "Apple GPU");
        IPad l4 = new IPad("IPad Gen 8", "Apple A12", 4, 128, "Apple GPU");
        IPad l5 = new IPad("IPad Pro 11", "Apple M2", 8, 256, "Apple GPU");
 }
}
