package edu.mum.cs544.aop1.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

    private static Logger logger = LogManager.getLogger(LogAdvice.class.getName());

    @After(value = "execution(* edu.mum.cs544.aop1.email.IEmailSender.sendEmail(..)) && args(email, message)")
    public void logAfterEmail(JoinPoint joinPoint, String email, String message) {
        logger.warn(joinPoint.getSignature().getName());
        logger.warn("Address = " + email);
        logger.warn("Message = " + message);
    }
}