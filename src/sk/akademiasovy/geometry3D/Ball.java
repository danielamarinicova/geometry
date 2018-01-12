package sk.akademiasovy.geometry3D;

public class Ball implements operation3D{
    private double r;

    public Ball(double r) {
        this.r = r;
    }



    @Override
    public double getSurface() {
        return 4*Math.PI*r*r;
    }

    @Override
    public double getVolume() {
        return 4/3*Math.PI*r*r*r;
    }
}
