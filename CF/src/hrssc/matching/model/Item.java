package hrssc.matching.model;

import java.util.List;

public class Item {

    private int id;
    private List<Skill> skills;
    private List<Position> positions;
    private List<String> domains;
    private String location;
    private double rating;
    private String itemType;
    private List<String> type;

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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Item(int id, List<Skill> skills, List<Position> positions, List<String> domains, String location, double rating, String itemType, List<String> type) {
        this.id = id;
        this.skills = skills;
        this.positions = positions;
        this.domains = domains;
        this.location = location;
        this.rating = rating;
        this.itemType = itemType;
        this.type = type;
    }

    public Item(){}
}
