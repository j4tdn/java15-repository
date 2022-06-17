

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class bai5 extends JFrame{

    public static void main(String[] args) {
        new bai5();
    }
    public bai5 ()
    {
        this.setTitle("Bai 5");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(3);
        this.setLayout(new GridLayout(2, 2));
        JButton jaButton = new JButton("1. January");
        jaButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mot Jbutton da duoc nhan");
                
            }
        });
        this.add(jaButton);
        JButton feButton = new JButton("2. February");
        feButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mot Jbutton da duoc nhan");
                
            }
        });
        this.add(feButton);
        JButton maButton = new JButton("3. March");
        maButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mot Jbutton da duoc nhan");
                
            }
        });
        this.add(maButton);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        JButton apButton = new JButton("4. April");
        apButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mot Jbutton da duoc nhan");
                
            }
        });
        panel.add(apButton);
        JButton mayButton = new JButton("5. May");
        mayButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mot Jbutton da duoc nhan");
                
            }
        });
        panel.add(mayButton);
        JButton junButton = new JButton("6. June");
        junButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Mot Jbutton da duoc nhan");
                
            }
        });
        panel.add(junButton);
        this.add(panel);
        this.setVisible(true);
        
    }

}