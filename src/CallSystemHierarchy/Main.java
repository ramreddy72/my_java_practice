package CallSystemHierarchy;

public class Main {
    public static void main(String[] args) {
         // Creating employees
        Employee employee = new Employee("John Doe  ", "Employee");
        Lead lead = new Lead("Alice Smith");
        Manager manager = new Manager("Bob Johnson");
        Director director = new Director("Carol Williams");

        // Setting up the hierarchy
        employee.setSupervisor(lead);
        lead.setSupervisor(manager);
        manager.setSupervisor(director);

        // Transfer call from employee to lead, then to manager, then to director
        employee.transferCall();
    }
}
