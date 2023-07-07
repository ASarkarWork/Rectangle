package com.thoughtworks.rectangle;

class Rectangle {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area() {
        return length * breadth;
    }
}