package edu.mum.component.impl;

import edu.mum.component.MessageOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class HelloWorldMessageOrigin implements MessageOrigin {

    @Autowired
    private MessageSource messageSource;

    public String getMessage() {
        return messageSource.getMessage("messageText", null, Locale.getDefault());
    }
}
