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

    //  this code is for uc5
    public void saveGreetingbyid(Long id, String message) {
        greetingRepository.savebyid(id, message);
    }

    public String getGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}