package aop.aspects;


import aop.Student;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Aspect
@Order(1)
public class UnisversityLoggingAspect {
//
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice : логируем получение списка студентов пееред getStudents");
//    }
//
//
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student first = students.get(0);
//        String name = first.getNameSurname();
//        name = "Mister  + " + name;
//        first.setNameSurname(name);
//
//
//
//        System.out.println("afterGetStudentsLoggingAdvice : логируем получение списка студентов после! getStudents");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingExceptionAdvice(Exception exception) {
//        System.out.println("afterThrowingExceptionAdvice : брошено иключение ");
//        System.out.println("Exception = " + exception.getMessage());
//    }


}
