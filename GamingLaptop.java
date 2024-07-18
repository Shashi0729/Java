
public class GamingLaptop {
    String brand, model, processor, graphicsCard, ram, storage, display, keyboard, batteryLife, coolingSystem;

    public GamingLaptop() {
        System.out.println("0 Arguments:");
    }

    public GamingLaptop(String brand) {
        this.brand = brand;
        System.out.println("1 Argument:");
        System.out.println(brand);
    }

    public GamingLaptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("2 Argument:");
        System.out.println(brand + " " + model);
    }

    public GamingLaptop(String brand, String model, String processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        System.out.println("3 Argument:");
        System.out.println(brand + " " + model + " " + processor);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        System.out.println("4 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard, String ram) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        System.out.println("5 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard + " " + ram);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard, String ram, String storage) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.storage = storage;
        System.out.println("6 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard + " " + ram + " " + storage);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard, String ram, String storage, String display) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        System.out.println("7 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard + " " + ram + " " + storage + " " + display);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard, String ram, String storage, String display, String keyboard) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        System.out.println("8 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard + " " + ram + " " + storage + " " + display + " " + keyboard);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard, String ram, String storage, String display, String keyboard, String batteryLife) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.batteryLife = batteryLife;
        System.out.println("9 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard + " " + ram + " " + storage + " " + display + " " + keyboard + " " + batteryLife);
    }

    public GamingLaptop(String brand, String model, String processor, String graphicsCard, String ram, String storage, String display, String keyboard, String batteryLife, String coolingSystem) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.batteryLife = batteryLife;
        this.coolingSystem = coolingSystem;
        System.out.println("10 Argument:");
        System.out.println(brand + " " + model + " " + processor + " " + graphicsCard + " " + ram + " " + storage + " " + display + " " + keyboard + " " + batteryLife+" "+coolingSystem);
