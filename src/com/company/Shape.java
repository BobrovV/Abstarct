package com.company;

public abstract class Shape {
    String color = "red";

    public Shape(String color) {
        this.color = color;
    }

    abstract String draw();
}
