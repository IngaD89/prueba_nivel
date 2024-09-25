package org.example.escape_room;

public class Hint {
    private int id;
    private String name;
    private double price;
    private double estimated_time;
    private Theme theme;

    public Hint(
            int id,
            String name,
            double price,
            double estimated_time,
            Theme theme
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.estimated_time = estimated_time;
        this.theme = theme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        double totalHintPrice = (this.price * 10) / 100;
        return totalHintPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEstimated_time() {
        return estimated_time;
    }

    public void setEstimated_time(double estimated_time) {
        this.estimated_time = estimated_time;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
