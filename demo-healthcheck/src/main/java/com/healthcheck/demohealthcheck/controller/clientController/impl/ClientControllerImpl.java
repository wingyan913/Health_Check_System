package com.healthcheck.demohealthcheck.controller.clientController.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.healthcheck.demohealthcheck.controller.clientController.ClientController;
import com.healthcheck.demohealthcheck.model.Client;
import com.healthcheck.demohealthcheck.model.Login;
import com.healthcheck.demohealthcheck.model.PersonalInfo;
import com.healthcheck.demohealthcheck.model.exception.InvalidFormatException;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;
import com.healthcheck.demohealthcheck.service.client.ClientService;

@RestController
@RequestMapping(value = "/api/v1")
public class ClientControllerImpl implements ClientController {

    @Autowired
    ClientService clientService;

    @Override
    public Optional<Client> create(Client client) {
        Login login = client.getLogin();
        PersonalInfo personalInfo = client.getPersonalInfo();
        if (client == null || login == null || personalInfo == null)
            return Optional.empty();

        try {
            Login.isValidUsername(client.getLogin().getUsername());

        } catch (InvalidFormatException e) {
            System.out.println("Please input a valid username format");
            return Optional.empty();
        }

        return clientService.create(client);
    }

    // @Override
    // public Optional<Client> create(Login login, PersonalInfo personalInfo) {
    // if (login == null || personalInfo == null)
    // return Optional.empty();

    // return clientService.create(login, personalInfo);
    // }

    @Override
    public Optional<Client> findByEmail(String email) {
        if (!email.isBlank()) {
            try {
                PersonalInfo.isValidEmail(email);
                return clientService.findByEmail(email);
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Please input a valid email.");
                return Optional.empty();
            }
        }
        System.out.println("Please input a valid email.");
        return Optional.empty();
    }

    @Override
    public Optional<Client> findByUsername(String username) {
        if (!username.isBlank()) {
            try {
                Login.isValidUsername(username);
                return clientService.findByUsername(username);
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Please input a valid username");
                return Optional.empty();
            }
        }
        System.out.println("Please input a valid username");
        return Optional.empty();
    }

    @Override
    public Optional<Client> updateByEmail(String email, Client newClient) {
        if (newClient != null)
            return clientService.updateByEmail(email, newClient);
        return Optional.empty();
    }

    @Override
    public Optional<Client> updateByUsername(String username,
            Client newClient) {
        if (newClient != null)
            return clientService.updateByUsername(username, newClient);
        return Optional.empty();
    }

    @Override
    public Optional<Client> removeByEmail(String email) {
        if (!email.isBlank())
            return clientService.removeByEmail(email);
        return Optional.empty();
    }

    @Override
    public Optional<Client> removeByUsername(String username) {
        if (!username.isBlank())
            return clientService.removeByUsername(username);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchUsernameByEmail(String email,
            String username) {
        if (!email.isBlank())
            return clientService.patchUsernameByEmail(email, username);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchPasswordByEmail(String email,
            String password) {
        if (!email.isBlank())
            return clientService.patchPasswordByEmail(email, password);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchFirstnameByEmail(String email,
            String firstname) {
        if (!email.isBlank())
            return clientService.patchFirstnameByEmail(email, firstname);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchLastnameByEmail(String email,
            String lastname) {
        if (!email.isBlank())
            return clientService.patchLastnameByEmail(email, lastname);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchEmailByUsername(String username,
            String email) {
        if (!username.isBlank())
            return clientService.patchEmailByUsername(username, email);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchPasswordByUsername(String username,
            String password) {
        if (!username.isBlank())
            return clientService.patchPasswordByUsername(username, password);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchFirstnameByUsername(String username,
            String firstname) {
        if (!username.isBlank())
            return clientService.patchFirstnameByUsername(username, firstname);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchLastnameByUsername(String username,
            String lastname) {
        if (!username.isBlank())
            return clientService.patchLastnameByUsername(username, lastname);
        return Optional.empty();
    }

    /*
     * Body Measurement
     */
    @Override
    public Optional<Client> patchBMByUsername(String username,
            BodyMeasurement bodyMeasurement) {
        if (!username.isBlank())
            return clientService.patchBMByUsername(username, bodyMeasurement);
        return Optional.empty();
    }

    @Override
    public Optional<Client> patchVSByUsername(String username,
            VitalSigns vitalSigns) {
        if (!username.isBlank())
            return clientService.patchVSByUsername(username, vitalSigns);
        return Optional.empty();
    }


}
