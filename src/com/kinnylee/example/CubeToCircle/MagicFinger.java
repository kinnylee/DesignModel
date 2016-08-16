package com.kinnylee.example.CubeToCircle;

/**
 * Created by lijl-c on 2016/8/16.
 */
public class MagicFinger implements IBallIF {

    private  double radius = 0;
    private final static double PI = 3.14;
    private Cube cube;

    MagicFinger(Cube cube){
        this.cube = cube;
        radius = cube.getWidth();
    }

    @Override
    public double area() {
        return radius * radius * 6;
    }

    @Override
    public double volume() {
        return radius * radius * radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
