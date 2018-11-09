package Activity5;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

// public default constructor with no formal parameters and initialize all
// instance variables with generic literal values.
  public Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleFrame();
    vehicleType = "Generic";
    driveTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();
  }

// public overloaded constructor with values for all of the variables defined above.
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
                 String vehicleMake, String vehicleModel, Chassis vehicleFrame,
                 String vehicleType, String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  public Date getVehicleManufacturedDate() {
    return vehicleManufacturedDate;
  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public String getVehicleManufacturer() {
    return vehicleManufacturer;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public String getVehicleMake() {
    return vehicleMake;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public String getVehicleModel() {
    return vehicleModel;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public Chassis getVehicleFrame() {
    return vehicleFrame;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public Engine getVehicleEngine() {
    return vehicleEngine;
  }

  public void setVehicleEngine(Engine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    engineCylinders = 0;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    date = new Date();
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    manufacturer = "Generic";
  }

  @Override
  public void setEngineMake(String engineMake) {
    engineMake = "Generic";
  }

  @Override
  public void setEngineModel(String engineModel) {
    engineModel = "Generic";
  }

  @Override
  public void setEngineType(String fuel) {
    fuel = "88 AKI";
  }

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    vehicleChassis = "2WD: Two-Wheel Drive";
  }

  // Still needs work
  @Override
  public String toString() {
    return "Manufacturer Name        : " + vehicleManufacturer + "\n"
         + "Manufactured Date        : " + vehicleManufacturedDate + "\n"
         + "Vehicle Make             : " + vehicleMake + "\n"
         + "Vehicle Mode             : " + vehicleModel + "\n"
         + "Vehicle Type             : " + vehicleType + "\n"
         + vehicleEngine.toString();
  }

}
