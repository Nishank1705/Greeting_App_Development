package org.example.ServiceLayer;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public static String getGreeting(){
        return "Hello World";
    }
}