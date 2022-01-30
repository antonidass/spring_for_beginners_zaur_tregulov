package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {


    public static void main(String[] args) {

        System.out.println("METHOD MAIN STARTS");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        String bookName = library.returnBook();

        System.out.println("Вернули книгу = " + bookName);

        context.close();

        System.out.println("METHOD MAIN ENDS");
    }
}
