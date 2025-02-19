package nl.dhoang.SpringBootJava.run;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

// Records are immutable classes without 'getters' and 'setters'
public record Run(Integer id,
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime completedOn,
                  Integer miles,
                  Location location) { }


/*
    All the below is the old way of writing out classes -> it's good that you wrote it out given that you may have to read and refactor to legacy code
     */

//public class Run {
//


//    private Integer id;
//    private String title;
//    private LocalDateTime startedOn;
//    private LocalDateTime completedOn;
//    private Integer miles;
//    private Location location;
//
//    // below is the 'setter' within 'getters & setters'
//    public run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles, Location location) {
//        this.id = id;
//        this.title = title;
//        this.startedOn = startedOn;
//        this.completedOn = completedOn;
//        this.miles = miles;
//        this.location = location;
//        if (!completedOn.isAfter(startedOn)) {
//            throw new IllegalArgumentException("Completed On must be after Started On");
//        }
//    }
//
//    // the below are 'getters' and these are simply methods, you may want to use to access the above data
//    public Duration getDuration() {
//        return Duration.between(startedOn, completedOn);
//    }
//
//    public Integer getAvgPace() {
//        return Math.toIntExact(getDuration().toMinutes() / miles);
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public LocalDateTime getStartedOn() {
//        return startedOn;
//    }
//
//    public LocalDateTime getCompletedOn() {
//        return completedOn;
//    }
//
//    public Integer getMiles() {
//        return miles;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    // below is the generated code for 'equals in hashcode' which Dan mentions -> you need to further research this
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Run run = (Run) o;
//        return Objects.equals(id, run.id) && Objects.equals(title, run.title) && Objects.equals(startedOn, run.startedOn);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, title, startedOn, completedOn, miles, location);
//    }
//
//    @Override
//    public String toString() {
//        return "Run{" +
//                "id=" + id +
//                ", title=" + title + '\'' +
//                ", startedOn=" + startedOn +
//                ", completedOn=" + completedOn  +
//                ", miles=" + miles +
//                ", location=" + location +
//                '}';
//    }

//
//}
