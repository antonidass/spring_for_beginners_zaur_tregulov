package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        Book book = context.getBean("book", Book.class);
//        library.getBook();
//        library.getMagazine();

        library.getBook();
        library.addBook("Anton", book);
        library.addMagazine();


//        library.getMagazine("kdskkd");

//        SchoolLibrary schoolLibrary = context.getBean("schoolBean", SchoolLibrary.class);
//        schoolLibrary.getBook();
//        schoolLibrary.getMagazine();
    }
}
