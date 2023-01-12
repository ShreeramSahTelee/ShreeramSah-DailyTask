package day11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo1 {
    public static void main(String[] args) {
        LinkedList <Integer> l=new LinkedList<Integer>();
        // Inserting value using stack operation
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        // traversing 
        Iterator it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //deleting
        l.pop();
        System.out.println(l);
        
    }
    
}
