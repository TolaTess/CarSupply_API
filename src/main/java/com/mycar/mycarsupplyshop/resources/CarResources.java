/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycar.mycarsupplyshop.resources;

import com.mycar.mycarsupplyshop.model.Car;
import com.mycar.mycarsupplyshop.service.CarService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam; 

/**
 *
 * @author tolaotesanya
 * date 24/04/2018
 */
    
@Path("/cars")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CarResources {
    
    //declare and create carservices object
    CarService cService = new CarService();
    
    //get request to get all cars
    @GET
    public List<Car> getCars() {
        return cService.getAllCars();
    }    

    //get request to get one car at an index
    @GET
    @Path("/{carId}")
    public Car getCar(@PathParam("carId") int id) {
        return cService.getCar(id);
    }
    
    //post request to create a car
    @POST
    public Car postCar(Car c) {       
        return cService.createCar(c);
    }
    
    //put request to update a car
    @PUT
    @Path("/{carId}")
    public Car putCar(@PathParam("carId") int id, Car c) { 
        c.setId(id);
        return cService.updateCar(c);
    }
     
    //delete request to delete a car
    @DELETE
    @Path("/{carId}")
    public void deleteCar(@PathParam("carId") int id) { 
        cService.deleteCar(id);
    } 
    
}
