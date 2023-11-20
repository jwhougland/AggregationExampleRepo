import java.util.Objects;

/**
 * Defines the characteristics of an Employee.
 */
public class Employee {

    /**
     * Contains a sample of roles in a software company (not meant to be an exhaustive list).
     */
    public enum JobRole {
        ENGINEERING_MANAGER("Engineering Manager"),
        MARKETING_CONTRIBUTOR("Marketing Contributor"),
        MARKETING_MANAGER("Marketing Manager"),
        ACCOUNTANT("Accountant"),
        FINANCE_CONTRIBUTOR("Finance Contributor"),
        FINANCE_MANAGER("Finance Manager"),
        SOFTWARE_ENGINEER("Software Engineer"),
        SENIOR_SOFTWARE_ENGINEER("Senior Software Engineer"),
        SOFTWARE_ARCHITECT("Software Architect"),
        SOFTWARE_DEVELOPER("Software Developer"),
        FRONTEND_DEVELOPER("Frontend Developer"),
        BACKEND_DEVELOPER("Backend Developer"),
        FULL_STACK_DEVELOPER("Full Stack Developer"),
        DEVOPS_ENGINEER("DevOps Engineer"),
        TEST_AUTOMATION_ENGINEER("Test Automation Engineer"),
        SOFTWARE_TESTER("Software Tester"),
        SYSTEMS_ANALYST("Systems Analyst"),
        DATABASE_ADMINISTRATOR("Database Administrator"),
        TECHNICAL_LEAD("Technical Lead"),
        PROJECT_MANAGER("Project Manager");

        /**
         * A more user-friendly role name
         */
        private final String roleName;

        /**
         * Facilitates being able to associate a more user-friendly role name with an enumerated role name
         */
        JobRole(String roleName) {
            this.roleName = roleName;
        }

        /**
         * Returns the user-friendly role name
         */
        public String getRoleName() {
            return roleName;
        }
    }

    /**
     * Name of the employee
     */
    private String name;

    /**
     * Job role of the employee
     */
    private JobRole jobRole;

    /**
     * Employee's address (aggregation relationship)
     */
    private Address address;

    /**
     * Creates a fully initialized employee instance using the given data.
     *
     * @param name     The employee's name
     * @param jobRole  The employee's job role
     * @param address  The employee's address
     */
    public Employee(String name, JobRole jobRole, Address address) {

        // Perform a null check on parameters that can possibly be null
        if (name == null) {
            throw new IllegalArgumentException("Cannot create an employee instance with a null name field");
        }

        if (address == null) {
            throw new IllegalArgumentException("Cannot create an employee instance with a null address field");
        }

        this.name = name;
        this.jobRole = jobRole;
        this.address = address;
    }

    /**
     * Returns the employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the employee's job role
     */
    public JobRole getJobRole() {
        return jobRole;
    }

    /**
     * Returns the employee's address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * String representation of an employee instance
     */
    @Override
    public String toString() {
        return "Employee{" + "\n" +
                "\t" + "name='" + name + '\'' + ",\n" +
                "\t" + "jobRole=" + jobRole.getRoleName() + ",\n" +
                "\t" + "address=" + address.getStreetAddress() + "\n" +
                "\t\t\t" + address.getCity() + ", " + address.getState().getAbbreviation() + " " + address.getZipCode() +
                "\n" +
                '}';
    }

    /**
     * Determines if this employee instance equals the other employee instance
     * @param o The other employee instance
     * @return True if this employee instance equals the other employee instance, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                jobRole == employee.jobRole &&
                Objects.equals(address, employee.address);
    }

    /**
     * Computes and returns the hash code for this employee instance
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, jobRole, address);
    }
}
