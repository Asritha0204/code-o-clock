package Interface_LooselyCoupled;

public class MainClass {
    // Step 1: Reference variable of interface type
    private InformationProvider ip;

    // Step 2: Setter method to assign an implementation
    public void setIp(InformationProvider ip) {
        this.ip = ip;
    }

    public static void main(String[] args) {
        // Step 3: Create object of MainClass
        MainClass m = new MainClass();

        // Step 4: Create an implementation object (StaffInformation)
        InformationProvider sp = new StaffInformation();

        // Step 5: Inject the dependency using setter
        m.setIp(sp);

        // Step 6: Call methods through interface reference
        m.ip.getData();     // Outputs: Getting staff data...
        m.ip.printData();   // Outputs: Printing staff data...
    }
}
