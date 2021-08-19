package com.hitss.app;

import com.hitss.app.shapes.Rectangle;
import com.hitss.app.shapes.ShapeBase;
import com.hitss.app.shapes.Square;
import com.hitss.app.shapes.Triangle;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@Log4j2
class Command implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Double base = 5.0;
        Double height = 10.0;

        ShapeBase rectangle = new Rectangle();
        rectangle.setBase(base);
        rectangle.setHeight(height);

        ShapeBase triangle = new Triangle();
        triangle.setBase(base);
        triangle.setHeight(height);

        ShapeBase square = new Square();
        square.setBase(base);
        square.setHeight(height);

        log.info("Area Rectangle {},{}: {}", rectangle.getBase(), rectangle.getHeight(), rectangle.getArea());
        log.info("Area Square {},{}: {}", square.getBase(), square.getHeight(), square.getArea());
        log.info("Area Triangle {},{}: {}", triangle.getBase(), triangle.getHeight(), triangle.getArea());

    }

}