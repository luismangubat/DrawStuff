/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author Luis
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        startUp();
        
        // TODO code application logic here
    }

    private static void startUp() {
        ApplicationStarter.run(new String[0], "Apple ad", new Dimension(800, 600), new DrawingEnviroment());
    }
    
}
