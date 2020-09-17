package com.spring.course.house_DI.services;

import org.springframework.stereotype.Component;

@Component
public class HPGasConnection implements LPGConnection {
    @Override
    public String connection() {
        return "HP Gas connection established";
    }
}
