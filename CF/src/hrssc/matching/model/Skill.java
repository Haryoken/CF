package hrssc.matching.model;

public class Skill {
    private String title;
    private double experience; // From 0 -> 5

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Skill(String title, double experience) {
        this.title = title;
        this.experience = experience;
    }
    public Skill() {
        this.title = "";
        this.experience = 0;
    }
}

