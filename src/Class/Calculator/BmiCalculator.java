package Class.Calculator;

public class BmiCalculator {
  private float bodyHeight;
  private float bodyWeight;

  public static float calculateBMI(float bodyHeight, float bodyWeight) {
    // System.out.println("Body Mass Index (BMI): ");
    return bodyWeight / (bodyHeight * bodyHeight);
  }

  public static String getWeightAnalysis(float bmi) {
    String weightStatus = "";
    if (bmi < 18.5) {
      weightStatus = "BMI analysis: Underweight";
    } else if (bmi < 23) {
      weightStatus = "BMI analysis: Noraml weight";
    } else if (bmi < 25) {
      weightStatus = "BMI analysis: Overweight - AT RISK";
    } else if (bmi < 30) {
      weightStatus = "BMI analysis: Overweight - MODERATELY OBESE";
    } else if (bmi > 30) {
      weightStatus = "BMI analysis: Overweight - SEVERELY OBESE";
    }
    return weightStatus;
  }
}

// Reference: 
// HA_Smart Patient
// https://www21.ha.org.hk/smartpatient/MiniSites/en-US/bmi/BMI-Normal/
// Asia Diabetes Foundation
// https://www.diabetesrisk.hk/maintaining_an_ideal_weight
