package website.marcioheleno.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPointConfiguration {

    @Pointcut("execution(* website.marcioheleno.aop.model.OrderDao.*(..))")
    public void orderDaoExecution() {}

    @Pointcut("execution(* website.marcioheleno.aop.model.StockDao.*(..))")
    public void stockDaoExecution() {}

    @Pointcut("execution(* website.marcioheleno.aop.business.*.*(..))")
    public void allBusinessLayerMethods() {}

    @Pointcut("execution(* website.marcioheleno.aop.data.*.*(..))")
    public void allDataLayerMethods() {}
}
