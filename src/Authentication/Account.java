package Authentication;

import java.util.Calendar;
import java.util.Scanner;

public class Account {

    private final String email;

    private String password;
    
    //private final User user;
    
    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public void authenticate() {
        // Pending For Devs
    }

    public void changePass() {
        Scanner scanner = new Scanner(System.in);
        String oldPassword;
        String newPassword = "";
        do {
            System.out.print("Please, Enter your old password: ");
            oldPassword = scanner.next();
        } while(!oldPassword.equals(getPassword()));
        oldPassword = null;
        System.out.print("Enter a new password: ");
        newPassword = scanner.next();
        setPassword(newPassword);
        newPassword = null;
        System.out.println("Your password has been changed!");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void resetPass() {
        // Should be developed or something
        System.out.println("You Will Receive An Email To Reset Your Password in " + getEmail());
    }
}
