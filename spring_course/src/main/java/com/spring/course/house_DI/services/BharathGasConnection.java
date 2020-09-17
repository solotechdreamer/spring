package com.spring.course.house_DI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BharathGasConnection implements LPGConnection {
    @Override
    public String connection() {
        return "Bharath gas connection established";
    }
}
