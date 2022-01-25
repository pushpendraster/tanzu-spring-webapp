package com.example;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public String getGreeString(){
        return "I know only one thing which is everything :)";
    }
}
