package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2  {


    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        University university = context.getBean("university", University.class);

        university.addStudents();

        try {
            List<Student> students = university.getStudents();
            System.out.println(students);

        }  catch (Exception e) {

        }


        context.close();

    }


}
