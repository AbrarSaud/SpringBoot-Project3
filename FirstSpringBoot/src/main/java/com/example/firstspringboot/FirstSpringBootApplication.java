package com.example.firstspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootApplication.class, args);
    }
//
//    // ادخل مثود في سياق سبينق بوت
//    @Bean // audition
//    public String message1() {
//        System.out.println("**");
//        return "Message 1";
//    }
//
//    // بدون اوتيشن يتم تجاهلها
//    public String message2() {
//        return "Message 2";
//    }
//
//    //
//    @Bean // audition
//    @Qualifier("2")
//    public String message3(@Qualifier("1") String m) {
//        System.out.println(m);
//        return "Message 3 ," + m;
//    }
//
//    @Bean
//    @Qualifier("1") // Qualifier
//    public String message4() {
//        System.out.println("##");
//        return "Message 4 ,";
//    }
//
//    @Bean
//    public String message5(@Qualifier("2") String m) {
//        System.out.println("This is message5 # " + m);
//        return "Message 5";
//    }

    // ---
    @Bean
    @Primary // audition
    public int num1() {
        System.out.println("This is num1");
        return 1;
    }

    @Bean
    @Qualifier("4")
    public int num2(@Qualifier("3") int x) {
        System.out.println("This is num2");
        return 1;
    }

    @Bean
    @Qualifier("3")
    public int num3() {
        System.out.println("This is num3");
        return 1;
    }

//    @Bean
//    public int num4(@Qualifier("4") int z) {
//        System.out.println("This is num4");
//        return 1;
//    }


}
