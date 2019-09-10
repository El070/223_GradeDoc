package ch.zli.ej.gradedocumentation.dataobjects;

import javax.validation.constraints.*;

public class Subject {

    private long id_;

    @NotEmpty(message = "Subject name cannot be empty")
    @Size(min = 1, max = 30, message = "The max length allowed for the subject name is 30")
    private String name_;

    @Min(value = 1, message = "Semester cannot be lower than 1")
    @Max(value = 8, message = "Semester cannot be higher than 8")
    private int semester_;

    @DecimalMin(value = "1.0", message = "Grade cannot be lower than 1.0")
    @DecimalMax(value = "6.0", message = "Grade cannot be higher than 6.0")
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
