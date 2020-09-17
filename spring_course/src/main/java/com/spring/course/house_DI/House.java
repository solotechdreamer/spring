package com.spring.course.house_DI;

import com.spring.course.house_DI.services.HPGasConnection;
import com.spring.course.house_DI.services.LPGConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {

    @Autowired
    LPGConnection connection;

    public House(){
        System.out.println("House No param: "+connection);
    }

//    public House(HPGasConnection connection){
//        this.connection = connection;
//        System.out.println("House with param: "+ this.connection.connection());
//    }
}
