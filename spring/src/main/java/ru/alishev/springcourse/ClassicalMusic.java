package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;
/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    String[] songs = {"BB", "AA", "CLASSIC"};

    @PostConstruct
    public void doMyInit() {
        System.out.println("do my initialiazation");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("do my destroyiation ");
    }
    @Override
    public String[] getSong() {
        return songs;
    }
}
