package Platform.Component;


import Authentication.Account;
import java.util.Date; // To change

public class Request {

    private Account requester;

    private Date request_made;

    private String title_suggestion;
    
    Request(Account requester, Date time, String title) {
        this.requester = requester;
        this.request_made = time;
        this.title_suggestion = title;
    }
}
