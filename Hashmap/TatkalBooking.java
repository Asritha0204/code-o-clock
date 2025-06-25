package Hashmap;

import java.util.*;

public class TatkalBooking {
    List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    Scanner sc = new Scanner(System.in);
    void addData() {
        for(int i=0;i<2;i++)
        {
            HashMap<String, String> map = new HashMap<String, String>();
            System.out.println("Enter the starting place:");
            map.put("starting place", sc.next());
            System.out.println("Enter the destination:");
            map.put("destination", sc.next());
            System.out.println("Enter the passenger name:");
            map.put("passenger name", sc.next());
            list.add(map);
        }
    }
    void printData() {
            Iterator<HashMap<String, String>> itr = list.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    public static void main(String[] args) {
        TatkalBooking t = new TatkalBooking();
        t.addData();
        t.printData();
    }
}
