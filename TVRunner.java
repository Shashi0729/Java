public class TVRunner {
    public static void main(String[] args) {
        TV tv0 = new TV();
        TV tv1 = new TV("Samsung");
        TV tv2 = new TV("Samsung", "4K");
        TV tv3 = new TV("Samsung", "4K", "50");
        TV tv4 = new TV("Samsung", "4K", "50", "LED");
        TV tv5 = new TV("Samsung", "4K", "50", "LED", "true");
        TV tv6 = new TV("Samsung", "4K", "50", "LED", "true","42inch");
        TV tv7 = new TV("Samsung", "4K", "50", "LED", "true", "42inch", "120hz");
        TV tv8 = new TV("Samsung", "4K", "50", "LED", "true", "42inch", "120hz", "JBL");
        TV tv9 = new TV("Samsung", "4K", "50", "LED", "true", "42inch", "120hz", "JBL", "WIFI6.0");
        TV tv10 = new TV("Samsung", "4K", "50", "LED", "true", "42inch", "120hz", "JBL", "WIFI6.0", "BT4.0");
    }
}

