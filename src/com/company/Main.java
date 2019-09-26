package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("green", 1, 2, 3);
        shapes[1] = new Rectangle("yellow", 2, 3, 4);
        shapes[2] = new Rectangle("rose", 2, 3, 4);

        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }
}
