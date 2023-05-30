package org.example;

import java.io.Serializable;

public class Trainee implements Serializable {
    private String name;

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", empId=" + empId +
                ", b=" + b +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private String location;
    private int empId;
    private Batch b;
    public Trainee(String name, String location, int id,Batch bb){
        this.empId=id;
        this.location=location;
        this.name=name;
        this.b=bb;
    }


}
