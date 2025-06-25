package Basic;
//find the passenger details based on the seat number
import java.util.HashMap;
import java.util.*;

public class PassengerDetails {
    List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    static Scanner sc = new Scanner(System.in);
    public void getData() {
        System.out.println("Enter the number of passengers:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            System.out.println("Enter the name:");
            map.put("name", sc.next());
            System.out.println("Enter the age:");
            map.put("age", sc.next());
            System.out.println("Enter the gender:");
            map.put("gender", sc.next());
            System.out.println("Enter the Starting place:");
            map.put("starting place", sc.next());
            System.out.println("Enter the Destination:");
            map.put("destination", sc.next());
            System.out.println("Enter the seat number:");
            map.put("seat number", sc.next());
            list.add(map);
        }
    }
    public void printData(String seat) {
        for (HashMap<String, String> map : list) {
            if (map.get("seat number").equals(seat)) {
                System.out.println("Name: " + map.get("name"));
                System.out.println("Age: " + map.get("age"));
                System.out.println("Gender: " + map.get("gender"));
                System.out.println("Starting place: " + map.get("starting place"));
                System.out.println("Destination: " + map.get("destination"));
                System.out.println("Seat number: " + map.get("seat number"));
            }
        }
    }
    public static void main(String[] args) {
        PassengerDetails p = new PassengerDetails();
        p.getData();
        System.out.println("Enter the seat number:");
        String seat = sc.next();
        p.printData(seat);
    }
    
}