//Define your Car class with at least (3) instance variables such as color, make, model, etc.,
//and create accessor methods for each variable
//
//In your CarDemo class, write a program that instantiates a Car object named myCar,
//uses accessor methods to set each of its instance variables and then get their values,
//and finally prints out information about your vehicle

package com.company;

public class Car {
    private String make;
    private String model;
    private String color;
    private int year;

    public void setMake(String carMake){
        make = carMake;
    }

    public String getMake(){
        return make;
    }

    public void setModel(String carModel){
        model = carModel;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String carColor){
        color = carColor;
    }

    public String getColor(){
        return color;
    }

    public void setYear(int carYear){
        year = carYear;
    }

    public int getYear(){
        return year;
    }
}
