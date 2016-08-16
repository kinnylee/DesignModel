package com.kinnylee.example.CubeToCircle;

/**
 * Created by lijl-c on 2016/8/16.
 */
public class Cube {

    private double width;

    Cube(int width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double volume(){
        return width * width *width;
    }

    public double faceArea(){
        return width * width * 6;
    }
}
