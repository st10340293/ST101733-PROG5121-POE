
package part1;

import java.util.Scanner;


public class Login {
    
    
public boolean checkUserName()
{
    return Registration.userName.contains("_") && Registration.userName.length()<=5;
             
}        
public boolean checkPasswordComplexity()
{
        
    boolean passwordStatus = false,length = false, number = false, specialCharacter = false, upperCase = false;
    char ch;
        
    if (Registration.password.length()>=8) {
        length = true;
    }
    for(int i=0; i< Registration.password.length(); i = i+1 ) {
        ch = Registration.password.charAt(i);
            
        if (Character.isDigit(ch)) {
            number = true;
        }
        if (Character.isUpperCase(ch)) {
            upperCase = true;
        }
        if (Character.isLetterOrDigit(ch)) {
           specialCharacter = true;
        }
    passwordStatus = specialCharacter && number && length && upperCase;
    }
    return passwordStatus;
    }
    //user"s conditions for login detailsthat have bee provided
    public void registerUser(){
        if (checkUserName()) {
            System.out.println("Username successfully captured");
        }
        else{
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 character in length");
        }
        if (checkPasswordComplexity()) {
            System.out.println("Password successfully captured");
        }
        else{
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters,a capital letter, a number and a special character");
        }
  }
    
    boolean loginUser(){
        Scanner user = new Scanner(System.in);

         System.out.println("Enter the user name you used to create an account");
         String username2 = user.nextLine();
         System.out.println("Enter the password you used to create an account");
         String password2 = user.nextLine();
         
            return Registration.userName.equals(username2)&& Registration.password.equals(password2);
        }
public String returnLoginStatus(){
    if(loginUser()){
        return "Welcome " + Registration.firstName + "_" + Registration.lastName + " it is great to see you again.";
    }
    else{
        return "Username or password incorrect, please try again.";
    }
        
}
}
