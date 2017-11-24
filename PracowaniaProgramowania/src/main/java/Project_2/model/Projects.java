package Project_2.model;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROJECTS")
public class Projects {
    @Id
    @GeneratedValue(generator = "gen")
    @SequenceGenerator(name="gen", sequenceName = "author_seq")
    @Column(name = "project_id")
    private int project_id;

    List<Projects> projects;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "start_date", nullable = false)
    static ZonedDateTime start_date;

    @Column(name = "anticipated_end_date", nullable = false)
    static ZonedDateTime anticipated_end_date;

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ZonedDateTime getStart_date() {
        return start_date;
    }

    public static void setStart_date(ZonedDateTime start_date) {
        Projects.start_date = start_date;
    }

    public static ZonedDateTime getAnticipated_end_date() {
        return anticipated_end_date;
    }

    public static void setAnticipated_end_date(ZonedDateTime anticipated_end_date) {
        Projects.anticipated_end_date = anticipated_end_date;
    }
}
