//Define your Car class with at least (3) instance variables such as color, make, model, etc.,
//and create accessor methods for each variable
//
//In your CarDemo class, write a program that instantiates a Car object named myCar,
//uses accessor methods to set each of its instance variables and then get their values,
//and finally prints out information about your vehicle

package com.company;

public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setMake("Ford");
        myCar.setModel("Focus");
        myCar.setColor("Gray");
        myCar.setYear(2012);

        System.out.println("My car is made by: " + myCar.getMake());
        System.out.println("The model of my car is a: " + myCar.getModel());
        System.out.println("The color of my car is: " + myCar.getColor());
        System.out.println("My car was manufactured in: " + myCar.getYear());
    }
}
