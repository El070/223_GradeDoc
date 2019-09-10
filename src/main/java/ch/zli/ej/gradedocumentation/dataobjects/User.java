package ch.zli.ej.gradedocumentation.dataobjects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

    private long id_;

    @NotEmpty(message = "Firstname cannot be empty")
    @Size(min = 2, max = 10, message = "The max length allowed for the firstname is 10")
    private String firstname_;

    @NotEmpty(message = "Lastname cannot be empty")
    @Size(min = 2, max = 10, message = "The max length allowed for the lastname is 10")
    private String lastname_;

    @Email(message = "Email isn't valid")
    private String email_;

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

    @Override
    public String toString() {
        return "User[ firstname = " + firstname_ + ", lastname = " + lastname_ + ", email = " + email_ + "]";
    }
}
