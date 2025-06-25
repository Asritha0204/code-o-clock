package ArrayListPrgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SimpleAL {
    ArrayList<String> s_name = new ArrayList<String>();
    void addData(){
        s_name.add("Naina");
        s_name.add("Bunny");
        s_name.add("Bunny");
        s_name.add("Thalwar");
    }
    void printData(){
        Collections.sort(s_name);
        Iterator<String> itr = s_name.iterator();
        while(itr.hasNext()){//check the values if any value is present in the location or not
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        SimpleAL s = new SimpleAL();
        s.addData();
        s.printData();
    }
}
//retrieval operation is faster than insertion in ArrayList