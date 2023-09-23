package com.healthcheck.demohealthcheck.service.client.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.healthcheck.demohealthcheck.entity.EMedicalData;
import com.healthcheck.demohealthcheck.model.Client;
import com.healthcheck.demohealthcheck.model.Login;
import com.healthcheck.demohealthcheck.model.PersonalInfo;
import com.healthcheck.demohealthcheck.model.calculator.BmiCalculator;
import com.healthcheck.demohealthcheck.model.database.ClientDatabase;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;
import com.healthcheck.demohealthcheck.repository.MedicalDataRepository;
import com.healthcheck.demohealthcheck.service.client.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private MedicalDataRepository medicalDataRepository;

    // entity / repository
    @Override
    public EMedicalData save(EMedicalData medicalData) {
        return medicalDataRepository.save(medicalData);
    }

    //
    @Override
    public Optional<Client> create(Client client) {
        return ClientDatabase.create(client);
    }

    // @Override
    // public Optional<Client> create(Login login, PersonalInfo personalInfo) {
    // return ClientDatabase.create(login, personalInfo);
    // }

    @Override
    public Optional<Client> findByEmail(String email) {
        return ClientDatabase.findByEmail(email);
    }

    @Override
    public Optional<Client> findByUsername(String username) {
        return ClientDatabase.findByUsername(username);
    }

    @Override
    public Optional<Client> updateByEmail(String email, Client newClient) {
        return ClientDatabase.updateByEmail(email, newClient);
    }

    @Override
    public Optional<Client> updateByUsername(String username,
            Client newClient) {
        return ClientDatabase.updateByUsername(username, newClient);
    }

    @Override
    public Optional<Client> removeByEmail(String email) {
        return ClientDatabase.removeByEmail(email);
    }

    @Override
    public Optional<Client> removeByUsername(String username) {
        return ClientDatabase.removeByUsername(username);
    }

    @Override
    public Optional<Client> patchUsernameByEmail(String email,
            String username) {
        return ClientDatabase.patchUsernameByEmail(email, username);
    }

    @Override
    public Optional<Client> patchPasswordByEmail(String email,
            String password) {
        return ClientDatabase.patchPasswordByEmail(email, password);
    }

    @Override
    public Optional<Client> patchFirstnameByEmail(String email,
            String firstname) {
        return ClientDatabase.patchFirstnameByEmail(email, firstname);
    }

    @Override
    public Optional<Client> patchLastnameByEmail(String email,
            String lastname) {
        return ClientDatabase.patchLastnameByEmail(email, lastname);
    }

    @Override
    public Optional<Client> patchEmailByUsername(String username,
            String email) {
        return ClientDatabase.patchEmailByUsername(username, email);
    }

    @Override
    public Optional<Client> patchPasswordByUsername(String username,
            String password) {
        return ClientDatabase.patchPasswordByUsername(username, password);
    }

    @Override
    public Optional<Client> patchFirstnameByUsername(String username,
            String firstname) {
        return ClientDatabase.patchFirstnameByUsername(username, firstname);
    }

    @Override
    public Optional<Client> patchLastnameByUsername(String username,
            String lastname) {
        return ClientDatabase.patchLastnameByUsername(username, lastname);
    }

    /*
     * Body Measurement
     */

    @Override
    public Optional<Client> patchBMByUsername(String username,
            BodyMeasurement bodyMeasurement) {
        return ClientDatabase.patchBMByUsername(username, bodyMeasurement);
    }

    /*
     * Vital Signs
     */

    @Override
    public Optional<Client> patchVSByUsername(String username,
            VitalSigns vitalSigns) {
        return ClientDatabase.patchVSByUsername(username, vitalSigns);
    }


}
