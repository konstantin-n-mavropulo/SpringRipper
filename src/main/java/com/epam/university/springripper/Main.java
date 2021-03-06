package com.epam.university.springripper;

import com.epam.university.springripper.quoters.Quoter;
import com.epam.university.springripper.quoters.TerminatorQuoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Instant;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "spring/spring-app.xml");
        classPathXmlApplicationContext.getBean(Quoter.class).sayQuote();
    }
}