import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userName="Pachu";
        String userPassword="pachu1234@";
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("Name="+name);
        System.out.println("Enter your password:");
        String password=sc.next();
        if(userName.equals(name)&&userPassword.equals(password)){
            System.out.println("login sucessfull");
        }
        else{
            System.out.println("you are entering wrong user and password");
        }
    }
}
