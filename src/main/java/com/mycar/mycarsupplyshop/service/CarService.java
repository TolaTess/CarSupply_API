/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycar.mycarsupplyshop.service;

import com.mycar.mycarsupplyshop.model.Car;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tolaotesanya
 * date 24/04/2018
 */
public class CarService {
    
    //data members 
    public static List<Car> list = new ArrayList<>(); // List to store car objects
    public static boolean present = true;
    
    //constructor with parameters
    //parameters - int id, String group, String makeandmodel, int pax, int bag, String transmission
    public CarService () {
        if (present) {
            Car c1 = new Car(1,"Group A", "Ford Fiesta", 5, 1, "Manual");
            Car c2 = new Car(2,"Group B", "Ford Focus", 5, 2, "Auto");
            Car c3 = new Car(3,"Group C", "Hyundia ix35", 5, 3, "Auto");
            Car c4 = new Car(4,"Group D", "BMW 3 series", 5, 2, "Manual");
       
            list.add(c1);
            list.add(c2);
            list.add(c3);
            list.add(c4);
            present = false;
        }
    }
        
    //return all cars in the list
    public List<Car> getAllCars() {
        return list;
    }
    
    //create car method
    public Car createCar(Car car){
        car.setId(list.size() + 1); //get size of the list and increment by 1 and set in id
        list.add(car); // add car to the list array
        System.out.println("201 -  car created with id:" + String.valueOf(car.getId()));
        return car; 
    }
        
    //return a car method
    public Car getCar(int id) {
        return list.get(id-1); //get car at id -1 (array store from index 0)
    }
     
    //update car method to update car details 
    public Car updateCar(Car car){
        if (car.getId() <= 0) { 
            return null; //if there is no car to update return null
        }
        list.set(car.getId()-1, car); //update the car at the index
        System.out.println("200 -  car id:" + String.valueOf(car.getId()) + " updated");
        return car;
    }
    
    //delete car method 
    public Car deleteCar(int id){
        if (id <= 0) {
            return null;
        }
        Car c = list.get(id-1); //get car at id
        list.remove(id-1); // remove car at id
        System.out.println("204 -  car id:" + String.valueOf(id) + " deleted");
        return c;
    }
    
}
