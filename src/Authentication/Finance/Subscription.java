package Authentication.Finance;


import java.util.Date; // To Change

public class Subscription {

    private Date subscribed;

    private Plan current_plan; // Enum

    private Date canceled;

    private String cancel_reason;

    private Map billing_by_month;
    
    Subscription(Date subscribed, Plan current_plan, Map billing) {
        this.subscribed = subscribed;
        this.current_plan = current_plan;
        this.billing_by_month = billing;
    }

    public void change_plan() {
    }

    public void billing_by_month() {
    }

    public void cancel() {
    }
}
