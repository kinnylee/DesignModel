package com.kinnylee.example.drawpicture;

import java.util.Vector;

/**
 * Created by lijl-c on 2016/8/17.
 */
public class Picture extends Graphics {

    private Vector<Graphics> graphicsVector = new Vector<>();

    @Override
    public void draw() {
        for (Graphics graphic : graphicsVector ) {
            graphic.draw();
        }
    }

    public void add(Graphics graphics){
        graphicsVector.add(graphics);
    }

    public void remove(Graphics graphics){
        graphicsVector.remove(graphics);
    }

    public Graphics getChild(int i){
        return graphicsVector.get(i);
    }
}
