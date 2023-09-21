package Class.Medical_Data;

import java.util.Scanner;

public class BodyMeasurement {
  private float bodyHeight;
  private float bodyWeight;
  private float waistCircumference;

  public BodyMeasurement() {

  }

  public BodyMeasurement(float bodyHeight, float bodyWeight,
      float waistCircumference) {
    this.bodyHeight = bodyHeight;
    this.bodyWeight = bodyWeight;
    this.waistCircumference = waistCircumference;
  }

  public void inputBodyMeasurement() {
    Scanner input = new Scanner(System.in);
    boolean isValid = false;

    // Body Height (m)
    while (isValid == false) {
      System.out.println("Body Height (m) : ");
      this.bodyHeight = input.nextFloat();
      if (this.bodyHeight > 0.1 && this.bodyHeight < 2.52) {
        isValid = true;
      }
    }

    // Body Weight (kg)
    isValid = false;
    while (isValid == false) {
      System.out.println("Body Weight (kg) : ");
      this.bodyWeight = input.nextFloat();
      if (this.bodyWeight > 0.1 && this.bodyWeight < 630) {
        isValid = true;
      }
    }

    // Waist Circumference (cm)
    isValid = false;
    while (isValid == false) {
      System.out.println("Waist Circumference (cm) : ");
      this.waistCircumference = input.nextFloat();
      if (this.waistCircumference > 25 && this.waistCircumference < 323) {
        isValid = true;
      }
    }
    input.close();
  }

  public float getBodyHeight() {
    return this.bodyHeight;
  }

  public float getBodyWeight() {
    return this.bodyWeight;
  }

  public float getWaistCircumference() {
    return this.waistCircumference;
  }


}
