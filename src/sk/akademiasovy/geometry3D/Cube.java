package sk.akademiasovy.geometry3D;

public class Cube implements operation3D,Diagonal3D{
    private double a;

    public Cube(double a) {
        this.a = a;
    }



    @Override
    public double getSurface() {
        return 6*a*a;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }


    @Override
    public double getDiagonal() {
        return Math.sqrt(3*a);
    }
}
