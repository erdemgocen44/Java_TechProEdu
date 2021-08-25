package day46.FrameDeneme;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    public MyFrame(){
    this.setSize(400,400);
    this.setTitle("İlk Frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(96,149,158));
    };
}
