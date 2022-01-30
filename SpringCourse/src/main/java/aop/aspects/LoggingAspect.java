package aop.aspects;

//
//import aop.Book;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Order(2)
public class LoggingAspect {
//    @Before("aop.aspects.PointCuts.allAddMethods()")
//    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println("methodSignature" + methodSignature);
//        System.out.println("methodSighnature.getMethod() = " + methodSignature.getMethod());
//        System.out.println("methodSighnature.getReturnType = " + methodSignature.getReturnType());
//        System.out.println("methodSighnature.getName = " + methodSignature.getName());
//
//        if (methodSignature.getName().equals("addBook")) {
//            Object[] arguments = joinPoint.getArgs();
//            for (Object obj : arguments) {
//                if (obj instanceof Book) {
//                    Book mybook = (Book) obj;
//                    System.out.println("Инфо о книге название - " + mybook.getName() + " author = " + mybook.getAuthor() + "  " + mybook.getReleaseYear());
//                } else {
//                    System.out.println("Добавил книгу - " + obj);
//                }
//            }
//        }

//        System.out.println("beforeGetBookAdvice логирование до получения книги/журнала");
//        System.out.println("-----------------------------------------");
//    }

//
//    @Pointcut("execution(* aop.Library.get*())")
//    private void allGetMethodsFromLibrary() {}
//
//    @Pointcut("execution(* aop.Library.return*())")
//    private void allReturnMethodsFromLibrary() {}
//
//    @Pointcut("allReturnMethodsFromLibrary() || allGetMethodsFromLibrary()")
//    private void allGetReturnMethodsFromLibrary() {}
//
//    @Before("allGetMethodsFromLibrary()")
//    public void beforeGetLogginAdvice() {
//        System.out.println("beforeGetLoggingAdvice writeint Log #1");
//    }
//
//    @Before("allReturnMethodsFromLibrary()")
//    public void beforeReturnLogginAdvice() {
//        System.out.println("beforeRETURNLoggingAdvice writeint Log #2");
//    }
//
//    @Before("allGetReturnMethodsFromLibrary()")
//    public void beforeGetReturnAdvice() {
//        System.out.println("boforeGetReturnLoggingAdvice writiing #3");
//    }




//
//    @Pointcut("execution(* aop.Library.returnMagazine())")
//    private void onlyReturnMagazine() {}
//
//
//    @Before("!onlyReturnMagazine()")
//    public void beforeGetReturnAdvice() {
//        System.out.println("beforeGetReturnAdvice without returnMagazine #4");
//    }
}
