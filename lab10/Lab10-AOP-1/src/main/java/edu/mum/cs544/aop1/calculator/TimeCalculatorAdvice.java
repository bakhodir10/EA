package edu.mum.cs544.aop1.calculator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimeCalculatorAdvice {

//    private static Logger logger = LogManager.getLogger(LogAdvice.class.getName());

    @Around(value = "execution(* edu.mum.cs544.aop1.dao.ICustomerDAO.save(..))")
    public Object invoke(ProceedingJoinPoint call) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start(call.getSignature().getName());
        Object retVal = call.proceed();
        sw.stop();
        long totalTime = sw.getLastTaskTimeMillis();
        System.out.println("Time to execute save = " + totalTime);
        return retVal;
    }
}
