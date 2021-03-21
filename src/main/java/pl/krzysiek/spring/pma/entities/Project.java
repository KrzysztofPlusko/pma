package pl.krzysiek.spring.pma.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Project {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long projectId;
    private String name;
    private String stage;
    private String decription;

    public Project() {}

    public Project(String name, String stage, String decription) {
        this.name = name;
        this.stage = stage;
        this.decription = decription;
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

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}