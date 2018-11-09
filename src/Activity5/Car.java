package Activity5;

import java.util.Arrays;
import java.util.Date;

// Create a concrete class named Car that extends the Vehicle class
public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    feature[0] = new InteriorFeature("No Interior Features");
    feature[1] = new ExteriorFeature("No Exterior Features");
      carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
             String vehicleModel, Chassis vehicleFrame, String vehicleType,
             String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {

    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel,
            vehicleFrame, vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {
    String exteriorFeatures = "";
    for (int i = 0; i < feature.length; i++) {
      if (feature[i] instanceof ExteriorFeature) {
        exteriorFeatures += feature[i].toString();
      }
    }
    return exteriorFeatures;
  }

  public String getInteriorFeatures() {
    String interiorFeatures = "";
    for (int i = 0; i < feature.length; i++) {
     if (feature[i] instanceof InteriorFeature){
       interiorFeatures += feature[i].toString();
     }
    }
    return interiorFeatures;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + "Features : \n" + getInteriorFeatures() + getExteriorFeatures()  +
            "Car Axle : " + carAxle;
  }
}
