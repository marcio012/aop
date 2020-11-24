package website.marcioheleno.aop.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Log4j2
@Aspect
@Component
public class BeforeMethodAspect {

    @Before("execution (* website.marcioheleno.aop.model.*Dao.*(..))")
    public void before(JoinPoint joinPoint) {
        log.info(" Before executing a method {}", joinPoint);
        log.info(" Arguments passed are {}", joinPoint.getArgs());
    }
}
