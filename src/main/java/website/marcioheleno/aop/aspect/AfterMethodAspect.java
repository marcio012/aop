package website.marcioheleno.aop.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Log4j2
@Aspect
@Component
public class AfterMethodAspect {

    @After("execution (* website.marcioheleno.aop.model.*Dao.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info(" After executing a method {}", joinPoint);
        log.info(" Arguments passed are {}", joinPoint.getArgs());
    }
}
