import java.util.Scanner;
/*
A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to  “India” throw a InvalidCountryException with the message “User Outside India  cannot be registered”
• if userCountry is equal to  “India”,  print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India  cannot be registered”
Example2)
i/p:Mini,India
o/p:User registration done successfully
 */
public class InvalidConturyException extends Exception {
    InvalidConturyException(String s){
        super(s);
    }
    void registerUser(String Username,String Usercontury){
        try {
            Scanner obj=new Scanner(System.in);
            System.out.println("entre the name of the student ");
            Username=obj.nextLine();
            System.out.println("entre teh name of the contury");
            Usercontury=obj.nextLine();
            if(Usercontury.equals("india")){
                System.out.println(Username+" "+Usercontury+" /n "+"User registration done successfully");
            }
            else {
                System.out.println(Username+" "+Usercontury);
                throw new InvalidConturyException("The message should be “User Outside India  cannot be registed");
            }
        }catch (InvalidConturyException o){
            System.out.println(o);
        }
    }
}
class UserRegistration{
    public static void main(String[] args) {
        InvalidConturyException obj1=new InvalidConturyException("The message should be “User Outside India  cannot be registe");
        obj1.registerUser(obj1.getMessage(), obj1.getMessage());
    }
}
