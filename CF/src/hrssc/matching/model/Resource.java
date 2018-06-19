package hrssc.matching.model;

import java.util.List;

public class Resource{
    private int id;
    private List<Skill> skills;
    private String position;
    private List<String> domains;
    private List<String> projectType;
    private String location;
    private double rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public List<String> getProjectType() {
        return projectType;
    }

    public void setProjectType(List<String> projectType) {
        this.projectType = projectType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Resource(){

    }

    public Resource(int id, List<Skill> skills, String position, List<String> domains, List<String> projectType, String location, double rating) {
        this.id = id;
        this.skills = skills;
        this.position = position;
        this.domains = domains;
        this.projectType = projectType;
        this.location = location;
        this.rating = rating;
    }
}
