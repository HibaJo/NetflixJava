package Authentication.Finance;

public class PaymentMethod {

    private String holder_name;

    private Date expiration; // Date of expiration

    private Type type; // Enum

    private int number;

    public PaymentMethod(String holder_name, int month, int year, int choice, int number) {
        switch (choice) {
            case 1:
                this.type = Type.VISA;
                break;
            case 2:
                this.type = Type.MASTERCARD;
                break;
            case 3:
                this.type = Type.AMERICANEXPRESS;
                break;
        }
    }
    
}
