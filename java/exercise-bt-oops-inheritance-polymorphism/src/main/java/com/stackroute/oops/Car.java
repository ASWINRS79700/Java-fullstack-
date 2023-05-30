package com.stackroute.oops;

public class Car extends AbstractManufacturer implements Vehicle {
    private String name;
    private String modelName;
    private String carType;

    public Car(String name, String modelName, String carType) {
        super(name,modelName,carType);
        this.name=name;
        this.modelName=modelName;
        this.carType=carType;
    }

    /*
    Method returns maximum speed depending upon their types
    For sports-250kmh
    For sedan-190kmh
     */
    @Override
    public int maxSpeed(String carType) {
        if(carType=="sports"){
            return 250;
        }
        else {
            return 190;
        }


    }

    /*
    should return in the format : Car{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {
        String txt = "Car{Manufacturer name:"+super.getName()+",Model Name:"+super.getModelName()+",Type:"+super.getType()+"}";
        return txt;

    }
}

