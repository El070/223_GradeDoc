package ch.zli.ej.gradedocumentation.dataobjects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SchoolClass {

    private long id_;

    @NotEmpty(message = "Class name can't be empty")
    @Size(min = 1, max = 20, message = "The max length allowed for the class name is 20")
    private String name_;

    @Min(value = 1800, message = "Class cannot be from earlier than 1800")
    private int year_;

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
        name_ = name;
    }

    public int getYear() {
        return year_;
    }

    public void setYear(int year) {
        year_ = year;
    }
}
