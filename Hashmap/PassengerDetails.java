package Hashmap;
import java.util.*;
public class PassengerDetails {
    HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String, String>>();
    static Scanner sc = new Scanner(System.in);
    void getData() {
        System.out.println("Enter the number of passengers:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            System.out.println("Enter the name:");
            hm.put("name", sc.next());
            System.out.println("Enter the age:");
            hm.put("age", sc.next());
            System.out.println("Enter the gender:");
            hm.put("gender", sc.next());
            System.out.println("Enter the Starting place:");
            hm.put("starting place", sc.next());
            System.out.println("Enter the Destination:");
            hm.put("destination", sc.next());
            System.out.println("Enter the seat number:");
            hm.put("seat number", sc.next());
            map.put(hm.get("seat number"), hm);
        }
    }
    void printData(String seat) {
        HashMap<String, String> hm = map.get(seat);
        System.out.println("Name: " + hm.get("name"));
        System.out.println("Age: " + hm.get("age"));
        System.out.println("Gender: " + hm.get("gender"));
        System.out.println("Starting place: " + hm.get("starting place"));
        System.out.println("Destination: " + hm.get("destination"));
        System.out.println("Seat number: " + hm.get("seat number"));
    }
    public static void main(String[] args) {
        PassengerDetails p = new PassengerDetails();
        p.getData();
        System.out.println("Enter the seat number to get the passenger details:");
        String seat =sc.next();
        p.printData(seat);
    }
}
