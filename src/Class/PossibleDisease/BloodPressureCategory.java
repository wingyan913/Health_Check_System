package Class.PossibleDisease;

public class BloodPressureCategory {
  private static int[] bloodPressures = new int[2]; // ???? need static?

  public static String getBloodPressureAnalysis(int[] bloodPressures) {
    String bloodPressureCategory = "";

    int sbp = bloodPressures[0];
    int lbp = bloodPressures[1];
    
    if (sbp < 90 || lbp < 60) {
      bloodPressureCategory = "Blood Pressure Categoey: LOW blood pressure (HYPOTENSION).";
    }
      else if (sbp < 120 && lbp < 80) {
      bloodPressureCategory = "Blood Pressure Categoey: Normal blood pressure.";
    } else if (sbp < 130 && lbp < 80) {
      bloodPressureCategory =
          "Blood Pressure Categoey: ELEVATED blood pressure.";
    } else if (sbp < 140 || lbp < 90) {
      bloodPressureCategory =
          "Blood Pressure Categoey: HIGH blood pressure (HYPERTENSION) Stage 1.";
    } else if (sbp <= 180 || lbp <= 120) {
      bloodPressureCategory =
          "Blood Pressure Categoey: HIGH blood pressure (HYPERTENSION) Stage 2.";
    } else if (sbp > 180 || lbp > 120) {
      bloodPressureCategory =
          "Blood Pressure Categoey: HYPERTENSION CRISIS (consult your doctor IMMEDIATELY)";
    }
    return bloodPressureCategory;
  }

}
// Reference
// Mayoclinic
// Low blood pressure (hypotension)
// https://www.mayoclinic.org/diseases-conditions/low-blood-pressure/symptoms-causes/syc-20355465

// American Heart Association_High Blood Pressure
// https://www.heart.org/en/health-topics/high-blood-pressure