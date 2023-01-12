package day11;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet <Integer>s1=new HashSet <Integer> ();
        LinkedHashSet s2=new LinkedHashSet<Integer>();
        TreeSet treeset=new TreeSet<>();
        treeset.add(2);
        treeset.add(3);
        s1.add(2);
        s1.add(2);  //thwor error
        s1.add(3);
        s1.add(4);
        Iterator it=s1.iterator();
    while(it.hasNext()) {
System.out.println(it.next());
    }   
    s1.remove(2);
    
}
    
}
