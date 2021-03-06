package frc.robot;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * A currently useless class that creates an empty window. Could be used
 * to create variable/robot inspector with many functions (mostly for fun).
 */
public class Inspector {

    public JFrame frame;
    public static Inspector instance;

    public Inspector(){
        frame = new JFrame("Inspector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600, 600));
        frame.setMaximumSize(new Dimension(1920, 1080));
        frame.setVisible(true);
        frame.setResizable(true);
        frame.requestFocus();
    }

    public static void main(String[] args){
        instance = new Inspector();
        System.out.println(Fun.RandomString(1000));
    }

}