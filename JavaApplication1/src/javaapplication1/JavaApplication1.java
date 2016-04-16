/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import Controller.Controller;
import java.text.ParseException;

/**
 *
 * @author Naufal Dzaky
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Aplikasi app = new Aplikasi();
        app.mainmenu();
        Controller c = new Controller(app);
        
    }
  
}
