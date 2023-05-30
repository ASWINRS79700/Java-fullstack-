package org.example;

import java.io.Serializable;

public class Batch implements Serializable {

    public Batch(int id, String batchName, String description){
        this.batchName=batchName;
        this.description=description;
        this.no=id;

    }
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batch) {
        this.batchName = batch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    private String batchName,description;
    private int no;

}
