package Activity5;

//-----------------------------------------------------------------------------
//  Type:       Interface: Engine
//  BY:		      Kettering, Gage
//  ORG:		    CRN: 80601
//  DESC:       Interface that contains all of the methods that will have to
//                do with an engine's specs
//  Resources:  CaveOfProgramming | Prof. Vanselow
//-----------------------------------------------------------------------------


import java.util.Date;

public interface Engine {

  public void setEngineCylinders(int engineCylinders);

  public void setEngineManufacturedDate(Date date);

  public void setEngineManufacturer(String manufacturer);

  public void setEngineMake(String engineMake);

  public void setEngineModel(String engineModel);

  public void setDriveTrain(String driveTrain);

  public void setEngineType(String fuel);



}