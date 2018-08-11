package javaapplication8;
import javax.swing.*;
public class JavaApplication8 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(50,50,500,200);
        jf.setVisible(true);
        jf.setTitle("Hello");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         JLabel label2 = new JLabel("hello");
         label2.setBounds(10,10,100,40);
         label2.setVisible(true);
         jf.setContentPane(null);
         jf.getContentPane().add(label2);
        
        
    }
    
}