package hello.intl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        Logger logger = LoggerFactory.getLogger(HelloController.class);

        logger.info("Got request for index");
        logger.error("Got request for index");
        return "Greetings from Spring Boot!";
    }
    
}
