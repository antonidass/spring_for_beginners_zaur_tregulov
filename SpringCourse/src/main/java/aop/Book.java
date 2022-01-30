package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Presuplenie i nakazanie")
    private String name;

    @Value("Достоевский А. В.")
    private String author;


    @Value("1866")
    private int releaseYear;

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }
}
