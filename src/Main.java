/**
 * Main class for the aggregation example console app.
 */
public class Main {
    /**
     * Entry point for the aggregation example console app.
     * @param args Not used.
     */
    public static void main(String[] args) {

        // Create an address
        Address address = new Address(
                "1234 Sample Street",
                "Arlington",
                Address.USState.TEXAS,
                "75104");

        // Print the address
        System.out.println("Printing the address before creating an employee instance:");
        System.out.println(address);
        System.out.println();

        runEmployeeAddressAggregationDemo(address);

        System.out.println("Printing the address again after the demo method has finished:");
        System.out.println(address);
    }

    /**
     * Creates an employee instance locally using the given data
     *
     * @param address Address to assign to the local employee instance
     */
    public static void runEmployeeAddressAggregationDemo(Address address) {

        // Create an employee instance
        Employee employee = new Employee("Peter Gibbons", Employee.JobRole.SENIOR_SOFTWARE_ENGINEER, address);

        // Print out the employee's details
        System.out.println("Printing the employee's details:");
        System.out.println(employee);
        System.out.println();
    }
}