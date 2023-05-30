package com.stackroute.smartparkingapp.dto;

/**
 * This class represents the Parking data transfer object
 **/
public class ParkingDto {

    /**
     * This class should have a field of type Integer (parkingId) ,two fields of type String
     * (vehicleType,dimensions)
     **/
    private int parkingId;
    private String vehicleType;
    private String dimension;

    /**
     * No Args constructor
     */
    public ParkingDto() {

    }

    /**
     * parameterised constructor
     */
    public ParkingDto(int parkingId, String vehicleType, String dimension) {
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
