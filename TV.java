
public class TV {
    String brand, model, resolution, smartTV, hdmiPorts, screenSize, refreshRate, soundSystem, wifiConnectivity, bluetoothConnectivity;

    public TV() {
        System.out.println("0 Arguments:");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("1 Argument:");
        System.out.println(brand);
    }

    public TV(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("2 Argument:");
        System.out.println(brand + " " + model);
    }

    public TV(String brand, String model, String resolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        System.out.println("3 Argument:");
        System.out.println(brand + " " + model + " " + resolution);
    }

    public TV(String brand, String model, String resolution, String smartTV) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        System.out.println("4 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV);
    }

    public TV(String brand, String model, String resolution, String smartTV, String hdmiPorts) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        System.out.println("5 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV + " " + hdmiPorts);
    }

    public TV(String brand, String model, String resolution, String smartTV, String hdmiPorts, String screenSize) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        this.screenSize = screenSize;
        System.out.println("6 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV + " " + hdmiPorts + " " + screenSize);
    }

    public TV(String brand, String model, String resolution, String smartTV, String hdmiPorts, String screenSize, String refreshRate) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
        System.out.println("7 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV + " " + hdmiPorts + " " + screenSize + " " + refreshRate);
    }

    public TV(String brand, String model, String resolution, String smartTV, String hdmiPorts, String screenSize, String refreshRate, String soundSystem) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
        this.soundSystem = soundSystem;
        System.out.println("8 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV + " " + hdmiPorts + " " + screenSize + " " + refreshRate + " " + soundSystem);
    }

    public TV(String brand, String model, String resolution, String smartTV, String hdmiPorts, String screenSize, String refreshRate, String soundSystem, String wifiConnectivity) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
        this.soundSystem = soundSystem;
        this.wifiConnectivity = wifiConnectivity;
        System.out.println("9 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV + " " + hdmiPorts + " " + screenSize + " " + refreshRate + " " + soundSystem + " " + wifiConnectivity);
    }

    public TV(String brand, String model, String resolution, String smartTV, String hdmiPorts, String screenSize, String refreshRate, String soundSystem, String wifiConnectivity, String bluetoothConnectivity) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.hdmiPorts = hdmiPorts;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
        this.soundSystem = soundSystem;
        this.wifiConnectivity = wifiConnectivity;
		this.bluetoothConnectivity = bluetoothConnectivity;
        System.out.println("10 Argument:");
        System.out.println(brand + " " + model + " " + resolution + " " + smartTV + " " + hdmiPorts + " " + screenSize + " " + refreshRate + " " + soundSystem + " " + wifiConnectivity+" "+bluetoothConnectivity);
	}
}