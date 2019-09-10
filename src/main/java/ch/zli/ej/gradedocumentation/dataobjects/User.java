package ch.zli.ej.gradedocumentation.dataobjects;

public class User {

    private long id_;

    private String firstname_;

    private String lastname_;

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
}
