package Activity5;

//-----------------------------------------------------------------------------
//  Type:       Interface:  Chassis
//  BY:		      Kettering, Gage
//  ORG:		    CRN: 80601
//  DESC:       Interface that holds methods that will assign a value to
//                Chassis
//  Resources:  CaveOfProgramming | Prof. Vanselow
//-----------------------------------------------------------------------------


public interface Chassis{

//  A public constant string named chassis with a value of “Chassis”.
  public final String chassis = "Chassis";

//  The definition of a public getChassisType method that returns an instance of Chassis.
  public Chassis getChassisType();

//  The definition of a public setChassisType that accepts a string named vehicleChassis and returns a void
  public void setChassisType(String vehicleChassis);

}