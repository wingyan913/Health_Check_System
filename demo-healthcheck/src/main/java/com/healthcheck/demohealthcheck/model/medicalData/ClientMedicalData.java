package com.healthcheck.demohealthcheck.model.medicalData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.healthcheck.demohealthcheck.model.Client;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ClientMedicalData {
    public static HashMap<Integer, List<BodyMeasurement>> clientBodyMeasurementMap = new HashMap<>();

    public static HashMap<Integer, List<VitalSigns>> clientVitalSignsMap = new HashMap<>();



}
