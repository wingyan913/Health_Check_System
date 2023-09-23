package com.healthcheck.demohealthcheck.service.client;

import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.healthcheck.demohealthcheck.entity.EMedicalData;
import com.healthcheck.demohealthcheck.model.Client;
import com.healthcheck.demohealthcheck.model.Login;
import com.healthcheck.demohealthcheck.model.PersonalInfo;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;

public interface ClientService {

    // entity / repository
    EMedicalData save(EMedicalData medicalData);


    //
    Optional<Client> create(Client client);

    // Optional<Client> create(Login login, PersonalInfo personalInfo);

    Optional<Client> findByEmail(String email);

    Optional<Client> findByUsername(String username);

    Optional<Client> updateByEmail(String email, Client newClient);

    Optional<Client> updateByUsername(String username, Client newClient);

    Optional<Client> removeByEmail(String email);

    Optional<Client> removeByUsername(String username);

    Optional<Client> patchUsernameByEmail(String email, String username);

    Optional<Client> patchPasswordByEmail(String email, String password);

    Optional<Client> patchFirstnameByEmail(String email, String firstname);

    Optional<Client> patchLastnameByEmail(String email, String lastname);

    Optional<Client> patchEmailByUsername(String username, String email);

    Optional<Client> patchPasswordByUsername(String username, String password);

    Optional<Client> patchFirstnameByUsername(String username,
            String firstname);

    Optional<Client> patchLastnameByUsername(String username, String lastname);

    /**
     * Body Measurement
     */
    Optional<Client> patchBMByUsername(String username,
            BodyMeasurement bodyMeasurement);

    /*
     * Vital Signs
     */
    Optional<Client> patchVSByUsername(String username, VitalSigns vitalSigns);



}
