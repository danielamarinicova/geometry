package sk.akademiasovy.geometry2D;


public class Square implements operation, Diagonal{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(double value){
        a=value;
    }

    public Square(){
        a=0;
    }

    public double getArea(){
        return a*a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public double getDiagonal(){
        return Math.sqrt(a*a+a*a);
    }


}
