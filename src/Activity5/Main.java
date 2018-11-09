package Activity5;

//-----------------------------------------------------------------------------
//  Type:       Class: Main
//  BY:		      Kettering, Gage
//  ORG:		    CRN: 80601
//  DESC:       Main class that allows the program to run
//  Resources:  CaveOfProgramming | Prof. Vanselow
//-----------------------------------------------------------------------------

//  On Step 7, bullet point 7

import java.util.Date;

public class Main {

  Date date = new Date();

  public static void main(String[] args) {

// Write a static main method that creates two objects, one with the default constructor and the other with the
//  constructor with parameters. Give sample data for the parameters.
    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("DAT Chassis");
    System.out.println(yourChassis.toString());


    //testFrame();
    //testEngine();
    //testInterior();
    //testExterior();
    //testVehicle();
    testCar();
  }


  //  Write a static main method that tests two scenarios:
  public static void testFrame() {
//    One that prints all fuel grade values
    VehicleFrame vf1 = new VehicleFrame();
//    One that prints a value set by a single string value
    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");

    System.out.println(vf1);
    System.out.println(vf2.toString());
  }

  //  Write a static main method that tests two scenarios:
  public static void testEngine() {
    Date date = new Date();

    ManufacturedEngine eng1 = new ManufacturedEngine();
    ManufacturedEngine eng2 = new ManufacturedEngine("Honda", date, "H-Series",
            "H23A1", "88 AKI", 4,  "2WD: Two-Wheel Drive");

    System.out.println(eng1);
    System.out.println(eng2);
  }

  public static void testInterior() {
    InteriorFeature if1 = new InteriorFeature();
    InteriorFeature if2 = new InteriorFeature("[Climate Controlled]");

    System.out.println(if1);
    System.out.println(if2);
  }

  public static void testExterior() {
    ExteriorFeature ef1 = new ExteriorFeature();
    ExteriorFeature ef2 = new ExteriorFeature("[Fog Lamps]");

    System.out.println(ef1);
    System.out.println(ef2);
  }

  // Step 9 : Write a static main method that tests two scenarios
  public static void testVehicle() {
    Date date = new Date();
    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    ManufacturedEngine eng2 = new ManufacturedEngine("Honda", date, "H-Series",
            "H23A1", "88 AKI",4,  "2WD: Two-Wheel Drive");

    Vehicle veh1 = new Vehicle();
    Vehicle veh2 = new Vehicle(date, "Honda", "Honda", "Prelude",
            vf2, null, "2WD: Two-Wheel Drive", eng2);

    System.out.println(veh1);
    System.out.println(veh2);
  }

  public static void testCar() {

    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();

    // Seed the features with valid subclasses.
    Feature[] f = {new InteriorFeature("AM/FM Radio")
            , new ExteriorFeature("Wood Panels")
            , new InteriorFeature("Air Conditioning")
            , new ExteriorFeature("Moonroof")};

    // Create an overloaded Car instance.
    Car c2 = new Car(new Date(), "Honda", "Prelude", "Coupe",
            new VehicleChassis("Unibody"), "null", "type",
            new ManufacturedEngine("Honda", new Date(), "H-series", "H23A1",
                    "88 AKI",4 ,  "2WD: Two-Wheel Drive"), f, 2);
    System.out.println(c2);
  }

}