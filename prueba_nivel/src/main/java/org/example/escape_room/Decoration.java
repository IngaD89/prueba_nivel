package org.example.escape_room;

public class Decoration {
    private int id;
    private String name;
    private double price;
    private String materialType;

    public Decoration(
            int id,
            String name,
            double price,
            String materialType
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.materialType = materialType;
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

    public double getPrice() {
        double totalDecorationPrice = (this.price * 21) / 100;
        return totalDecorationPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterialType() {
        return this.materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
}
