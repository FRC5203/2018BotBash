package frc.robot;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Inspector {

    public static JFrame frame;
    public static Inspector instance;

    static {
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
    }

}