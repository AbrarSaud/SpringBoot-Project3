package com.example.firstspringboot;

import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Test {
    private int x ;

//
//    public Test() {
////        System.out.println("this is test constructor");
//    }

    public Test(@Qualifier("4") int x) {
        System.out.println("this is test constructor : " + x);


    }
}
