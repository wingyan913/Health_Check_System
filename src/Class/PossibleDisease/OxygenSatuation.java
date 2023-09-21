package Class.PossibleDisease;

public class OxygenSatuation {
  private int oxygenSaturation;

  public static String getOxygenSaturationAnalysis(int oxygenSaturation) {
    String oxygenSaturationAnalysis = "";
    if (oxygenSaturation >= 95) { // >= 95
      oxygenSaturationAnalysis = "Oxygen Saturation Analysis: Normal oxygen saturation level";
    }
    if (oxygenSaturation >= 88 && oxygenSaturation <= 92) { // 88-92
      oxygenSaturationAnalysis = "Oxygen Saturation Analysis: (For COPD) Normal oxygen saturation level";
    }
    if (oxygenSaturation >= 85 && oxygenSaturation <= 94) { // 85-94
      oxygenSaturationAnalysis = "Oxygen Saturation Analysis: HYPOXIC";
    }
    else if (oxygenSaturation <= 85) {
      oxygenSaturationAnalysis = "Oxygen Saturation Analysis: SEVERELY HYPOXIC";
    }
    return oxygenSaturationAnalysis;
  }
  
}
