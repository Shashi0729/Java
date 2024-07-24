public class Calculator2R {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.5)); 
        System.out.println(calculator.add(1, 2, 3)); 
        System.out.println(calculator.add(1.5, 2.5, 3.5)); 
    }
}
