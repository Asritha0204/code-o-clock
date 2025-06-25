package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class SimpleHM {
    HashMap<String, String> map = new HashMap<String, String>();
    void addData() {
        map.put("Registration No", "12345");
        map.put("Name", "Naina Thalwar");
        map.put("Department", "CSE");
        map.put("","Its Null Key Values");//It accepts only one null key
        map.put("email", "");
        map.put("PhoneNo","");//It accepts more than one null value
        for(Map.Entry<String, String> m:map.entrySet())
        {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }
    }

    public static void main(String[] args) {
        SimpleHM s = new SimpleHM();
        s.addData();
    }
}
