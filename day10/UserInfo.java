package day10;

import java.util.Scanner;

public class UserInfo  {
    String userName;
int loanAmount;
UserInfo details[];
int count=0;
int n;

public void storeUser(BranchBank obj1){
    Scanner sc=new Scanner(System.in);
    UserInfo obj2=new UserInfo();
    System.out.println("Enter username:");
    obj2.userName=sc.next();
    System.out.println("enter loan amount:");
    obj2.loanAmount=sc.nextInt();
    
    if(loanAmount<obj1.getbranchTotalfound() && obj1.getbranchTotalfound()<obj1.getbankTotalfound()){
      System.out.println("loan is approved");
    }
    else{
        System.out.println("loan not approved");
    }
    details[count]=obj2;
    count++;

}

public void displayUser(){
UserInfo details1=details[n];
    System.out.println("user name:"+details1.userName);
    System.out.println("enter loan:"+details1.loanAmount);

}


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        UserInfo obj1=new UserInfo();
        BranchBank obj=new BranchBank("Axis", 123, 55665566, 5000000, 2, "Rbi", 122, 980724545, 10000000, 2);
        System.out.println("Enter the number of people want loan:");
        int n=sc.nextInt();
        obj1.details=new UserInfo[n];
        boolean state=true;
        while(state){
            System.out.println("enter 1 for add user and 2 for display deatils and 3 for exit:");
            int x=sc.nextInt();
            switch(x){
        case 1:obj1.storeUser(obj);
        break;
        case 2:obj1.displayUser();
        break;
        case 3:System.exit(1);
            }
        }
        
    }    
}
