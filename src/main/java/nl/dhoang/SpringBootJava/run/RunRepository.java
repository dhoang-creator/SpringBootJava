package nl.dhoang.SpringBootJava.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    // this was taken from the controller due to separation of responsibilities
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return run;
    }

    Run findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id() == id)
                .findFirst()
                .get();
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoPeriod.MINUTES),
                3,
                Location.INDOOR));

        runs.add(new Run(2,
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6,
                Location.INDOOR));
    }
}
