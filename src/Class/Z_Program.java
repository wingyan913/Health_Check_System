package Class;

import Class.Calculator.BmiCalculator;
import Class.Calculator.CentralObesityCalculator;
import Class.Medical_Data.BodyMeasurement;
import Class.Medical_Data.VitalSign;
import Class.PossibleDisease.Arrhythmia;
import Class.PossibleDisease.BloodPressureCategory;
import Enum.Gender;

public class Z_Program {
  public static void main(String[] args) {
    // Client client1 = new Client();
    // client1.setPersonalData();

    PersonalData p = new PersonalData();
    p.inputPersonalData();
    System.out.println(p.getList());
    // BmiCalculator.getWeightAnalysis(0);
    // CentralObesityCalculator.getCentralObeseAnalysis(null, 0);
  }
}
// // Personal data
// PersonalData p = new PersonalData();
// p.inputPersonalData();

// BMI
// BodyMeasurement b = new BodyMeasurement();
// b.inputBodyMeasurement();
// System.out.println("Body Mass Index (BMI): ");
// System.out.println(
// BmiCalculator.calculateBMI(b.getBodyHeight(), b.getBodyWeight()));
// System.out.println("Category: ");
// System.out.println(BmiCalculator.getWeightAnalysis(
// BmiCalculator.calculateBMI(b.getBodyHeight(), b.getBodyWeight())));

// // Central Obese
// System.out.println(CentralObesityCalculator
// .getCentralObeseAnalysis(Gender.MALE, b.getWaistCircumference()));

// // Hypertension
// VitalSign v = new VitalSign();
// v.inputVitalSign();
// System.out.println(BloodPressureCategory.getBloodPressureAnalysis(v.getBloodPressures()));

// // Arrhythmia
// System.out.println(Arrhythmia.getHeartRateAnalysis(v.getHeartRate()));
