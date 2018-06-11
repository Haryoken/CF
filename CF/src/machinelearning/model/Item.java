package machinelearning.model;

import java.util.List;

public class Item {

    private int id;
    private List<Skill> skills;
    private List<String> positions;
    private String location;
    private double rating;
    private String type;

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

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Item(int id, List<Skill> skills, List<String> positions, double rating, String type, String location) {
        this.id = id;
        this.skills = skills;
        this.positions = positions;
        this.rating = rating;
        this.type = type;
        this.location = location;
    }
}
