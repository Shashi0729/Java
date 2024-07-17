
public class CheckNumber {
    public void check(int num) {
        
int sum = 0;

for (int i = num; i >= 1; i--) {
    sum += i;
    }
	System.out.println(" total: " + sum);
}

    public static void main(String[] args) {
        CheckNumber check = new CheckNumber();
		check.check(3);
        check.check(4);
        check.check(5);
        check.check(10);
    }
}