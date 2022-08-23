package com.nseit.springExce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringExceApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringExceApplication.class);


        BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

        int result = binarySearchImpl.binarySearch(new int[]{1, 42, 2, 13}, 2);
        System.out.println(result);

        System.out.println(binarySearchImpl);

    }

}
