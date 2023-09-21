package com.healthcheck.demohealthcheck.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AgeGroup {
    YOUNG_ADULT1("Young Adult (18 - 24)"),
    YOUNG_ADULT2("Young Adult (25 - 34)"),
    MIDDLE_ADULT1("Middle-aged Adult (35 - 44)"),
    MIDDLE_ADULT2("Middle-aged Adult (45 - 54)"),
    MIDDLE_ADULT3("Middle-aged Adult (55 - 64)"),
    OLD_ADULT("Old Adult (65+)"),
    ERROR("Error");

    private String ageGpDisplayName;

    public static AgeGroup defineAgeGroup(int age) {
        if (age >= 18 && age <= 90) {
            return (age <= 24) ? YOUNG_ADULT1 :
                    (age <= 34) ? YOUNG_ADULT2 :
                    (age <= 44) ? MIDDLE_ADULT1 :
                    (age <= 54) ? MIDDLE_ADULT2 :
                    (age <= 64) ? MIDDLE_ADULT3 :
                    OLD_ADULT;
        }
        return ERROR;
    }
}

/**
 * - 0 - 14 // (X)
 * - 15 - 24 -> 18-24 //
 * - 25 - 34 //
 * - 35 - 44 //
 * - 45 - 54 //
 * - 55 - 64 //
 * - 65+
 */