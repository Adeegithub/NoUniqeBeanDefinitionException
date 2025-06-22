package org.adeesha.nouniquebeandefinitionexception.config;

import org.adeesha.nouniquebeandefinitionexception.beans.Cricketer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CricketerConfig {

    @Bean
    Cricketer legend1(){
        var cricketer = new Cricketer();
        cricketer.setName("Kumar Sangakkara");
        cricketer.setNoOfInnings(233);
        cricketer.setTotalRuns(12400);
        cricketer.setHighestScore(319);
        cricketer.setAverage(57.40);
        cricketer.setStrikeRate(54.19);
        cricketer.setNoOfCenturies(38);
        cricketer.setNoOfHalfCenturies(52);
        return cricketer;
    }

    @Bean
    Cricketer legend2(){
        var cricketer = new Cricketer();
        cricketer.setName("Mahela Jayawardene");
        cricketer.setNoOfInnings(252);
        cricketer.setTotalRuns(11814);
        cricketer.setHighestScore(374);
        cricketer.setAverage(49.84);
        cricketer.setStrikeRate(51.45);
        cricketer.setNoOfCenturies(34);
        cricketer.setNoOfHalfCenturies(50);
        return cricketer;
    }
}
