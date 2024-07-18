public class CharCount {
    public static void main(String[] args) {
        char[] array = {'s', 'h', 'a', 's', 'h', 'i'};
        int[] count = new int[256]; 

        for (char c : array) {
            count[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println("Count of " + (char)i + ": " + count[i]);
            }
        }
    }
}
