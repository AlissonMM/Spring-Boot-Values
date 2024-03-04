package alisson.usingValues;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageSystem implements CommandLineRunner {

    @Value("${name}")
    private String name;
    @Value("${email:default@email.com}")
    private String email;
    @Value("${cellphones}")
    private List<Long> cellphones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Message send by: " + name
        + " Email: " + email + " to cellphones: " + cellphones);
    }
}
