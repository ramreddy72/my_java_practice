package streams;

import java.util.List;

public class Employee {
    
    public int id;
    String name;
    List<Long> phone;

    
    public Employee(int id, String name, List<Long> phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Long> getPhone() {
        return phone;
    }
    public void setPhone(List<Long> phone) {
        this.phone = phone;
    }

    
}
