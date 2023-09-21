package Class.PossibleDisease;

public class Arrhythmia {
  private int heartRate;

  public static String getHeartRateAnalysis(int heartRate) {
    String heartRateAnalysis = "";
    if (heartRate < 60) {
      heartRateAnalysis = "Resting heart rate analysis: Slow heart rate (Bradycardia).";
    }
    else if (heartRate <= 100) {
      heartRateAnalysis = "Resting heart rate analysis: Normal heart rate.";
    }
    else if (heartRate > 100) {
      heartRateAnalysis = "Resting Heart rate analysis: Fast heart rate (Tachycardia).";
    }
    return heartRateAnalysis;
  }
  
}

// Reference
// Harvard Health Publishing (Harvard Medical School)_HEART HEALTH - What is a normal heart rate?
// https://www.health.harvard.edu/heart-health/what-your-heart-rate-is-telling-you
