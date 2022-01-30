package aop;

import org.springframework.stereotype.Component;

@Component("schoolBean")
public class SchoolLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Берем книгу из schoolLibrary");
    }

    public void getMagazine() {
        System.out.println("Берем журнал");
    }
}
