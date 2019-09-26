package com.company;

public class Circle extends Shape {
    int x,y,r;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    String draw() {
        return "Circle";
    }
}
