package Project_2.model;
import javax.persistence.*;

@Entity
@Table(name = "PERSONAL_INFO")
public class PersonalInfo {
    @Id
    @GeneratedValue(generator = "gen")
    @SequenceGenerator(name="gen", sequenceName = "author_seq")
    @Column(name = "personalInfo_id")
    private int personalInfo_id;

    @Column(name = "firstLanguage", nullable = false)
    private String languages;

    @Column(name = "yearsOfExperience", nullable = false)
    private int  yearsOfExperience;

    @Column(name = "phoneNumber", length =  15, nullable = false)
    private String  phoneNumber;

    @Column(name = "jobPost", nullable = false)
    private String jobPost;

    public int getPersonalInfo_id() {
        return personalInfo_id;
    }

    public void setPersonalInfo_id(int personalInfo_id) {
        this.personalInfo_id = personalInfo_id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobPost() {
        return jobPost;
    }

    public void setJobPost(String jobPost) {
        this.jobPost = jobPost;
    }
}
