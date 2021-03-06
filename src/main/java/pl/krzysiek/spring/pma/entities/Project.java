package pl.krzysiek.spring.pma.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long projectId;
    private String name;
    private String stage;
    private String description;

    @OneToMany(mappedBy = "theProject")
    private List<Employee> employees;

    public Project() {}

    public Project(String name, String stage, String decription) {
        this.name = name;
        this.stage = stage;
        this.description = decription;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
