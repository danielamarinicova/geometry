package sk.akademiasovy.main;

import sk.akademiasovy.geometry.Rectangle;
import sk.akademiasovy.geometry.Square;
import sk.akademiasovy.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(7.5);
        Square square2 = new Square();
        Rectangle rect1 = new Rectangle(18.5,11.15);
        Triangle tri1 = new Triangle (3 , 4 ,5);
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
    }
}
