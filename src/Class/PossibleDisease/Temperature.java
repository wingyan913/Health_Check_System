package Class.PossibleDisease;

public class Temperature {
  private float tympanicTemperature;

  public static String getTempAnalysis(float tympanicTemperature) {
    String tempAnalysis = "";
    if (tympanicTemperature < 36.0) {
      tempAnalysis = "Tympanic Temperature Analysis: HYPOTHERMIA";
    }
    else if (tympanicTemperature < 37.7) {
      tempAnalysis = "Tympanic Temperature Analysis: Normal Temperature";
    }
    else if (tympanicTemperature < 37.6) {
      tempAnalysis = "Tympanic Temperature Analysis: FEVRE";
    }
    return tempAnalysis;

  }
}
