package website.marcioheleno.aop.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Log4j2
@Aspect
@Component
public class CalculateMethodExecutionTimeAspect {

    @Around(value = "execution(* website.marcioheleno.aop.model.*Dao.*(..))")
    public Object calculateMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object retVal = proceedingJoinPoint.proceed();
        long duration = System.currentTimeMillis() - start;
        log.info("Method {} took {} ms to execute", proceedingJoinPoint, duration);
        return retVal;
    }
}
