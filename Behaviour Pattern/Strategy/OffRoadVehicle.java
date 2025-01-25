package Strategy;

import Strategy.Stra.SportlDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super (new SportlDriveStrategy());  //SportlDriveStrategy.java
    }
}
