package core_java;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) obj;
        return this.id == e.id && this.name.equals(e.name);
    }

    public int hashCode() {
        return id + name.hashCode();
    }
}
