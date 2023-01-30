package assignment2;

class Square extends Shape{
    int side;
    Square(int side)
    {
        super("Square");
        this.side = side;
    }
    @Override
    double calculateArea() {
        return side*side;
    }
}