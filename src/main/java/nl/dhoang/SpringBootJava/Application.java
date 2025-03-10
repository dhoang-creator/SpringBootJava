package nl.dhoang.SpringBootJava;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.Logger;

@SpringBootApplication
public class Application {

	private static final Logger log = (Logger) LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application started successfully");

//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

//		Object welcomeMessage = context.getBean("welcomeMessage");
//		System.out.println(welcomeMessage);
	}


}
