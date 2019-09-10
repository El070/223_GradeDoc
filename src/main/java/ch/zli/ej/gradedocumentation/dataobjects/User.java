package ch.zli.ej.gradedocumentation.dataobjects;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id_;

    @NotEmpty(message = "Firstname cannot be empty")
    @Size(min = 2, max = 10, message = "The max length allowed for the firstname is 10")
    @Column(name = "user_firstname")
    private String firstname_;

    @NotEmpty(message = "Lastname cannot be empty")
    @Size(min = 2, max = 10, message = "The max length allowed for the lastname is 10")
    @Column(name = "user_lastname")
    private String lastname_;

    @Email(message = "Email isn't valid")
    @Column(name = "user_email")
    private String email_;

    @Column(name = "user_password")
    private String password_;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles_;

    public long getId() {
        return id_;
    }

    public void setId(long id) {
        id_ = id;
    }

    public String getFirstname() {
        return firstname_;
    }

    public void setFirstname(String firstname) {
        firstname_ = firstname;
    }

    public String getLastname() {
        return lastname_;
    }

    public void setLastname(String lastname) {
        lastname_ = lastname;
    }

    public String getEmail() {
        return email_;
    }

    public void setEmail(String email) {
        email_ = email;
    }

    public String getPassword() {
        return password_;
    }

    public void setPassword(String password) {
        password_ = password;
    }

    public Set<Role> getRoles() {
        return roles_;
    }

    public void setRoles(Set<Role> roles) {
        roles_ = roles;
    }
}
