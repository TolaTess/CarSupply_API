/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycar.mycarsupplyshop.model;

import javax.xml.bind.annotation.XmlRootElement; 
/**
 *
 * @author tolaotesanya
 * date 24/04/2018
 */
@XmlRootElement 
public class Car {
    
    private int id;
    private String group;
    private String makeandmodel;
    private int pax;
    private int bag;
    private String transmission;

    //empty contructor
    public Car() {
    }

    //Constructor
    public Car(int id, String group, String makeandmodel, int pax, int bag, String transmission) {
        this.id = id;
        this.group = group;
        this.makeandmodel = makeandmodel;
        this.pax = pax;
        this.bag = bag;
        this.transmission = transmission;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setMakeandmodel(String makeandmodel) {
        this.makeandmodel = makeandmodel;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getMakeandmodel() {
        return makeandmodel;
    }

    public int getPax() {
        return pax;
    }

    public int getBag() {
        return bag;
    }

    public String getTransmission() {
        return transmission;
    }
    
    
    
}
