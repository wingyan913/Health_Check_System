package com.healthcheck.demohealthcheck.model.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import com.healthcheck.demohealthcheck.model.Client;
import com.healthcheck.demohealthcheck.model.Login;
import com.healthcheck.demohealthcheck.model.PersonalInfo;
import com.healthcheck.demohealthcheck.model.exception.InvalidFormatException;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;

public class ClientDatabase {
    protected static List<Client> clients = new ArrayList<>();

    // Create account (check any existing username/email -> fail)
    public static Optional<Client> create(Client client) {
        if (isUsernameExisted(client.getLogin().getUsername())
                || isEmailExisted(client.getPersonalInfo().getEmail())) {
            System.out.println("Username/Email is already used.");
            return Optional.empty();
        } else {
            PersonalInfoDatabase.personalInfos.add(client.getPersonalInfo());
            LoginDatabase.logins.add(client.getLogin());
            clients.add(client);
            return Optional.of(client);
        }
    }

    // public static Optional<Client> create(Login login,
    // PersonalInfo personalInfo) {
    // if (isUsernameExisted(login.getUsername())
    // || isEmailExisted(personalInfo.getEmail())) {
    // System.out.println("Username/Email is already used.");
    // return Optional.empty();
    // }

    // LoginDatabase.logins.add(login);
    // PersonalInfoDatabase.personalInfos.add(personalInfo);
    // Client client = new Client(login, personalInfo);
    // clients.add(client);
    // return Optional.of(client);
    // }

    public static boolean isUsernameExisted(String username) {
        return clients.stream()
                .filter(client -> client.getLogin() != null
                        && client.getLogin().getUsername() != null)
                .anyMatch(client -> client.getLogin().getUsername()
                        .equals(username));
    }

    public static boolean isEmailExisted(String email) {
        return clients.stream()
                .filter(client -> client.getPersonalInfo() != null
                        && client.getPersonalInfo().getEmail() != null)
                .anyMatch(client -> client.getPersonalInfo().getEmail()
                        .equals(email));
    }

    // Find by email
    public static Optional<Client> findByEmail(String email) {
        return clients.stream().filter(
                client -> client.getPersonalInfo().getEmail().equals(email))
                .findFirst();
    }

    // Find by username
    public static Optional<Client> findByUsername(String username) {
        return clients.stream().filter(
                client -> client.getLogin().getUsername().equals(username))
                .findFirst();
    }

    // update by email
    public static Optional<Client> updateByEmail(String email,
            Client newClient) {
        if (!findByEmail(email).isPresent()) {
            System.out.println("Email cannot find.");
            return Optional.empty();
        }
        clients.stream().filter(
                client -> client.getPersonalInfo().getEmail().equals(email))
                .forEach(client -> {
                    client.setLogin(newClient.getLogin());
                    client.setPersonalInfo(newClient.getPersonalInfo());
                });

        return Optional.of(newClient);
    }

    // update by username
    public static Optional<Client> updateByUsername(String username,
            Client newClient) {
        if (!findByUsername(username).isPresent()) {
            System.out.println("Username cannot find.");
            return Optional.empty();
        }
        clients.stream().filter(
                client -> client.getLogin().getUsername().equals(username))
                .forEach(client -> {
                    client.setLogin(newClient.getLogin());
                    client.setPersonalInfo(newClient.getPersonalInfo());
                });
        return Optional.of(newClient);
    }

    // remove by email
    public static Optional<Client> removeByEmail(String email) {
        Optional<Client> client = findByEmail(email);
        if (!client.isPresent())
            return Optional.empty();
        clients.remove(client.get());
        return client;
    }

    // remove by username
    public static Optional<Client> removeByUsername(String username) {
        Optional<Client> client = findByUsername(username);
        if (!client.isPresent())
            return Optional.empty();
        clients.remove(client.get());
        return client;
    }

    // patch username by email
    public static Optional<Client> patchUsernameByEmail(String email,
            String username) {
        Optional<Client> client = findByEmail(email);
        if (!client.isPresent()) {
            System.out.println("Email cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getLogin().setUsername(username);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch password by email
    public static Optional<Client> patchPasswordByEmail(String email,
            String password) {
        Optional<Client> client = findByEmail(email);
        if (!client.isPresent()) {
            System.out.println("Email cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getLogin().setPassword(password);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch firstname by email
    public static Optional<Client> patchFirstnameByEmail(String email,
            String firstname) {
        Optional<Client> client = findByEmail(email);
        if (!client.isPresent()) {
            System.out.println("Email cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getPersonalInfo().setFirstname(firstname);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch lastname by email
    public static Optional<Client> patchLastnameByEmail(String email,
            String lastname) {
        Optional<Client> client = findByEmail(email);
        if (!client.isPresent()) {
            System.out.println("Email cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getPersonalInfo().setLastname(lastname);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch email by username
    public static Optional<Client> patchEmailByUsername(String username,
            String email) {
        Optional<Client> client = findByUsername(username);
        if (!client.isPresent()) {
            System.out.println("Username cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getPersonalInfo().setEmail(email);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch password by username
    public static Optional<Client> patchPasswordByUsername(String username,
            String password) {
        Optional<Client> client = findByUsername(username);
        if (!client.isPresent()) {
            System.out.println("Username cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getLogin().setPassword(password);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch firstname by username
    public static Optional<Client> patchFirstnameByUsername(String username,
            String firstname) {
        Optional<Client> client = findByUsername(username);
        if (!client.isPresent()) {
            System.out.println("Username cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getPersonalInfo().setFirstname(firstname);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    // patch lastname by username
    public static Optional<Client> patchLastnameByUsername(String username,
            String lastname) {
        Optional<Client> client = findByUsername(username);
        if (!client.isPresent()) {
            System.out.println("Username cannot find.");
            return Optional.empty();
        }
        try {
            client.get().getPersonalInfo().setLastname(lastname);
            return client;
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    /*
     * Body Measurement
     */
    public static Optional<Client> patchBMByUsername(String username,
            BodyMeasurement bodyMeasurement) {
        Optional<Client> client = findByUsername(username);
        if (client.isEmpty()) {
            System.out.println("Username cannot be found.");
            return Optional.empty();
        }
        try {
            Double bh = null;
            Double bw = null;
            Double wc = null;
            if (bodyMeasurement.getBodyHeight() != null) {
                bh = Double.valueOf(bodyMeasurement.getBodyHeight());
            }
            if (bodyMeasurement.getBodyWeight() != null) {
                bw = Double.valueOf(bodyMeasurement.getBodyWeight());
            }
            if (bodyMeasurement.getWaistCircumference() != null) {
                wc = Double.valueOf(bodyMeasurement.getWaistCircumference());
            }
            if (bh == null || bw == null || wc == null) {
                System.out.println("Invalid number input.");
                return Optional.empty();
            }

            client.get().setBodyMeasurement(bodyMeasurement);
            client.get().getReport().setBmiResult(bodyMeasurement.bmi());
            client.get().getReport()
                    .setBmiReport(bodyMeasurement.genBmiReport());
            client.get().getReport().setCentralObeseAnalysis(
                    bodyMeasurement.genCentralObeseAnalysis(
                            client.get().getPersonalInfo().getGender()));

            return client;

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    /*
     * Vital Signs
     */

    public static Optional<Client> patchVSByUsername(String username,
            VitalSigns vitalSigns) {
        Optional<Client> client = findByUsername(username);
        if (client.isEmpty()) {
            System.out.println("Username cannot be found.");
            return Optional.empty();
        }

        if (vitalSigns == null)
            return Optional.empty();

        client.get().setVitalSigns(vitalSigns);
        //
        client.get().getReport().setTemperatureAnalysis(
                client.get().getVitalSigns().genTempAnalysis());
        client.get().getReport().setBloodPressureAnalysis(client.get().getVitalSigns().genBloodPressureAnalysis());
        client.get().getReport().setHeartRateAnalysis(client.get().getVitalSigns().getHeartRateAnalysis());
        client.get().getReport().setOxygenSaturationAnalysis(client.get().getVitalSigns().genOxygenSaturationAnalysis());

        //
        return client;
    }


}
