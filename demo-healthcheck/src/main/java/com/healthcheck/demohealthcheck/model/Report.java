package com.healthcheck.demohealthcheck.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Report {
    // @JsonIgnore
    private double bmiResult;
    private String bmiReport;
    private String centralObeseAnalysis;
    private String temperatureAnalysis;
    private String bloodPressureAnalysis;
    private String heartRateAnalysis;
    private String oxygenSaturationAnalysis;

    


}
