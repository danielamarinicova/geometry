package sk.akademiasovy.geometry2D;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        a=b=c=0;
    }


    public double getPerimeter() {
        return a+b+c;
    }

    public double getArea(){
        double s;
        s=getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }

    public boolean isRightAngled(){
        if(a*a+b*b==c*c)
            return true;
        else if(a*a+c*c==b*b)
            return true;
        else if(b*b+c*c==a*a)
            return true;
        else
            return false;



    }

    public boolean isExisting(){
        if(a+b<c)
            return true;
        else if(a+c<b)
            return true;
        else if(b+c<a)
            return true;
        else
            return false;

    }

    public boolean isEquilateral (){
        if(a+b==c/2)
            return true;
        else
            return false;

    }

    public boolean isIsosceles (){
        if(a==b)
            return true;
        else if(a==c)
            return true;
        else if(b==c)
            return true;
        else
            return false;
    }

}
