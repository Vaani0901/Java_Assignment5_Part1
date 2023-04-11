public class Rectangle implements Shape {
    float length;
    float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculateArea(){
        float rectangleArea = length*width;
        return rectangleArea;
    }

    @Override
    public float calculatePerimeter(){
        float rectanglePerimeter = 2*(length+width);
        return rectanglePerimeter;
    }
}
