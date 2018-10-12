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




  public static void main(String[] args) {

// Write a static main method that creates two objects, one with the default constructor and the other with the
//  constructor with parameters. Give sample data for the parameters.
    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("DAT Chassis");
    System.out.println(yourChassis.toString());


    test1();
    test2();

  }


  //  Write a static main method that tests two scenarios:
  public static void test1() {
//    One that prints all fuel grade values
    VehicleFrame vf1 = new VehicleFrame();
//    One that prints a value set by a single string value
    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");

    System.out.println(vf1);
    System.out.println(vf2.toString());

  }

  //  Write a static main method that tests two scenarios:
  public static void test2() {
    Date today = new Date();


    ManufacturedEngine eng1 = new ManufacturedEngine();

    ManufacturedEngine eng2 = new ManufacturedEngine("Honda", today, "H-Series",
            "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");


    System.out.println(eng1);
    System.out.println(eng2);
  }

}