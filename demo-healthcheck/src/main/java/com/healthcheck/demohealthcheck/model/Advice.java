package com.healthcheck.demohealthcheck.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Advice {
    private List<String> diet = new ArrayList<>(Arrays.asList(//
            "Monday: main", // 
            "Tuesday: main", // 
            "Wednesday: main", // 
            "Thursday: main", // 
            "Friday: main", // 
            "Saturday: main",
            "Sunday: cheat day"));

    private List<String> exercise = new ArrayList<>(Arrays.asList(//
            "Stretch before and after exercise",
            "Brisk walk - 45 mins",
            "Cycling - 30 mins"));

    private List<String> healthCheckPackage = new ArrayList<>(Arrays.asList(//
            "https:// Hospital A: package 1.", //
            "https:// Hospital A: package 2.", //
            "https:// Hospital A: package 3.", //
            "https:// Hospital B: package 1.", //
            "https:// Hospital B: package 2.", //
            "https:// Hospital B: package 3."));

}
