package day11;
import java.util.*;
public class StudentHelp extends Student {
    Scanner sc=new Scanner(System.in);
    HashMap <Integer,Student> map=new HashMap<Integer,Student>();
    
public void addStudent(){
    Student obj=new Student();
    System.out.println("enter name:");
    obj.name=sc.next();
    System.out.println("enter role:");
    obj.rollno=sc.nextInt();
    System.out.println("enter college:");
    obj.college=sc.next();
    System.out.println("enter place:");
    obj.place=sc.next();
    System.out.println("enter sem:");
    obj.sem=sc.nextInt();
    map.put(obj.rollno,obj);
}
public void searchStudent(){
    System.out.println("enter the rollno which you want to search:");
    int rollno1=sc.nextInt();
    if(rollno1==obj.rollno){
        Student obj=new Student();
    System.out.println("enter name:");
    obj.name=sc.next();
    System.out.println("enter role:");
    obj.rollno=sc.nextInt();
    System.out.println("enter college:");
    obj.college=sc.next();
    System.out.println("enter place:");
    obj.place=sc.next();
    System.out.println("enter sem:");
    obj.sem=sc.nextInt();
    map.put(obj.rollno,obj);
        

    }
    else{
        System.out.println("enter rollno not register");
    }

}
public void deleteStudent(){

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StudentHelp obj=new StudentHelp();
    while(true){
        System.out.println("enter the 1 for addStudent and 2 for search and 3 for delete and 4 for exit:");
        int x=sc.nextInt();
        switch(x){
            case 1:obj.addStudent();
            break;
            case 2:obj.searchStudent();
            break;
            case 3:obj.deleteStudent();
            break;
            case 4:System.exit(x);
        }
    }
}
    
}
