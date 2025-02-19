package nl.dhoang.SpringBootJava.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// the below for the controller class is if you want multiple paths for the different CRUD methods
@RequestMapping("/api/runs")
public class RunController {


    // @Autowired should not be used given that it makes mocking and stubbing hard
    private final RunRepository runRepository;

    /*
        The below way is not the way of doing things since you create a new instance every time it is requested:
            - Instead, you should use DI
     */
//    public RunController() {
//        this.runRepository = new RunRepository();
//    }

    // In the below, DI is taking the above rather than creating a new instance
    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }


    @GetMapping("")
    List<Run> findAll() {
        return null;
    }

    // we want to alter the below for dynamic variables
    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id) {
        return runRepository.findById(id);
    }
}
