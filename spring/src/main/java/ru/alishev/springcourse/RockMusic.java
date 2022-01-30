package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    String[] songs = {"Kek", "This", "ROCK"};
    @Override
    public String[] getSong() {
        return songs;
    }
}
