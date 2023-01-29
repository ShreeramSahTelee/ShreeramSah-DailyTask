package Day23Task;

 import java.util.Scanner;

public class Bank {
    private static Bank bankObj=new Bank();
    Scanner sc=new Scanner(System.in);
    private Bank(){

    }
    public static Bank bankStatus(){

     
      return bankObj;

    }

    public void showStatus(){
        System.out.println("enter time:");
        int time=sc.nextInt();
     if(time>=9&&time<=18){

      System.out.println("Bank is open");
     }
     else{
        System.out.println("Bank is closed");
     }
    }



       
    
}
 
    

