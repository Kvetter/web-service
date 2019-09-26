package dk.profac.demo.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "profac_users")
public class ProfacUser {

    @Id
    private long id;

    private String username;
    private String password; // password skal minimum være x karaktere langt
    private String firstName;
    //private String lastName; // Fjern og lav som opgave
    //private String email; // lav som opgave

    public ProfacUser() {}

    public ProfacUser(String username, String password, String firstName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}

