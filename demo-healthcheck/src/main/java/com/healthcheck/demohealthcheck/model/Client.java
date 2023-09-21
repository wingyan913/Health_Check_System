package com.healthcheck.demohealthcheck.model;


import java.util.ArrayList;
import java.util.List;
import com.healthcheck.demohealthcheck.model.medicalData.BodyMeasurement;
import com.healthcheck.demohealthcheck.model.medicalData.ClientMedicalData;
import com.healthcheck.demohealthcheck.model.medicalData.VitalSigns;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Client {
    private int id;
    private Login login;
    private PersonalInfo personalInfo;

    private static int counter = 0;

    private BodyMeasurement bodyMeasurement;
    private List<BodyMeasurement> bodyMeasurementRecord = new ArrayList<>();

    private VitalSigns vitalSigns;
    private List<VitalSigns> vitalSignsRecord = new ArrayList<>();

    private Report report = new Report();

    private Advice advice = new Advice();
    //
    
    // Contructor(create account)
    public Client(Login login, PersonalInfo personalInfo) {
        this.id = ++counter;
        this.login = login;
        this.personalInfo = personalInfo;
    }

    

    public void setBodyMeasurement(BodyMeasurement bodyMeasurement) {
        this.bodyMeasurement = bodyMeasurement;
        bodyMeasurementRecord.add(bodyMeasurement);
        ClientMedicalData.clientBodyMeasurementMap.replace(this.id, bodyMeasurementRecord);
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
        vitalSignsRecord.add(vitalSigns);
        ClientMedicalData.clientVitalSignsMap.replace(this.id, vitalSignsRecord);
    }



    //

    // public Client(Login login, PersonalInfo personalInfo, BodyMeasurement bodyMeasurement) {
    //     this.id = ++counter;
    //     this.login = login;
    //     this.personalInfo = personalInfo;
    //     this.bodyMeasurement = bodyMeasurement;
    // }

    // public Client(String username, String password, String firstname,
    //         String lastname, String age, String gender, String email) {

    //     this.id = ++counter;
    //     this.login = new Login();
    //     this.personalInfo = new PersonalInfo();
    //     this.bodyMeasurement = new BodyMeasurement(null, null, null, null);
    //     ClientMedicalData.clientBodyMeasurementMap.put(this.id, bodyMeasurementRecord);
        

    //     //
    //     try {
    //         this.login.setUsername(username);
    //     } catch (InvalidFormatException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     try {
    //         this.login.setPassword(password);
    //     } catch (InvalidFormatException e) {
    //         System.out.println(e.getMessage());
    //     }

    //     try {
    //         this.personalInfo.setFirstname(firstname);
    //     } catch (InvalidFormatException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     try {
    //         this.personalInfo.setLastname(lastname);
    //     } catch (InvalidFormatException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     try {
    //         this.personalInfo.setAge(age);
    //     } catch (NumberFormatException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     try {
    //         this.personalInfo.setGender(gender);
    //     } catch (InvalidFormatException e) {
    //         System.out.println(e.getMessage());
    //     }
    //     try {
    //         this.personalInfo.setEmail(email);
    //     } catch (InvalidFormatException e) {
    //         System.out.println(e.getMessage());
    //     }

    // }

    // public void setLogin(Login login) {
    //     this.login = login;
    // }

    // public void setPersonalInfo(PersonalInfo personalInfo) {
    //     this.personalInfo = personalInfo;
    // }

    


    // public static void main(String[] args) {
    //     Client c = new Client("awwwww", "dd", "dddd1", "ddd1", "20s", "a", "dd@ddd");

    //     BodyMeasurement b = new BodyMeasurement("2000-01-01", "111", "111", "111");
    //     c.setBodyMeasurement(b);
    //     BodyMeasurement a = new BodyMeasurement("2222-01-01", "222", "222", "222");
    //     c.setBodyMeasurement(a);
    //     //System.out.println(c);
    //     // System.out.println(c.getBodyMeasurement());
    //     System.out.println(ClientMedicalData.clientBodyMeasurementMap);
    // }



}
