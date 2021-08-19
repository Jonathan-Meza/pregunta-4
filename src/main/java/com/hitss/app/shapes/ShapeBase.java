package com.hitss.app.shapes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ShapeBase {
    protected Double base;
    protected Double height;

    public Double getArea(){
        return this.base * this.height;
    }
}
