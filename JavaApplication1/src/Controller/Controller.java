/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import database.Database;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.*;
import javax.swing.*;
/**
 *
 * @author rannypa
 */
public class Controller implements ActionListener {
    private Database o = new Database();
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        //frame MenuMhaasiswa tab Daftar Geladi
        if (ae.getSource().equals(l.getBLoginMhs())){
            if((!l.getTFUsernameMhs().getText().equals("Mhs"))&&(!l.getTFPasswordMhs().getText().equals("coba"))){
                JOptionPane.showMessageDialog(m, "Username dan Password Tidak Ditemukan", "Error!!!", JOptionPane.WARNING_MESSAGE);
        } else{
           m.addlistener(this);
           m.setVisible(true);
           l.setVisible(false);
            }
        }
        if(ae.getSource().equals(l.getBLoginAdmin())){
            if(!l.getTFUsernameAdmin().getText().equals("admin") && (!l.getTFPasswordAdmin().getText().equals("admin1"))){
                JOptionPane.showMessageDialog(m, "Username dan Password Tidak Ditemukan", "Error!!!", JOptionPane.WARNING_MESSAGE);
            } else{
                a.addListener(this);
                a.setVisible(true);
            }
        }
        if(ae.getSource().equals(m.getBKembali1())){
            h = model.menu2(m.getTFULokasi().getText());
            JOptionPane.showMessageDialog(m, "Lokasi Berhasil Dipilih");
        }
        if(ae.getSource().equals(m.getBKembali2())){
            if((h!=null)){
                model.menu3(Integer.parseInt(m.getTFIDK().getText()),model.getMahasiswa(nn),h);
                JOptionPane.showMessageDialog(m, "Kelompok Berhasil Dipilih");
            } else{
                JOptionPane.showMessageDialog(m, "Kelompok Tidak Dapat dipilih", "Warning!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
        
        if (ae.getSource().equals(m.getBSimpan())){
            String name = m.getTFNamadpn().getText();
            String name2 = m.getTFNamablk().getText();
            String name3;
            if(m.getRBLaki().isSelected()){
                name3 = "Laki-laki";
            } else{
                name3 = "Perempuan";
            }
            Date name8 = m.getBirth();
            String name4 = m.getTFTelepon().getText();
            String name5 = m.getTFAlamat().getText();
            int name6 = Integer.parseInt(m.getTFipk().getText());
            long name7 = Long.parseLong(m.getTFnim().getText());
            nn = name7;
            try {
                Mahasiswa m = new Mahasiswa(name, name2, name3, name8, name4, name5, name6, name7);
                model.addMahasiswa(m);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(m, "Tidak Dapat Ditambahkan", "Error!!!", JOptionPane.WARNING_MESSAGE);
                
            }
            JOptionPane.showMessageDialog(m, "Mahasiswa Berhasil Didaftarkan");
            m.rDaftarGeladi();
            
        }
           
    }
    private Lokasi h=null;
    private Login l;
    private MenuMahasiswa m;
    private MenuAdmin a;
    private Aplikasi model;
    private long nn = 0;
    private Mahasiswa mm;
    public Controller(Aplikasi model){
        this.model = model;
        m = new MenuMahasiswa();
        l = new Login();
        a = new MenuAdmin();
        l.addListener(this);
        l.setVisible(true);
    }
    
}
