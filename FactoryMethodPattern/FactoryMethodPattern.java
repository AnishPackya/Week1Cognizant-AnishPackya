package FactoryMethodPattern;

// Factory Method Pattern - Single file format

// Product Interface
interface Shape {
    void draw();
}

// Concrete Products
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Creator (Factory)
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}

// Main class to test Factory Pattern
public class FactoryMethodPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        shape1.draw();

        Shape shape2 = factory.getShape("square");
        shape2.draw();

        Shape shape3 = factory.getShape("rectangle");
        shape3.draw();
    }
}
