package Project_2.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="refId", scope=Project_2.model.Employees.class)
@Entity
@Table(name = "EMPLOYEES", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"first_name","last_name"})})
public class Employees {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "salary", nullable = false)
    private int salary;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private DateTime birth;

    @Column(name = "PESEL", length = 11, nullable = false, unique = true)
    private int pesel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Project_ID", referencedColumnName = "project_id")
    private Projects project;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="PersonalInfo_ID", referencedColumnName = "personalInfo_id")
    private PersonalInfo personalInfo;

    @ManyToMany(mappedBy = "subworkers", cascade = CascadeType.ALL)
    private List<Employees> managers = new ArrayList<Employees>();


    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employees>  subworkers = new ArrayList<>();

    public Employees() {}

    public List<Employees> getManagers() {
        return managers;
    }

    public void setManagers(List<Employees> managers) {
        this.managers = managers;
    }

    public List<Employees> getSubworkers() {
        return subworkers;
    }

    public void setSubworkers(List<Employees> subworkers) {
        this.subworkers = subworkers;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String first_name ) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String last_name ) {
        this.lastName = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary( int salary ) {
        this.salary = salary;
    }

    public DateTime getBirth() {
        return birth;
    }

    public void setBirth(DateTime birth) {
        this.birth = birth;
    }
    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }
}
