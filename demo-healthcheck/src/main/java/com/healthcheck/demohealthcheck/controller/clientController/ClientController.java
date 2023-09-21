package com.healthcheck.demohealthcheck.controller.clientController;

import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.healthcheck.demohealthcheck.model.Client;
import com.healthcheck.demohealthcheck.model.Login;
import com.healthcheck.demohealthcheck.model.PersonalInfo;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;

public interface ClientController {

    @PostMapping(value = "/client/create")
    Optional<Client> create(@RequestBody Client client);

    // @PostMapping(value = "/client/create2")
    // Optional<Client> create(@RequestBody Login login,
    // @RequestBody PersonalInfo personalInfo);

    @GetMapping(value = "/client/email/{email}")
    Optional<Client> findByEmail(@PathVariable(name = "email") String email);

    @GetMapping(value = "/client/username/{username}")
    Optional<Client> findByUsername(
            @PathVariable(name = "username") String username);

    @PutMapping(value = "/client/update/email/{email}")
    Optional<Client> updateByEmail(@PathVariable(name = "email") String email,
            @RequestBody Client newClient);

    @PutMapping(value = "/client/update/username/{username}")
    Optional<Client> updateByUsername(
            @PathVariable(name = "username") String username,
            @RequestBody Client newClient);

    @DeleteMapping(value = "/client/delete/email/{email}")
    Optional<Client> removeByEmail(@PathVariable(name = "email") String email);

    @DeleteMapping(value = "/client/delete/username/{username}")
    Optional<Client> removeByUsername(
            @PathVariable(name = "username") String username);

    @PatchMapping(value = "/client/patch/email/{email}/username/{username}")
    Optional<Client> patchUsernameByEmail(
            @PathVariable(name = "email") String email,
            @PathVariable String username);

    @PatchMapping(value = "/client/patch/email/{email}/password/{password}")
    Optional<Client> patchPasswordByEmail(
            @PathVariable(name = "email") String email,
            @PathVariable String password);

    @PatchMapping(value = "/client/patch/email/{email}/firstname/{firstname}")
    Optional<Client> patchFirstnameByEmail(
            @PathVariable(name = "email") String email,
            @PathVariable String firstname);

    @PatchMapping(value = "/client/patch/email/{email}/lastname/{lastname}")
    Optional<Client> patchLastnameByEmail(
            @PathVariable(name = "email") String email,
            @PathVariable String lastname);

    @PatchMapping(value = "/client/patch/username/{username}/email/{email}")
    Optional<Client> patchEmailByUsername(
            @PathVariable(name = "username") String username,
            @PathVariable String email);

    @PatchMapping(
            value = "/client/patch/username/{username}/password/{password}")
    Optional<Client> patchPasswordByUsername(
            @PathVariable(name = "username") String username,
            @PathVariable String password);

    @PatchMapping(
            value = "/client/patch/username/{username}/firstname/{firstname}")
    Optional<Client> patchFirstnameByUsername(
            @PathVariable(name = "username") String username,
            @PathVariable String firstname);

    @PatchMapping(
            value = "/client/patch/username/{username}/lastname/{lastname}")
    Optional<Client> patchLastnameByUsername(
            @PathVariable(name = "username") String username,
            @PathVariable String lastname);

    /**
     * Body Measurement
     */
    @PatchMapping(value = "/client/patch/username/{username}/bodymeasurement")
    Optional<Client> patchBMByUsername(
            @PathVariable(name = "username") String username,
            @RequestBody BodyMeasurement bodyMeasurement);

    // delete

    /*
     * Vital Signs
     */

    @PatchMapping(value = "/client/patch/username/{username}/vitalsigns")
    Optional<Client> patchVSByUsername(
            @PathVariable(name = "username") String username,
            @RequestBody VitalSigns vitalSigns);

}
