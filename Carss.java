 class Car {
    
    int carId;
    String make;
    String model;
    int year;
    String color;
    String fuelType;
    double engineSize;
    int horsepower;
    int mileage;
    double price;
    String vin;
    String licensePlate;
    boolean isAvailable;

    static int carIdStatic;
    static String makeStatic;
    static String modelStatic;
    static int yearStatic;
    static String colorStatic;
    static String fuelTypeStatic;
    static double engineSizeStatic;
    static int horsepowerStatic;
    static int mileageStatic;
    static double priceStatic;
    static String vinStatic;
    static String licensePlateStatic;
    static boolean isAvailableStatic;

  
    public Car() {}

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carId = 1001;
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;
        car1.color = "Silver";
        car1.fuelType = "Gasoline";
        car1.engineSize = 2.5;
        car1.horsepower = 203;
        car1.mileage = 25000;
        car1.price = 25000.0;
        car1.vin = "1HGCM82633A123456";
        car1.licensePlate = "ABC123";
        car1.isAvailable = true;

        Car car2 = new Car();
        car2.carId = 1002;
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2018;
        car2.color = "Blue";
        car2.fuelType = "Gasoline";
        car2.engineSize = 2.0;
        car2.horsepower = 158;
        car2.mileage = 35000;
        car2.price = 18000.0;
        car2.vin = "2HGCM82643A654321";
        car2.licensePlate = "XYZ456";
        car2.isAvailable = true;

        Car car3 = new Car();
        car3.carId = 1003;
        car3.make = "Ford";
        car3.model = "Mustang";
        car3.year = 2021;
        car3.color = "Red";
        car3.fuelType = "Gasoline";
        car3.engineSize = 5.0;
        car3.horsepower = 460;
        car3.mileage = 10000;
        car3.price = 45000.0;
        car3.vin = "3FAHP38N87R123456";
        car3.licensePlate = "DEF789";
        car3.isAvailable = false;

        Car car4 = new Car();
        car4.carId = 1004;
        car4.make = "Chevrolet";
        car4.model = "Silverado";
        car4.year = 2019;
        car4.color = "White";
        car4.fuelType = "Gasoline";
        car4.engineSize = 5.3;
        car4.horsepower = 355;
        car4.mileage = 25000;
        car4.price = 35000.0;
        car4.vin = "1GCUYDED2KZ123456";
        car4.licensePlate = "GHI012";
        car4.isAvailable = true;

        Car car5 = new Car();
        car5.carId = 1005;
        car5.make = "Nissan";
        car5.model = "Altima";
        car5.year = 2017;
        car5.color = "Gray";
        car5.fuelType = "Gasoline";
        car5.engineSize = 2.5;
        car5.horsepower = 179;
        car5.mileage = 45000;
        car5.price = 15000.0;
        car5.vin = "1N4AL3AP9HC123456";
        car5.licensePlate = "JKL345";
        car5.isAvailable = false;
		


Car car6 = new Car();
car6.carId = 1006;
car6.make = "Ford";
car6.model = "Fusion";
car6.year = 2018;
car6.color = "Silver";
car6.fuelType = "Gasoline";
car6.engineSize = 2.0;
car6.horsepower = 240;
car6.mileage = 32000;
car6.price = 18000.0;
car6.vin = "1FA6P3K90H123456";
car6.licensePlate = "ABC789";
car6.isAvailable = true;

Car car7 = new Car();
car7.carId = 1007;
car7.make = "Toyota";
car7.model = "Camry";
car7.year = 2019;
car7.color = "White";
car7.fuelType = "Gasoline";
car7.engineSize = 2.5;
car7.horsepower = 203;
car7.mileage = 15000;
car7.price = 22000.0;
car7.vin = "4T1BF1FK9HU123456";
car7.licensePlate = "DEF456";
car7.isAvailable = false;

Car car8 = new Car();
car8.carId = 1008;
car8.make = "Honda";
car8.model = "Civic";
car8.year = 2016;
car8.color = "Black";
car8.fuelType = "Gasoline";
car8.engineSize = 1.8;
car8.horsepower = 158;
car8.mileage = 50000;
car8.price = 12000.0;
car8.vin = "19XFC2F56HE123456";
car8.licensePlate = "GHI789";
car8.isAvailable = true;

Car car9 = new Car();
car9.carId = 1009;
car9.make = "Nissan";
car9.model = "Sentra";
car9.year = 2017;
car9.color = "Red";
car9.fuelType = "Gasoline";
car9.engineSize = 1.8;
car9.horsepower = 130;
car9.mileage = 60000;
car9.price = 10000.0;
car9.vin = "3N1AB7AP5HY123456";
car9.licensePlate = "JKL012";
car9.isAvailable = false;

Car car10 = new Car();
car10.carId = 1010;
car10.make = "Chevrolet";
car10.model = "Cruze";
car10.year = 2018;
car10.color = "Blue";
car10.fuelType = "Gasoline";
car10.engineSize = 1.4;
car10.horsepower = 153;
car10.mileage = 40000;
car10.price = 14000.0;
car10.vin = "1G1BE5SM8J123456";
car10.licensePlate = "MNO345";
car10.isAvailable = true;
 

Car car11 = new Car();
car11.carId = 1011;
car11.make = "Kia";
car11.model = "Optima";
car11.year = 2019;
car11.color = "White";
car11.fuelType = "Gasoline";
car11.engineSize = 2.4;
car11.horsepower = 185;
car11.mileage = 20000;
car11.price = 18000.0;
car11.vin = "5XXGT4L35HG123456";
car11.licensePlate = "PQR678";
car11.isAvailable = true;

Car car12 = new Car();
car12.carId = 1012;
car12.make = "Hyundai";
car12.model = "Sonata";
car12.year = 2018;
car12.color = "Gray";
car12.fuelType = "Gasoline";
car12.engineSize = 2.4;
car12.horsepower = 185;
car12.mileage = 30000;
car12.price = 16000.0;
car12.vin = "5NPE34AF8JH123456";
car12.licensePlate = "STU901";
car12.isAvailable = false;

Car car13 = new Car();
car13.carId = 1013;
car13.make = "Volkswagen";
car13.model = "Passat";
car13.year = 2017;
car13.color = "Silver";
car13.fuelType = "Gasoline";
car13.engineSize = 1.8;
car13.horsepower = 170;
car13.mileage = 50000;
car13.price = 14000.0;
car13.vin = "1VWAS7A25JC123456";
car13.licensePlate = "VWX234";
car13.isAvailable = true;


Car car14 = new Car();
car14.carId = 1014;
car14.make = "BMW";
car14.model = "3 Series";
car14.year = 2019;
car14.color = "Black";
car14.fuelType = "Gasoline";
car14.engineSize = 2.0;
car14.horsepower = 248;
car14.mileage = 15000;
car14.price = 28000.0;
car14.vin = "WBA8A3G55JG123456";
car14.licensePlate = "YZW159";
car14.isAvailable = true;

Car car15 = new Car();
car15.carId = 1015;
car15.make = "Audi";
car15.model = "A4";
car15.year = 2018;
car15.color = "White";
car15.fuelType = "Gasoline";
car15.engineSize = 2.0;
car15.horsepower = 220;
car15.mileage = 25000;
car15.price = 23000.0;
car15.vin = "WAU3AFC5JN123456";
car15.licensePlate = "ABC123";
car15.isAvailable = false;

Car car16 = new Car();
car16.carId = 1016;
car16.make = "Mercedes-Benz";
car16.model = "C-Class";
car16.year = 2019;
car16.color = "Gray";
car16.fuelType = "Gasoline";
car16.engineSize = 2.0;
car16.horsepower = 241;
car16.mileage = 10000;
car16.price = 29000.0;
car16.vin = "WDDZF4GBXKN123456";
car16.licensePlate = "DEF456";
car16.isAvailable = true;


Car car17 = new Car();
car17.carId = 1017;
car17.make = "Lexus";
car17.model = "IS";
car17.year = 2018;
car17.color = "Silver";
car17.fuelType = "Gasoline";
car17.engineSize = 2.0;
car17.horsepower = 241;
car17.mileage = 20000;
car17.price = 26000.0;
car17.vin = "JTHCE5BF8J123456";
car17.licensePlate = "GHI789";
car17.isAvailable = true;



car1.carIdStatic = 1001;
car1.makeStatic = "Toyota";
car1.modelStatic = "Corolla";
car1.yearStatic = 2015;
car1.colorStatic = "White";
car1.fuelTypeStatic = "Gasoline";
car1.engineSizeStatic = 1.8;
car1.horsepowerStatic = 140;
car1.mileageStatic = 50000;
car1.priceStatic = 12000.0;
car1.vinStatic = "1NXBAECEDJA123456";
car1.licensePlateStatic = "ABC123";
car1.isAvailableStatic = true;

car2.carIdStatic = 1002;
car2.makeStatic = "Honda";
car2.modelStatic = "Civic";
car2.yearStatic = 2016;
car2.colorStatic = "Black";
car2.fuelTypeStatic = "Gasoline";
car2.engineSizeStatic = 2.0;
car2.horsepowerStatic = 158;
car2.mileageStatic = 30000;
car2.priceStatic = 15000.0;
car2.vinStatic = "19XFC2F56HE123456";
car2.licensePlateStatic = "DEF456";
car2.isAvailableStatic = false;

car3.carIdStatic = 1003;
car3.makeStatic = "Ford";
car3.modelStatic = "Focus";
car3.yearStatic = 2017;
car3.colorStatic = "Red";
car3.fuelTypeStatic = "Gasoline";
car3.engineSizeStatic = 2.0;
car3.horsepowerStatic = 160;
car3.mileageStatic = 20000;
car3.priceStatic = 18000.0;
car3.vinStatic = "1FADP3K90HL123456";
car3.licensePlateStatic = "GHI789";
car3.isAvailableStatic = true;

car4.carIdStatic = 1004;
car4.makeStatic = "Nissan";
car4.modelStatic = "Sentra";
car4.yearStatic = 2018;
car4.colorStatic = "Silver";
car4.fuelTypeStatic = "Gasoline";
car4.engineSizeStatic = 1.8;
car4.horsepowerStatic = 130;
car4.mileageStatic = 10000;
car4.priceStatic = 20000.0;
car4.vinStatic = "3N1AB7AP5HY123456";
car4.licensePlateStatic = "JKL012";
car4.isAvailableStatic = false;

car5.carIdStatic = 1005;
car5.makeStatic = "Chevrolet";
car5.modelStatic = "Cruze";
car5.yearStatic = 2019;
car5.colorStatic = "Blue";
car5.fuelTypeStatic = "Gasoline";
car5.engineSizeStatic = 1.4;
car5.horsepowerStatic = 153;
car5.mileageStatic = 5000;
car5.priceStatic = 22000.0;
car5.vinStatic = "1G1BE5SM8J123456";
car5.licensePlateStatic = "MNO345";
car5.isAvailableStatic = true;

Here are the variables with random values assigned for car6 to car10:

car6.carIdStatic = 1006;
car6.makeStatic = "Kia";
car6.modelStatic = "Optima";
car6.yearStatic = 2019;
car6.colorStatic = "White";
car6.fuelTypeStatic = "Gasoline";
car6.engineSizeStatic = 2.4;
car6.horsepowerStatic = 185;
car6.mileageStatic = 20000;
car6.priceStatic = 18000.0;
car6.vinStatic = "5XXGT4L35HG123456";
car6.licensePlateStatic = "PQR678";
car6.isAvailableStatic = true;

car7.carIdStatic = 1007;
car7.makeStatic = "Hyundai";
car7.modelStatic = "Sonata";
car7.yearStatic = 2018;
car7.colorStatic = "Gray";
car7.fuelTypeStatic = "Gasoline";
car7.engineSizeStatic = 2.4;
car7.horsepowerStatic = 185;
car7.mileageStatic = 30000;
car7.priceStatic = 16000.0;
car7.vinStatic = "5NPE34AF8JH123456";
car7.licensePlateStatic = "STU901";
car7.isAvailableStatic = false;

car8.carIdStatic = 1008;
car8.makeStatic = "Volkswagen";
car8.modelStatic = "Passat";
car8.yearStatic = 2017;
car8.colorStatic = "Silver";
car8.fuelTypeStatic = "Gasoline";
car8.engineSizeStatic = 1.8;
car8.horsepowerStatic = 170;
car8.mileageStatic = 50000;
car8.priceStatic = 14000.0;
car8.vinStatic = "1VWAS7A25JC123456";
car8.licensePlateStatic = "VWX234";
car8.isAvailableStatic = true;


car9.carIdStatic = 1009;
car9.makeStatic = "BMW";
car9.modelStatic = "3 Series";
car9.yearStatic = 2019;
car9.colorStatic = "Black";
car9.fuelTypeStatic = "Gasoline";
car9.engineSizeStatic = 2.0;
car9.horsepowerStatic = 248;
car9.mileageStatic = 15000;
car9.priceStatic = 28000.0;
car9.vinStatic = "WBA8A3G55JG123456";
car9.licensePlateStatic = "YZW159";
car9.isAvailableStatic = true;

car10.carIdStatic = 1010;
car10.makeStatic = "Audi";
car10.modelStatic = "A4";
car10.yearStatic = 2018;
car10.colorStatic = "White";
car10.fuelTypeStatic = "Gasoline";
car10.engineSizeStatic = 2.0;
car10.horsepowerStatic = 220;
car10.mileageStatic = 25000;
car10.priceStatic = 23000.0;
car10.vinStatic = "WAU3AFC5JN123456";
car10.licensePlateStatic = "ABC123";
car10.isAvailableStatic = false;

car11.carIdStatic = 1011;
car11.makeStatic = "Mercedes-Benz";
car11.modelStatic = "C-Class";
car11.yearStatic = 2019;
car11.colorStatic = "Gray";
car11.fuelTypeStatic = "Gasoline";
car11.engineSizeStatic = 2.0;
car11.horsepowerStatic = 241;
car11.mileageStatic = 10000;
car11.priceStatic = 29000.0;
car11.vinStatic = "WDDZF4GBXKN123456";
car11.licensePlateStatic = "DEF456";
car11.isAvailableStatic = true;

car12.carIdStatic = 1012;
car12.makeStatic = "Lexus";
car12.modelStatic = "IS";
car12.yearStatic = 2018;
car12.colorStatic = "Silver";
car12.fuelTypeStatic = "Gasoline";
car12.engineSizeStatic = 2.0;
car12.horsepowerStatic = 241;
car12.mileageStatic = 20000;
car12.priceStatic = 26000.0;
car12.vinStatic = "JTHCE5BF8J123456";
car12.licensePlateStatic = "GHI789";
car12.isAvailableStatic = false;

car13.carIdStatic = 1013;
car13.makeStatic = "Toyota";
car13.modelStatic = "Camry";
car13.yearStatic = 2017;
car13.colorStatic = "Red";
car13.fuelTypeStatic = "Gasoline";
car13.engineSizeStatic = 2.5;
car13.horsepowerStatic = 203;
car13.mileageStatic = 50000;
car13.priceStatic = 20000.0;
car13.vinStatic = "4T1BF1FK9HU123456";
car13.licensePlateStatic = "JKL012";
car13.isAvailableStatic = true;

Here are the variables with random values assigned for car14 to car17:

car14.carIdStatic = 1014;
car14.makeStatic = "Ford";
car14.modelStatic = "Mustang";
car14.yearStatic = 2019;
car14.colorStatic = "Black";
car14.fuelTypeStatic = "Gasoline";
car14.engineSizeStatic = 5.0;
car14.horsepowerStatic = 460;
car14.mileageStatic = 10000;
car14.priceStatic = 40000.0;
car14.vinStatic = "1FA6P8CF3H123456";
car14.licensePlateStatic = "MNO345";
car14.isAvailableStatic = true;

car15.carIdStatic = 1015;
car15.makeStatic = "Chevrolet";
car15.modelStatic = "Camaro";
car15.yearStatic = 2018;
car15.colorStatic = "Red";
car15.fuelTypeStatic = "Gasoline";
car15.engineSizeStatic = 6.2;
car15.horsepowerStatic = 455;
car15.mileageStatic = 20000;
car15.priceStatic = 35000.0;
car15.vinStatic = "1G1FD2D7XH123456";
car15.licensePlateStatic = "PQR678";
car15.isAvailableStatic = false;

car16.carIdStatic = 1016;
car16.makeStatic = "Dodge";
car16.modelStatic = "Challenger";
car16.yearStatic = 2019;
car16.colorStatic = "White";
car16.fuelTypeStatic = "Gasoline";
car16.engineSizeStatic = 6.4;
car16.horsepowerStatic = 485;
car16.mileageStatic = 15000;
car16.priceStatic = 42000.0;
car16.vinStatic = "2C3CDZHGXJH123456";
car16.licensePlateStatic = "STU901";
car16.isAvailableStatic = true;

car17.carIdStatic = 1017;
car17.makeStatic = "Nissan";
car17.modelStatic = "GT-R";
car17.yearStatic = 2018;
car17.colorStatic = "Silver";
car17.fuelTypeStatic = "Gasoline";
car17.engineSizeStatic = 3.8;
car17.horsepowerStatic = 600;
car17.mileageStatic = 10000;
car17.priceStatic = 80000.0;
car17.vinStatic = "JN1AR5EF8J123456";
car17.licensePlateStatic = "VWX234";
car17.isAvailableStatic = true;


    }
}
