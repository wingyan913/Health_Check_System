package com.healthcheck.demohealthcheck.model.database;

import java.util.ArrayList;
import java.util.List;
import com.healthcheck.demohealthcheck.model.Client;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;

public class MedicalDatabase {
    List<BodyMeasurement> bodyMeasurements = new ArrayList<>();

    List<VitalSigns> vitalSignsList = new ArrayList<>();
}
