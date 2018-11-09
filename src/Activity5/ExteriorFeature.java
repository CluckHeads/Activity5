package Activity5;

public class ExteriorFeature implements Feature {

  private String exteriorFeature;


  public String getExteriorFeature() {
    return exteriorFeature;
  }

  public void setExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  public String getFeature() {
    return exteriorFeature;
  }

  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }


// 	A public default constructor without parameters that sets the exteriorFeature instance variable.
public ExteriorFeature() {
  this.exteriorFeature = "[Generic]";
}

//	An overloaded constructor with the following value
public ExteriorFeature(String exteriorFeature) {
  this.exteriorFeature = exteriorFeature;
}

  @Override
  public String toString() {
    return "Exterior [" + exteriorFeature + "]\n";
  }
}
