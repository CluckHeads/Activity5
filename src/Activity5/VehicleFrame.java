package Activity5;

//-----------------------------------------------------------------------------
//  Type:       Class: VehicleFrame
//  BY:		      Kettering, Gage
//  ORG:		    CRN: 80601
//  DESC:       Will get/set the vehicle frame and then sets it up to print
//  Resources:  CaveOfProgramming | Prof. Vanselow
//-----------------------------------------------------------------------------


public class VehicleFrame implements Chassis {

//Create a String named vehicleFrameType instance variable
  private String vehicleFrameType;

// Set the vehicleFrameType instance variable in both,
// use “Unibody” as the default String value.

//A public default constructor
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

// overloaded constructor with the following value:
// A String with a parameter value of vehicleFrameType
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }


// A public method named getChassisType that didn't have a formal
// parameter and that returns an instance
// of the interface Chassis (hint that would be a copy of this class).
  @Override
  public Chassis getChassisType() {
    return this;
  }

// A public method setChassisType that takes a String parameter
// vehicleFrameType and that returns a void.
//It should set the instance variable vehicleFrameType.
  @Override
  public void setChassisType(String vehicleFrameType) {
    return;
  }

// A public toString method that returns the following
  @Override
  public String toString() {
    return "Chassis   : " + chassis + "\n" +
            "Vehicle Frame  : " + vehicleFrameType +  "\n";
  }

}