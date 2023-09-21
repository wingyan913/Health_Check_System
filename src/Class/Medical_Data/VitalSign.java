package Class.Medical_Data;

import java.util.Arrays;
import java.util.Scanner;

public class VitalSign {
  
  private float tympanicTemperature;
  private int[] bloodPressures = new int[2]; // SBP, LBP
  private int heartRate;
  private int oxygenSaturation;

  public VitalSign() {

  }

  public VitalSign(float tympanicTemperature, int[] bloodPressures, int heartRate, int oxygenSaturation) {
    this.tympanicTemperature = tympanicTemperature;
    this.bloodPressures = Arrays.copyOf(bloodPressures, bloodPressures.length);
    this.heartRate = heartRate;
    this.oxygenSaturation = oxygenSaturation;
  }

  public void inputVitalSign() {
    Scanner input = new Scanner(System.in);
    boolean isValid = false;

    // Typanic Temperature
    while (isValid == false) {
      System.out.println("Typanic Temperature (\\u00B0C): ");
      this.tympanicTemperature = input.nextFloat();
      if (this.tympanicTemperature > 28 && this.tympanicTemperature < 45) {
        isValid = true;
      }
    }

    // Blood Pressure [0: Systolic blood pressure; 1: Diastolic blood pressure]
    isValid = false;
    while (isValid == false) {
      System.out.println("Systolic Blood Pressure (mmHg): ");
      this.bloodPressures[0] = input.nextInt();
      if (this.bloodPressures[0] > 30 && this.bloodPressures[0] < 300) {
        isValid = true;
      }
    }
    isValid = false;
    while (isValid == false) {
      System.out.println("Diastolic Blood Pressure (mmHg): ");
      this.bloodPressures[1] = input.nextInt();
      if (this.bloodPressures[1] > 30 && this.bloodPressures[1] < 200) {
        isValid = true;
      }
    }

    // Heart Rate
    isValid = false;
    while (isValid == false) {
      System.out.println("Heart Rate (bpm): ");
      this.heartRate = input.nextInt();
      if (this.heartRate > 30 && this.heartRate < 250) {
        isValid = true;
      }
    }

    // Oxygen Saturation
    isValid = false;
    while (isValid == false) {
      System.out.println("Saturation of Peripheral Oxygen (%): ");
      this.oxygenSaturation = input.nextInt();
      if (this.oxygenSaturation > 80 && this.oxygenSaturation < 101) {
        isValid = true;
      }
    }

    input.close();
  }
  public int[] getBloodPressures() {
    return this.bloodPressures;
  }
  public int getHeartRate() {
    return this.heartRate;
  }
}
