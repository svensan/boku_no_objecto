/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab2.uicomponent.MyButton;

import javax.swing.*;
//ximport java.awt.*;
import java.awt.event.*;
//import static java.awt.Color.*;
/**
 *
 * @author moliv
 */
public class LAB2E32 implements ActionListener {

    MyButton labE2Button;
    public LAB2E32(){
    
    JFrame labE2Frame = new JFrame(); // pallar ej byta namn från E2
    labE2Button = new MyButton();
    labE2Button.addActionListener(labE2Button);// Den lyssnar på sig själv här
    labE2Frame.add(labE2Button);
    labE2Frame.pack();
    labE2Frame.setVisible(true);
    labE2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    

    public static void main(String[] args) {    
        LAB2E3 justWork = new LAB2E3(); 
    }
    
    public void actionPerformed(ActionEvent e){//oanvänd här
    labE2Button.changeState();
}
    
}

