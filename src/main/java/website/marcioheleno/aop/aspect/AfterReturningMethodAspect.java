package website.marcioheleno.aop.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Log4j2
@Aspect
@Component
public class AfterReturningMethodAspect {

    @AfterReturning(value = "execution(* website.marcioheleno.aop.model.*Dao.*(..)))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info(" After returning from a method {}", joinPoint);
        log.info(" Arguments passed are {}", joinPoint.getArgs());
        log.info(" Value returned is {}", result);
    }
}
