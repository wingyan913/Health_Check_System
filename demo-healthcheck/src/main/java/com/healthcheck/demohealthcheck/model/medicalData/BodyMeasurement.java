package com.healthcheck.demohealthcheck.model.medicalData;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class BodyMeasurement {

    private LocalDate localDate;
    private String bodyHeight;
    private String bodyWeight;
    private String waistCircumference;

    public double bmi() {
        BigDecimal bh = new BigDecimal(this.bodyHeight);
        BigDecimal bw = new BigDecimal(this.bodyWeight);
        double bmiResult = bw.divide(bh.multiply(bh), 1, RoundingMode.HALF_UP)
                .doubleValue();
        return bmiResult;
    }

    public boolean isBmiPass() {
        return this.bmi() >= 18.5 && this.bmi() < 23.0;
    }

    public String genBmiReport() {
        String weightStatus = "";
        if (this.bmi() < 18.5) {
            weightStatus = "BMI analysis: Underweight";
        } else if (this.bmi() < 23.0) {
            weightStatus = "BMI analysis: Noraml weight";
        } else if (this.bmi() < 25.0) {
            weightStatus = "BMI analysis: Overweight - AT RISK";
        } else if (this.bmi() < 30.0) {
            weightStatus = "BMI analysis: Overweight - MODERATELY OBESE";
        } else if (this.bmi() > 30.0) {
            weightStatus = "BMI analysis: Overweight - SEVERELY OBESE";
        }
        return weightStatus;
    }

    public String genCentralObeseAnalysis(String gender) {
        double waistCm = Double.parseDouble(waistCircumference);
        String centralObeseTestResult = "";

        if (gender.equals("F") && waistCm >= 80.0) {
            centralObeseTestResult =
                    "Central Obese Analysis: You are CENTRALLY OBESE.";
        } else if (gender.equals("F") && waistCm < 80.0) {
            centralObeseTestResult =
                    "Central Obese Analysis: You are not centrally obese.";
        } else if (gender.equals("M") && waistCm >= 90.0) {
            centralObeseTestResult =
                    "Central Obese Analysis: You are CENTRALLY OBESE.";
        } else if (gender.equals("M") && waistCm < 90.0) {
            centralObeseTestResult =
                    "Central Obese Analysis: You are not centrally obese.";
        }

        return centralObeseTestResult;
    }

}
