package com.healthcheck.demohealthcheck.model.medicalData;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VitalSigns {
    private LocalDate localDate;
    private double bodyTemperature;
    private int systolicBP;
    private int diastolicBP;
    private int heartRate;
    private int oxygenSaturation;


    public String genTempAnalysis() {
        String tempAnalysis = "";
        if (this.bodyTemperature < 36.0) {
            return "Tympanic Temperature Analysis: HYPOTHERMIA";
        } else if (this.bodyTemperature < 37.7) {
            return "Tympanic Temperature Analysis: Normal Temperature";
        } else if (this.bodyTemperature < 37.6) {
            return "Tympanic Temperature Analysis: FEVRE";
        }

        return "ERROR";
    }


    /*
     * Hypotension: <90 || <60; Normal: 90-119 && 60-79 Elevated: 120-129 && 60-79 Stage 1: 130-139 || 80-89 Stage 2: 140 or + || 90 or + Crisis: 181+ || 121
     */
    public String genBloodPressureAnalysis() {
        if (this.systolicBP > 180 || this.diastolicBP > 120)
            return "Blood Pressure Category: Hypertensive Crisis.";

        if (this.systolicBP >= 140 || this.diastolicBP >= 90)
            return "Blood Pressure Category: Hypertension, Stage 2.";

        if ((this.systolicBP >= 130 && this.systolicBP < 140)
                || (this.diastolicBP >= 80 && this.diastolicBP < 90))
            return "Blood Pressure Category: Hypertension, Stage 1.";

        if (this.systolicBP >= 120 && this.systolicBP < 130
                && this.diastolicBP >= 60 && this.diastolicBP < 80)
            return "Blood Pressure Category: Elevated blood pressure.";

        if (this.systolicBP >= 90 && this.systolicBP < 120
                && this.diastolicBP >= 60 && this.diastolicBP < 80)
            return "Blood Pressure Category: Normal blood pressure.";

        if (this.systolicBP < 90 || this.diastolicBP < 60)
            return "Blood Pressure Category: Hypotension, Low blood pressure.";

        return "ERROR";
    }

    public String getHeartRateAnalysis() {
        if (heartRate < 60)
            return "Resting heart rate analysis: Slow heart rate (Bradycardia).";
        else if (heartRate <= 100)
            return "Resting heart rate analysis: Normal heart rate.";
        else if (heartRate > 100)
            return "Resting Heart rate analysis: Fast heart rate (Tachycardia).";

        return "ERROR";
    }

    public String genOxygenSaturationAnalysis() {
        String oxygenSaturationAnalysis = "";
        if (oxygenSaturation >= 95)
        return oxygenSaturationAnalysis = "Oxygen Saturation Analysis: Normal oxygen saturation level.";

        if (oxygenSaturation >= 85 && oxygenSaturation <= 94)
        oxygenSaturationAnalysis += "Oxygen Saturation Analysis: HYPOXIC. ";

        if (oxygenSaturation >= 88 && oxygenSaturation <= 92)
        oxygenSaturationAnalysis += "Oxygen Saturation Analysis: Normal oxygen saturation level (For COPD only).";

        else if (oxygenSaturation <= 85)
        oxygenSaturationAnalysis = "Oxygen Saturation Analysis: SEVERELY HYPOXIC.";

        return oxygenSaturationAnalysis;
    }



}
