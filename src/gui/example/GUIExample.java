/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.example;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Muhtasim Kopot
 */
public class GUIExample implements ActionListener {
    
    int count = 0;
    private JLabel lebel;
    private JButton button;
    private JPanel panel;
    private JFrame frame;
    
        public GUIExample(){
            frame = new JFrame();
            panel = new JPanel();
            button = new JButton("Click it");
            button.addActionListener(this);
            lebel = new JLabel("The Number of cliks: 0");
            panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(lebel);
            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Our GUI");
            frame.pack();
            frame.setVisible(true);
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        new GUIExample();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     count+=100;
     lebel.setText("Buttons aren't Toys!");
    }
    
}
