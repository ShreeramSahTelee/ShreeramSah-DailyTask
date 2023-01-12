package day11;
import java.util.*;
public class Demo1 {
    Scanner sc=new Scanner(System.in);
    public void add(){
        System.out.println("enter your name");
        String name=sc.next();
    }
    public static void main(String[] args) {
        Demo1 obj=new Demo1();
        Demo1 obj1=new Demo1();
        Demo1 obj2=new Demo1();
        ArrayList a1=new ArrayList<>();
         
         a1.add(obj);
         a1.add(obj1);
         a1.add(obj2);
         Iterator i=a1.iterator();
         while(i.hasNext()){
            System.out.println(i.next());
         }
    }
    
}
