package in.stackroute.ust.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private String empId;

    private String firstName;

    private String lastName;

    private Asset asset;

    public Employee() {
    }

    public Employee(String empId, String firstName, String lastName, Asset asset) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.asset = asset;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Asset getAssest() {
        return asset;
    }

    public void setAssest(Asset asset) {
        this.asset = asset;
    }
}
