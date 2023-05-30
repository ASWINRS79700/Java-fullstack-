package in.stackroute;

import java.beans.Transient;
import java.io.Serializable;

/**
 * Implement serialization and deserialization for Trainee class
 * 1. Implement java.io.Serializable interface
 * 2. Add a static final long serialVersionUID field of type long
 * 3. Add a no-arg constructor
 */


public class Trainee implements Serializable {

    private static final long serialVersionUID = 10L;

    private int empId;

    private String empName;


    private transient String empLocation;

    public Trainee() {
    }

    public Trainee(int empId, String empName, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empLocation = empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}
