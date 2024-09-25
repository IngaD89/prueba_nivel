package org.example.escape_room;

import java.util.ArrayList;

public class Room {
    private int id;
    private String name;
    private Theme theme;
    private DifficultyLevel difficultyLevel;
    private ArrayList<Hint> hints;
    private ArrayList<Decoration> decorations;

    private double totalPrice;

    public Room(
            int id,
            String name,
            Theme theme,
            DifficultyLevel difficultyLevel
    ) {
        this.id = id;
        this.name = name;
        this.theme = theme;
        this.difficultyLevel = difficultyLevel;
        this.hints = new ArrayList<>();
        this.decorations = new ArrayList<>();
        this.totalPrice = 0;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Theme getTheme() {
        return this.theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public DifficultyLevel getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public ArrayList<Hint> getHints() {
        return hints;
    }

    public ArrayList<Decoration> getDecorations() {
        return decorations;
    }

    public double getTotalPrice() {
        double hintPrice = 0;
        double decorationPrice = 0;

        for(int i = 0; i < hints.size(); i++){
           hintPrice += hints.get(i).getPrice();
        }

        for (int i = 0; i < decorations.size(); i++){
            decorationPrice += decorations.get(i).getPrice();
        }

        this.totalPrice = hintPrice + decorationPrice;

        return this.totalPrice;
    }

}
