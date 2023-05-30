package com.stackroute.smartparkingapp.model;

import javax.persistence.*;

/**
 * This class stores the Parking details.This class should be annotated with @Entity annotation.
 */


@Entity
public class Parking {

    /**
     * This class should have a field of type Integer (parkingId) ,two fields of type String
     * (vehicleType,dimensions)
     **/
    @Id
    @GeneratedValue
    private int parkingId;
    private String vehicleType;
    private String dimension;

    /**
     * No args constructor
     */
    public Parking(){}

    /**
     * Parameterised constructor
     */
    public Parking(int parkingId, String vehicleType, String dimension) {
        this.parkingId = parkingId;
        this.vehicleType = vehicleType;
        this.dimension = dimension;
    }
    /**
     * Getters and setters
     */
    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}
