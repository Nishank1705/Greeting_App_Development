package org.example.ServiceLayer;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public static String getGreeting(){
        return "Hello World";
    }
    //  this code is for repository
    @Autowired
    private GreetingRepository greetingRepository;

    public void saveGreeting(String message) {
        greetingRepository.save(message);
    }

    public String getGreeting2() {
        return greetingRepository.find();
    }
}