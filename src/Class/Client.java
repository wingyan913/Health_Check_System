package Class;

import java.util.List;
import Class.Calculator.BmiCalculator;
import Class.Calculator.CentralObesityCalculator;
import Class.Medical_Data.BodyMeasurement;
import Class.Medical_Data.VitalSign;
import Class.PossibleDisease.Arrhythmia;
import Class.PossibleDisease.BloodPressureCategory;
import Class.PossibleDisease.OxygenSatuation;
import Class.PossibleDisease.Temperature;

public class Client {
  private PersonalData personalData;
  private BodyMeasurement bodyMeasurement;
  private VitalSign vitalSign;
  List<PersonalData> storeData;

  public Client() {
   // storeData.get(0);
  }

  public Client(PersonalData personalData, BodyMeasurement bodyMeasurement,
      VitalSign vitalSign) {
    this.personalData = personalData;
    this.bodyMeasurement = bodyMeasurement;
    this.vitalSign = new VitalSign();
  }


  public void setPersonalData(PersonalData personalData) {
    this.personalData = personalData;
  }

  public PersonalData getPersonalData() {
    return this.personalData;
  }

  public static void main(String[] args) {

  }
}
