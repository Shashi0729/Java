class LiveDemo {
     int id;
     String name;
     boolean isActive;
     double amount;

 
    public LiveDemo() {
        this(0);
    }


    public LiveDemo(int id) {
        this(id, "Default Name");
    }

   
    public LiveDemo(int id, String name) {
        this(id, name, true); 
    }

    
    public LiveDemo(int id, String name, boolean isActive) {
        this(id, name, isActive, 1.0); 
    }

    
    public LiveDemo(int id, String name, boolean isActive, double amount) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.amount = amount;
        System.out.println("Initialized with: ID=" + id + ", Name='" + name + "', Active=" + isActive + ", Amount=" + amount);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public double getAmount() {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        LiveDemo instance1 = new LiveDemo();
        LiveDemo instance2 = new LiveDemo(201);
        LiveDemo instance3 = new LiveDemo(202, "Example Name");
        LiveDemo instance4 = new LiveDemo(203, "Inactive Example", false);
        LiveDemo instance5 = new LiveDemo(204, "Active Example", true, 5.5);
        LiveDemo instance6 = new LiveDemo(205, "Final Example", false, 10.0);
    }
}
