package com.hitss.app.shapes;


public class Triangle extends ShapeBase {

    @Override
    public Double getArea() {
        return base * height / 2;
    }
}