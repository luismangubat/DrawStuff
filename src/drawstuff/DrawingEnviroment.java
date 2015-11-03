/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Luis
 */
class DrawingEnviroment extends Environment {

    public DrawingEnviroment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
        this.setBackground(Color.white);
    }

    Image logo = null;
    
    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//        graphics.setColor(Color.blue);
//        graphics.drawOval(150, 200, 200, 200);
//        graphics.setColor(Color.black);
//        graphics.drawOval(400, 200, 200, 200);
//        graphics.setColor(Color.red);
//        graphics.drawOval(650, 200, 200, 200);
//        graphics.setColor(Color.yellow);
//        graphics.drawOval(275, 300, 200,200);
//        graphics.setColor(Color.green);
//        graphics.drawOval(525, 300, 200, 200);
        
        graphics.setColor(new Color (0, 0, 255, 120));
        graphics.fillOval(200, 450, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
        graphics.fillOval(73, 150, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
        graphics.fillOval(700, 150, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
        graphics.fillOval(50, 300, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
        graphics.fillOval(600, 350, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
        graphics.fillOval(500, 240, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
        graphics.fillOval(600, 403, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
        graphics.fillOval(450, 350, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 90));
        graphics.fillOval(404, 534, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 200));
        graphics.fillOval(573, 100, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 180));
        graphics.fillOval(130, 10, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 90)); 
        graphics.fillOval(100, 440, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
        graphics.fillOval(400, 100, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
        graphics.fillOval(100, 600, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
        graphics.fillOval(300, 30, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
        graphics.fillOval(380, 145, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
        graphics.fillOval(200, 200, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
        graphics.fillOval(100, 750, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
         graphics.fillOval(200, 100, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
        graphics.fillOval(100, 600, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
         graphics.fillOval(600, 40, 100, 100);
        graphics.setColor(new Color (255, 0, 0, 120));
          graphics.fillOval(50, 4, 100, 100);
        graphics.setColor(new Color (0, 255, 0, 120));
           graphics.fillOval(50, 550, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
        graphics.fillOval(150, 350, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
        graphics.fillOval(150, 350, 100, 100);
        graphics.setColor(new Color (0, 0, 255, 120));
        
                
//        
//        graphics.drawRect(400, 50, 200, 400);
//        graphics.fillRect(400, 50, 200, 400);
        
          graphics.setFont(new Font("Calibri", Font.BOLD, 0));
          graphics.drawString("Hi I like turtles", 50, 100);
//          graphics.drawLine(800, 250, 600, 300);
          
        
        
        if (logo != null) {
            graphics.drawImage(logo, 300, 250, 150, 150, this);
             
        
        }

    }

}
