package aop.aspects;

//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Order(1)
public class ExceptionHandlingAspect {
//
//    @Before("aop.aspects.PointCuts.allAddMethods()")
//    public void beforeAddExceptionHandlingAdvice() {
//        System.out.println("beforeGetExceptionHandlingAdvice обрабатываем исключение при попытке книга/журнал");
//        System.out.println("-----------------------------------------");
//
//    }
}
