package com.stackroute.smartparkingapp.controller;
import com.stackroute.smartparkingapp.dto.ParkingDto;
import com.stackroute.smartparkingapp.model.Parking;
import com.stackroute.smartparkingapp.repo.ParkingRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
/**
 * As in this assignment, we are working with demonstrating the  use of sl4j for logging in microservices
 * annotate the class with @RestController annotation,@CrossOrigin and @RequestMapping
 * Please note that the default path to use this controller should be "/api/v1"
 */
@CrossOrigin("*")
@RequestMapping("api/v1")
@RestController
public class ParkingController {
    private static Logger logger = LoggerFactory.getLogger(ParkingController.class);
    @Autowired
    private ParkingRepo parkingRepo;
    @Autowired
    private ModelMapper modelMapper;
    public Parking createParking(ParkingDto parkingDto){
        Parking parking=new Parking(parkingDto.getParkingId(), parkingDto.getVehicleType(), parkingDto.getDimension());
        return parking;
    }
    /**
     * Constructor autowiring should be implemented for the ParkingRepo, ModelMapper
     * without using the new keyword
     **/
    /**
     * API Version: 1.0
     * Define a handler method which will add new parking details by reading the Serialized
     * ParkingDto object from request body and save the Parking in database.The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 201(CREATED - In case of successful creation of the task)
     * 2. 400(Bad Request - In case the request is not readable)
     * This handler method should map to the URL "/api/v1/parking" using HTTP POST
     * method".
     */
    @PostMapping("/parking")
    public ResponseEntity<Parking> saveParking(@RequestBody ParkingDto parkingDto){
        parkingRepo.save(createParking(parkingDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(createParking(parkingDto));
    }
    /**
     * API Version: 1.0
     * Define a handler method which will update new parking details by reading the Serialized
     * ParkingDto object from request body and update the Parking in database.The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 201(CREATED - In case of successful creation of the task
     * 2. 400(Bad Request - In case the request is not readable
     * This handler method should map to the URL "/api/v1/parking" using HTTP PUT
     * method".
     */
    @PutMapping("/parking")
    public ResponseEntity<?>update(@RequestBody ParkingDto parkingDto){
        Parking parking=createParking(parkingDto);
        parkingRepo.save(parking);
        return ResponseEntity.status(HttpStatus.CREATED).body(parking);
    }
    /**
     * API Version: 1.0
     * Define a handler method which will retrieve all parking details
     * The logger should log the required info
     * This handler method should return the status messages basis on
     * different situations:
     * 1. 200(OK) - If the tasks found successfully
     * This handler method should map to the URL "/api/v1/parkings" using HTTP POST
     * method".
     */
    @GetMapping("/parkings")
    public ResponseEntity<?>getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(parkingRepo.findAll());
    }
    /**
     * API Version: 1.0
     * Define a handler method which will Delete a parking by reading the Serialized
     * TaskDto object from request body ;
     * This handler method should return any one of the status messages basis on
     * different situations:
     * 1.200(OK) - If the parking deleted successfully.
     * 2.400(BAD REQUEST) - If the request is not readable.
     * This handler method should map to the URL "/api/v1/task" using HTTP DELETE
     * method".
     */
    @DeleteMapping("/parking")
    public ResponseEntity<?> delete(@RequestBody ParkingDto parkingDto){
        Parking parking=createParking(parkingDto);
        parkingRepo.delete(parking);
        return ResponseEntity.status(HttpStatus.OK).body(parking);
    }
    /**
     * Define the private methods as required
     **/
}
