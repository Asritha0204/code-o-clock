package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleHM1 {
    HashMap<String, String> map = new HashMap<String, String>();
    void addData() {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter key :");
            String key=s.next();
            System.out.println("Enter value :");
            String value=s.next();
            map.put(key,value);
        }
        for(Map.Entry<String, String> m:map.entrySet())
        {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }
        s.close();
        
    }

    public static void main(String[] args) {
        SimpleHM1 s = new SimpleHM1();
        s.addData();
    }
}
