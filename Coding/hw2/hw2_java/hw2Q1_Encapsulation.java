public class hw2Q1_Encapsulation {
    // Encapsulation:
    // private data variables: so they cannot accessed directly from outside the class
    private int employeeID;
    private String employeeName;
    private boolean finishOritation;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isFinishOritation() {
        return finishOritation;
    }

    public void setFinishOritation(boolean finishOritation) {
        this.finishOritation = finishOritation;
    }

    public static void main(String[] args) {
        // Create an instance of hw2Q1_Encapsulation
        hw2Q1_Encapsulation employee = new hw2Q1_Encapsulation();

        // Set employee details using setter methods
        employee.setEmployeeID(123);
        employee.setEmployeeName("John Doe");
        employee.setFinishOritation(true);

        // Display employee details using getter methods
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Orientation Status: " + (employee.isFinishOritation() ? "Finished" : "Not Finished"));
    }
}