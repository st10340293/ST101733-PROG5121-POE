
package part1;

import java.util.Scanner;

public class Registration {

        static String firstName;
        static String userName;
        static String lastName;
        static String password;
    
  //combining our class login with the userDetails and bring all our methods together
    public static void main(String[] args) {
        
        Scanner User = new Scanner(System.in);
        
        System.out.println("Enter your First name ");
        firstName = User.nextLine();
        System.out.println("Enter the username for your account ");
        userName = User.nextLine();
        System.out.println("Enter your last name");
        lastName = User.nextLine();
        System.out.println("Enter your password ");
        password = User.nextLine();
   
        Login LogObject = new Login();
        
        LogObject.checkUserName();
        LogObject.registerUser();
        System.out.println(LogObject.returnLoginStatus());
        
    }
    
}
