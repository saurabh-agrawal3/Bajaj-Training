package assignment2;

class ShapeUse{
    public static void main(String args[])
    {
        Shape sh = new Square(4);
        System.out.println(sh.shapeName);
        System.out.println(sh.calculateArea());
        sh = new Circle(4);
        System.out.println(sh.shapeName);
        System.out.println(sh.calculateArea());
        sh = new Rectangle(5, 7);
        System.out.println(sh.shapeName);
        System.out.println(sh.calculateArea());
    }
}