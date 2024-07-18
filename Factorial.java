public class Factorial {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            int factorial = calculateFactorial(array[i]);
            System.out.println("Factorial of " + array[i] + " is " + factorial);
        }
    }

    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
