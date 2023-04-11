public class Main {
    public static void main(String[] args) 
    {
        Circle c = new Circle(5);
        System.out.println(c.calculateArea()) ;
        System.out.println(c.calculatePerimeter()) ;

        Rectangle r = new Rectangle(4, 6);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());

        Triangle t = new Triangle(10);
        System.out.println(t.calculateArea());
        System.out.println(t.calculatePerimeter());
    }
}