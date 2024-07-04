
public class GooglePayRunner {
    public static void main(String[] args) {
        GooglePay.Payment();
        GooglePay.PaymentDetails("TransactionId-123", 100.50);
        System.out.println(GooglePay.GetBalance());
        GooglePay.GetTransactionAmount("TransactionId-123");
    }
}



