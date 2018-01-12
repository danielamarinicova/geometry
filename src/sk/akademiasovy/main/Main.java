package sk.akademiasovy.main;

import sk.akademiasovy.geometry2D.Circle;
import sk.akademiasovy.geometry2D.Rectangle;
import sk.akademiasovy.geometry2D.Square;
import sk.akademiasovy.geometry2D.Triangle;
import sk.akademiasovy.geometry3D.Ball;
import sk.akademiasovy.geometry3D.Cube;
import sk.akademiasovy.geometry3D.Cuboid;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(7.5);
        Square square2 = new Square();
        Rectangle rect1 = new Rectangle(18.5,11.15);
        Triangle tri1 = new Triangle (3 , 4 ,5);
        Circle cir1= new Circle(5);
        Ball ball1= new Ball(6);
        Cube cube1= new Cube (7);
        Cuboid cubo1= new Cuboid(4,5,8);

        System.out.println("Area of square is:" + square1.getArea() );
        System.out.println("Perimeter of square is:" + square1.getPerimeter() );
        System.out.println("Diagonal of square is:" + square1.getDiagonal() );

        System.out.println("Area of rectangle is:" + rect1.getArea() );
        System.out.println("Perimeter of rectangle is:" + rect1.getPerimeter() );
        System.out.println("Diagonal of rectangle is:" + rect1.getDiagonal() );

        System.out.println("Perimeter of Triangle is:" + tri1.getPerimeter() );
        System.out.println("Area of Triangle is:" + tri1.getArea() );
        System.out.println("Is Triangle rightangled?:" + tri1.isRightAngled() );
        System.out.println("Is Triangle existing?:" + tri1.isExisting() );
        System.out.println("Is Triangle isosceles ?:" + tri1.isIsosceles() );
        System.out.println("Is Triangle equilateral ?:" + tri1.isEquilateral() );

        System.out.println("Perimeter of Circle is:" + cir1.getPerimeter() );
        System.out.println("Area of Circle is:" + cir1.getArea() );

        System.out.println("Surface of Bsll is:" + ball1.getSurface() );
        System.out.println("Volume of Ball is:" + ball1.getVolume() );

        System.out.println("Surface of Cube is:" + cube1.getSurface() );
        System.out.println("Volume of Cube is:" + cube1.getVolume() );
        System.out.println("Diagonal of Cube is:" + cube1.getDiagonal() );

        System.out.println("Surface of Cuboid is:" + cubo1.getSurface() );
        System.out.println("Volume of Cuboid is:" + cubo1.getVolume() );
        System.out.println("Diagonal of Cuboid is:" + cubo1.getDiagonal() );

    }
}
