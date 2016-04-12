/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author rannypa
 */
public class Controller implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        //frame MenuMhaasiswa tab Daftar Geladi
        if (ae.getSource().equals(m.getBSimpan())){
            String name = m.getTFNamadpn().getText();
            String name2 = m.getTFNamablk().getText();
            
        }
    }
    
    private MenuMahasiswa m = new MenuMahasiswa();
    
    public Controller(){
        m.addlistener(this);
        m.setVisible(true);
    }
    
}
