package sk.akademiasovy.geometry2D;


public class Circle implements operation{
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    public Circle() {
        r = 0;
    }


    @Override
    public double getArea() {
        return Math.PI*2*r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*r*r;
    }

}


