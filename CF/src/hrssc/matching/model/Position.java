package hrssc.matching.model;

public class Position {
    private String title;
    private String level; // 1

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Position(String title, String level) {
        this.title = title;
        this.level = level;
    }

    public Position() {
    }
}
