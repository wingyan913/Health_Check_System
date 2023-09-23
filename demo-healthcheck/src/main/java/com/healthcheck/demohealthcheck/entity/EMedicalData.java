package com.healthcheck.demohealthcheck.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Medical_Data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EMedicalData {

    @Id
    @Column(name = "client_id")
    private long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "body_height")
    private double bodyHeight;

    @Column(name = "body_weight")
    private double bodyWeight;

    @Column(name = "waist_circumference")
    private double waistCircumference;

    @Column(name = "body_temperature")
    private double bodyTemperature;

    @Column(name = "systolic_BP")
    private int systolicBp;

    @Column(name = "diastolic_BP")
    private int diastolicBP;

    @Column(name = "heart_rate")
    private int heartRate;

    @Column(name = "oxygen_saturation")
    private int oxygenSaturation;

    
}
