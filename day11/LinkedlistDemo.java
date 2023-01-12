package day11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {
    public static void main(String[] args) {
  
        LinkedList <Integer> l1=new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.set(0, 2);
        l1.addFirst(10);
        l1.addLast(20);
        l1.clear();
        l1.contains(l1);   //check the data
        l1.indexOf(l1);   //check the position
        l1.peek();        //give first element
        l1.peekLast();    //give last element
        l1.poll();      //delete last element
        l1.pollFirst();  //delete first element
        l1.remove();     //remove particular element
        l1.size();  // size of list


        Iterator it=l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Iterator it1=l1.descendingIterator();
        while(it.hasNext()){
            System.out.println(it1.next());
        }
        l1.lastIndexOf(6);
        l1.pop();    //delete
        l1.push(null);  //insert
    }
}
