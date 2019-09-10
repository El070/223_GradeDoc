package ch.zli.ej.gradedocumentation.dataobjects;

import javax.persistence.*;

@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long id_;

    @Column(name = "role_name")
    private String name_;

    @Column(name = "role_desc")
    private String desc_;

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

    public String getDesc() {
        return desc_;
    }

    public void setDesc(String desc) {
        desc_ = desc;
    }
}
