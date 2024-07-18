
public class SuperBikes {
    String brand, model, engineType, horsePower, torque, transmission, fuelCapacity, fuelEfficiency, topSpeed, color, ABS, wheelType;

    public SuperBikes() {
        System.out.println("0 Arguments:");
    }

    public SuperBikes(String brand) {
        this.brand = brand;
        System.out.println("1 Argument:");
        System.out.println(brand);
    }

    public SuperBikes(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("2 Argument:");
        System.out.println(brand + " " + model);
    }

    public SuperBikes(String brand, String model, String engineType) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        System.out.println("3 Argument:");
        System.out.println(brand + " " + model + " " + engineType);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        System.out.println("4 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower, String torque) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.torque = torque;
        System.out.println("5 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower + " " + torque);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower, String torque, String transmission) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.torque = torque;
        this.transmission = transmission;
        System.out.println("6 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower + " " + torque + " " + transmission);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower, String torque, String transmission, String fuelCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.torque = torque;
        this.transmission = transmission;
        this.fuelCapacity = fuelCapacity;
        System.out.println("7 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower + " " + torque + " " + transmission + " " + fuelCapacity);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower, String torque, String transmission, String fuelCapacity, String fuelEfficiency) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.torque = torque;
        this.transmission = transmission;
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
        System.out.println("8 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower + " " + torque + " " + transmission + " " + fuelCapacity + " " + fuelEfficiency);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower, String torque, String transmission, String fuelCapacity, String fuelEfficiency, String topSpeed) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.torque = torque;
        this.transmission = transmission;
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
        this.topSpeed = topSpeed;
        System.out.println("9 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower + " " + torque + " " + transmission + " " + fuelCapacity + " " + fuelEfficiency + " " + topSpeed);
    }

    public SuperBikes(String brand, String model, String engineType, String horsePower, String torque, String transmission, String fuelCapacity, String fuelEfficiency, String topSpeed, String color) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.torque = torque;
        this.transmission = transmission;
        this.fuelCapacity = fuelCapacity;
        this.fuelEfficiency = fuelEfficiency;
        this.topSpeed = topSpeed;
		this.color = color;
        System.out.println("10 Argument:");
        System.out.println(brand + " " + model + " " + engineType + " " + horsePower + " " + torque + " " + transmission + " " + fuelCapacity + " " + fuelEfficiency + " " + topSpeed+" "+color);
		}
}
