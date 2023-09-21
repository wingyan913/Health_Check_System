package com.healthcheck.demohealthcheck.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE(1, 'M'),
    FEMALE(2, 'F'),
    ;

    private int genderNum;
    private char genderStr;
  
}
