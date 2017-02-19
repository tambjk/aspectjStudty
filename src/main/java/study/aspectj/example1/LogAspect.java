package study.aspectj.example1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Erman-PC-G on 18.02.2017.
 */
@Aspect
public class LogAspect {

    @Before("execution(* study.aspectj.example1.EmployeeService.getAllEmployees(..) )")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("beforeLog");

    }
}
