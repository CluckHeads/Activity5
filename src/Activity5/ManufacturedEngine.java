package Activity5;

//-----------------------------------------------------------------------------
//  Type:       Class: ManufacturedEngine
//  BY:		      Kettering, Gage
//  ORG:		    CRN: 80601
//  DESC:       Contains methods with everything needed to describe a vehicles
//                manufacturing specs
//  Resources:  CaveOfProgramming | Prof. Vanselow
//-----------------------------------------------------------------------------


import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate = new Date();
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;




  //  A public default constructor with no formal parameters and initialize all instance variables with generic
//  literal values
  public ManufacturedEngine() {
    engineManufacturer = "Generic";
    engineManufacturedDate = new Date();
    engineMake = "Generic";
    engineModel = "Generic";
    engineType = "85 AKI";
    engineCylinders = 0;
    driveTrain = "2WD: Two-Wheel Drives";
  }


  //  A public overloaded constructor with values for all of the variables defined above
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake,
                            String engineModel, int engineCylinders, String engineType, String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }



  //  Still need to figure out how to print the correct output
  @Override
  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\n"
            + "Engine Manufactured : " + engineManufacturedDate + "\n"
            + "Engine Make : " + engineMake + "\n"
            + "Engine Model : " + engineModel + "\n"
            + "Engine Type : " + engineType + "\n"
            + "Engine Cylinders : " + engineCylinders + '\n'
            + "Drive Train : " + driveTrain + '\n';
  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  @Override
  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  @Override
  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public String getEngineType() {
    return engineType;
  }

  @Override
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }




}