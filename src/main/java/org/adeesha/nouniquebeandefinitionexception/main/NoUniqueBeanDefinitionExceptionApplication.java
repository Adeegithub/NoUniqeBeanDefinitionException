package org.adeesha.nouniquebeandefinitionexception.main;

import org.adeesha.nouniquebeandefinitionexception.beans.Cricketer;
import org.adeesha.nouniquebeandefinitionexception.config.CricketerConfig;
import org.springframework.boot.SpringApplication;

public class NoUniqueBeanDefinitionExceptionApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(CricketerConfig.class, args);

        Cricketer cricketer = context.getBean(Cricketer.class);
        System.out.println("The Cricketer's Name is: " + cricketer.getName());

        /* comment the 12 and 13 lines and Uncomment the lines 18 and 19 to avoid the exception and */

        //To Avoid the NoUniqueBeanDefinitionException, we can specify the bean name
//        Cricketer cricketer = context.getBean("legend1", Cricketer.class);
//        System.out.println("The Cricketer's Name is: " + cricketer.getName());

        //Alternatively, we can use the @Primary annotation in the CricketerConfig class
    }
}