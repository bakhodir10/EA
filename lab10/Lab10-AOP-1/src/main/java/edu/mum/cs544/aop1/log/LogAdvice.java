package edu.mum.cs544.aop1.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

    private static Logger logger = LogManager.getLogger(LogAdvice.class.getName());

    @Pointcut(value = "execution(* edu.mum.cs544.aop1.email.EmailSender.sendEmail(..)) && args(email, message)", argNames = "joinPoint,email,message")
    public void logAfterEmail(JoinPoint joinPoint, String email, String message) {
        System.out.println("method= " + joinPoint.getSignature().getName()
                + " address= " + email
                + " message= " + message);
    }
}