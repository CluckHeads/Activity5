package Activity5;

public class InteriorFeature {

  private String interiorFeature;

//  A public default constructor without parameters that sets the interiorFeature instance variable to “Generic”.
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

//  An overloaded constructor with the following value A String with a parameter value of interiorFeature
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getInteriorFeature() {
    return interiorFeature;
  }

  public void setInteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }
}
