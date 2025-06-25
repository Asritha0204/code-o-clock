package StaticKeyword;

public class StaticVar {
    // Instance variable: Each object has its own copy of 'count'
    int count = 0;

    // Static variable: Shared among all objects of the class
    static int count1 = 0;

    // Method to increment both count (instance) and count1 (static)
    void increment() {
        count = count + 1;     // Increments the instance variable (unique for each object)
        count1 = count1 + 1;   // Increments the static variable (shared across all objects)
    }

    // Method to print current values of count and count1
    void printData() {
        System.out.println("The count value is " + count);   // Prints instance variable
        System.out.println("The count1 value is " + count1); // Prints static variable
    }

    public static void main(String[] args) {
        // Creating first object 's'
        StaticVar s = new StaticVar();
        s.increment();  // count = 1, count1 = 1
        s.increment();  // count = 2, count1 = 2
        s.printData();  // Prints: count = 2, count1 = 2

        // Creating second object 's1'
        StaticVar s1 = new StaticVar();
        s1.increment();  // s1.count = 1 (new object), count1 = 3 (shared)
        s1.increment();  // s1.count = 2, count1 = 4
        s1.printData();  // Prints: count = 2, count1 = 4

        // Note: count1 keeps increasing across all objects because it's static (shared)
        // But count is separate for each object
    }
}
