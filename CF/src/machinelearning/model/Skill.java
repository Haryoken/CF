package machinelearning.model;

public class Skill {
    private String title;
    private int experience; // From 0 -> 5

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }
    public Skill() {
        this.title = "";
        this.experience = 0;
    }
}

