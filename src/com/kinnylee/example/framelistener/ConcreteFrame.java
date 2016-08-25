package com.kinnylee.example.framelistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by lijl-c on 2016/8/24.
 */
public class ConcreteFrame extends Frame {

    public ConcreteFrame(){

    }

    public static void main(String[] args){
        ConcreteFrame frame = new ConcreteFrame();
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse click...");
            }
        });
    }
}
