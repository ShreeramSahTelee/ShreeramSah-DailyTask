package Practice;
import java.util.*;
public class User {
	String name;
	private int userId;
	String companyname;
	String address;
	protected int age;
	private String position;
	Scanner sc=new Scanner(System.in);
	void createUser(){
		System.out.println("name:");
		name=sc.next();
		System.out.println("userId");
		userId=sc.nextInt();
		System.out.println("companyname");
		companyname=sc.next();
		System.out.println("address");
		address=sc.next();
		System.out.println("age");
		age=sc.nextInt();
		System.out.println("position");
		position=sc.next();
		
		
	}
	void displayUser() {
		System.out.println("name:"+name);
		System.out.println("userId:"+userId);
		System.out.println("companyname:"+companyname);
		System.out.println("address:"+address);
		System.out.println("age:"+age);
		System.out.println("position:"+position);
		
	}
	public static void main(String[] args) {
		User obj1=new User();
		obj1.createUser();
		obj1.displayUser();
		
	}

}
