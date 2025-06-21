abstract class PaymentMethod {
    abstract void validate();
    abstract void processTransaction();
}

class CreditCard extends PaymentMethod {
    void validate() { 
        System.out.println("Validating Credit Card..."); 
    }
    void processTransaction() { 
        System.out.println("Processing Credit Card Payment"); 
    }
}

class PayPal extends PaymentMethod {
    void validate() { 
        System.out.println("Validating PayPal Account..."); 
    }
    void processTransaction() { 
        System.out.println("Processing PayPal Payment"); 
    }
}

class BankTransfer extends PaymentMethod {
    void validate() { 
        System.out.println("Validating Bank Transfer..."); 
    }
    void processTransaction() { 
        System.out.println("Processing Bank Transfer"); 
    }
}

public class Q2 {
    public static void main(String[] args) {
        PaymentMethod[] methods = {
            new CreditCard(),
            new PayPal(),
            new BankTransfer()
        };
        for (PaymentMethod m : methods) {
            m.validate();
            m.processTransaction();
        }
    }
}
