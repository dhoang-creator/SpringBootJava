package nl.dhoang.SpringBootJava;

import nl.dhoang.SpringBootJava.run.Location;
import nl.dhoang.SpringBootJava.run.Run;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

//import static java.time.LocalTime.HOURS;

@SpringBootApplication
public class Application {

	private static final Logger log = (Logger) LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		log.info("Application started successfully!");
	}

	// Below is a version of a CLI runner -> created after the application is created
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
