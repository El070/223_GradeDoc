package ch.zli.ej.gradedocumentation.dataobjects;

public class Subject {

    private long id_;

    private String name_;

    private int semester_;

    private double grade_;

    public long getId() {
        return id_;
    }

    public void setId(long id) {
        id_ = id;
    }

    public String getName() {
        return name_;
    }

    public void setName(String name) {
        name_= name;
    }

    public int getSemester() {
        return semester_;
    }

    public void setSemester(int semester) {
        semester_ = semester;
    }

    public double getGrade() {
        return grade_;
    }

    public void setGrade(double grade) {
        grade_ = grade;
    }
}
