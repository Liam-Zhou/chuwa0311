class hw2Q1_Polymorphism {
    // Parent class (superclass)
    static class Shape {
        // Method to calculate area (to be overridden by subclasses)
        public double calculateArea() {
            return 0.0;
        }
    }

    // Subclass Circle inheriting from Shape
    static class Circle extends Shape {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Override calculateArea method to calculate area of circle
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Subclass Rectangle inheriting from Shape
    static class Rectangle extends Shape {
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Override calculateArea method to calculate area of rectangle
        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Polymorphic behavior: Using a Shape reference to refer to Circle object
        Shape shape1 = circle;

        // Polymorphic behavior: Using a Shape reference to refer to Rectangle object
        Shape shape2 = rectangle;

        // Calculating area using polymorphism
        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }
}
