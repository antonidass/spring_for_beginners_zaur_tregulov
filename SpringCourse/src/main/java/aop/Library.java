package aop;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library extends AbstractLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу! Library");
        System.out.println("-----------------------------------------");
    }

    public String returnBook() {
        System.out.println("Возвращаем книу Library");
        System.out.println("-----------------------------------------");
        return "VOINA i MIR";
    }

    public void getMagazine() {
        System.out.println("Берем журнал");
        System.out.println("-----------------------------------------");

    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в Library");
        System.out.println("-----------------------------------------");

    }

    public void addBook(String personName, Book book) {
        System.out.println("Добавляем книгу в library");
        System.out.println("-----------------------------------------");

    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в library");
        System.out.println("-----------------------------------------");

    }
}
