package com.company;

public class Rectangle extends Shape {
    int x;
    int y;
    int z;
    int w;

    public Rectangle(String color, int x, int y, int z) {
        super(color);
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    @Override
    String draw() {
        return "Rectangle";
    }
}
