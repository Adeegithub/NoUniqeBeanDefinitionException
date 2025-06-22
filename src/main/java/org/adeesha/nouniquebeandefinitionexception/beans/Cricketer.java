package org.adeesha.nouniquebeandefinitionexception.beans;

import lombok.Data;

@Data
public class Cricketer {
    private String name;
    private int noOfInnings;
    private int totalRuns;
    private int highestScore;
    private double average;
    private double strikeRate;
    private int noOfCenturies;
    private int noOfHalfCenturies;
}
