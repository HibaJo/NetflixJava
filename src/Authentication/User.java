package Authentication;

import Platform.Component.Request;
import Authentication.Finance.PaymentMethod;
import Customization.Profile;

public class User {

    private String phone;

    private Profile profile; // List or Array

    private Request requests; // List or Array

    private PaymentMethod pay_method;
    
    User(String phone, Profile main_profile, PaymentMethod payment) {
        this.pay_method = payment;
        this.phone = phone;
        this.profile = main_profile;
    }

    public void view_prof_history() {
    }

    public void download_history() {
    }
}
