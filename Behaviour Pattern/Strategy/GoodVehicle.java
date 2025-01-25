package Strategy;

import Strategy.Stra.NormalDriveStrategy;

public class GoodVehicle extends Vehicle {
    public GoodVehicle(){
        super (new NormalDriveStrategy());  //NormalDriveStrategy.java
    }
}
