package com.healthcheck.demohealthcheck.model.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;

public class BmiCalculator {
    private BodyMeasurement bodyMeasurement;

    public static double calculateBMI(String bodyHeight, String bodyWeight) {
        if (!bodyHeight.isBlank() && !bodyWeight.isBlank()) {
            try {
                BigDecimal bh = new BigDecimal(bodyHeight);
                BigDecimal bw = new BigDecimal(bodyWeight);
                return bw.divide(bh.multiply(bh), 1, RoundingMode.HALF_UP).doubleValue();

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Invalid number input.");
                return 0;
            }
        }
        return 0;
    }

    public static String getWeightAnalysis(double bmi) {
        String weightStatus = "";

        if (bmi < 18.5) {
            weightStatus = "BMI analysis: Underweight";
        } else if (bmi < 23.0) {
            weightStatus = "BMI analysis: Normal weight";
        } else if (bmi < 25.0) {
            weightStatus = "BMI analysis: Overweight - AT RISK";
        } else if (bmi < 30.0) {
            weightStatus = "BMI analysis: Overweight - MODERATELY OBESE";
        } else if (bmi >= 30.0) {
            weightStatus = "BMI analysis: Overweight - SEVERELY OBESE";
        }
        return weightStatus;
    }
}
