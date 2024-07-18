public class NumberCount {
    public static void main(String[] args) {
        int[] array = {1,2,1,4,3,2,4,1,2,3,1,3,3,2,4,5,6,7,6,5,1,5,6,5,6,5,6,2,3,9,8,7,6,5,2,1,3,1,4,5,6,6,5,6,7,8,7,5,4,4,5,6,7,8,9,0,0,8,7,8,0,0,3,2,1,3,4,5,6,7,5,8,9,9,9,9,0,0,0,0,7,6,4,3,6,2,1,2,3,3,5,6,6};
        int[] count = new int[10]; 

        for (int c : array) {
            count[c]++;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println("Count of " + i + ": " + count[i]);
            }
        }
    }
}
