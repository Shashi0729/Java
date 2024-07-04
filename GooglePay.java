class GooglePay {
public static void Payment() {
if (true) {
System.out.println("Google Pay Payment Success");
} else {
System.out.println("Google Pay Payment Failed");
}
}

public static void PaymentDetails(String transactionId, double amount) {
    if (transactionId != null) {
        System.out.println("Payment Details: " + transactionId + ", " + amount);
    } else {
        System.out.println("Transaction Id is null");
    }
}

public static int GetBalance() {
    if (true) {
        return 100;
    } else {
        return 0;
    }
}

public static double GetTransactionAmount(String transactionId) {
    if (transactionId != null) {
        return 50.50;
    } else {
        return 0.0;
    }
}

}

