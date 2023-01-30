package assignment2;

class Rectangle extends Shape{
    int length, breadth;
    Rectangle(int length, int breadth)
    {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea() {
        return length*breadth;
    }
}