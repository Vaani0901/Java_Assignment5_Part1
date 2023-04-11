public class Triangle implements Shape {
    float side;

    public Triangle(float side){
        this.side = side;
    }

    @Override
    public float calculateArea(){
        float triangleArea = (float) (0.5*side*side);
        return triangleArea;
    }

    @Override
    public float calculatePerimeter(){
        float trianglePerimeter = side*3;
        return trianglePerimeter;
    }
    
}