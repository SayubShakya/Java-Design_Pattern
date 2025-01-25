package Strategy;

import Strategy.Stra.SportlDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super (new SportlDriveStrategy());  //SportlDriveStrategy.java
    }
}
