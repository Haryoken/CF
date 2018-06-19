package hrssc.matching.model;

import java.util.List;

public class Project{
    private int id;
    private List<Skill> skills;
    private List<Position> positions;
    private String domains;
    private String location;
    private String projectType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public Project(int id, List<Skill> skills, List<Position> positions, String domains, String location, String projectType) {
        this.id = id;
        this.skills = skills;
        this.positions = positions;
        this.domains = domains;
        this.location = location;
        this.projectType = projectType;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project: ";
    }
}
