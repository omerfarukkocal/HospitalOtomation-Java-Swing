package randevutakip;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewClass {
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(1600,800);
        jf.setTitle("Randevu Takip");
        jf.setLocation(150,100);
        jf.setResizable(false);
       
        
        jf.getContentPane().setLayout(new FlowLayout());
        
        JButton btn1 = new JButton("Butonumuz");
        JTextField text1 = new JTextField(10);
        JLabel label1 = new JLabel("Labelimiz");
        
        
        jf.getContentPane().add(label1);
        jf.getContentPane().add(text1);
        jf.getContentPane().add(btn1);
        
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
