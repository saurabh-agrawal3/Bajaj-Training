package assignment2;

class Circle extends Shape{
        int radius;
        Circle(int radius)
        {
                super("Circle");
                this.radius = radius;
        }
@Override
    double calculateArea() {
            return 3.14*radius*radius;
        }
}