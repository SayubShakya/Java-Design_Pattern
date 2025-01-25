package Strategy;

import Strategy.Stra.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy; //interface object

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy; //assign to driveStrategy
    } //constructor

    public void drive(){ //method
        driveStrategy.drive(); //driveStrategy method call
    } 
    
}
