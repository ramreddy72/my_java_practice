package CallSystemHierarchy;

public class Employee {

    private String name;
    private String role;
    private Employee supervisor;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void transferCall() {
        if (supervisor != null) {
            System.out.println(name + "transferring call to " + supervisor.getRole());
            supervisor.receiveCall();
        } else {
            System.out.println(name + " cannot transfer call. No supervisor available.");
        }
    }

    public void receiveCall() {
        System.out.println(name + " is receiving the call.");
    }
}

class Lead extends Employee {
    public Lead(String name) {
        super(name, "Lead");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name, "Manager");
    }
}

class Director extends Employee {
    public Director(String name) {
        super(name, "Director");
    }
}

