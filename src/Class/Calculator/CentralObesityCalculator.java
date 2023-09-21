package Class.Calculator;

import Enum.Gender;

public class CentralObesityCalculator {
  private Gender gender;
  private float waistCircumference;
  //jprivate int point;

  public static String getCentralObeseAnalysis(Gender gender,
      float waistCircumference) {
    String centralObeseTestResult = "";
    if (gender == Gender.FEMALE && waistCircumference >= 80) {
      centralObeseTestResult = "Central Obese Analysis: You are CENTRALLY OBESE.";
    }
    if (gender == Gender.FEMALE && waistCircumference < 80) {
      centralObeseTestResult = "Central Obese Analysis: You are not centrally obese.";
    }
    if (gender == Gender.MALE && waistCircumference >= 90) {
      centralObeseTestResult = "Central Obese Analysis: You are CENTRALLY OBESE.";
    }
    if (gender == Gender.MALE && waistCircumference < 90) {
      centralObeseTestResult = "Central Obese Analysis: You are not centrally obese.";
    }
    return centralObeseTestResult;

  }
}
