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
        o.connect();
        Object source = ae.getSource();
        //frame MenuMhaasiswa tab Daftar Geladi
        if (ae.getSource().equals(l.getBLoginMhs())){
            if((!l.getTFUsernameMhs().getText().equals("Mhs"))&&(!l.getjPasswordFieldMhs().getText().equals("coba"))){
                JOptionPane.showMessageDialog(m, "Username dan Password Tidak Ditemukan", "Error!!!", JOptionPane.WARNING_MESSAGE);
        } else{
           m.addlistener(this);
           m.setVisible(true);
           l.setVisible(false);
           
           m.getjListPLok().setVisibleRowCount(10);
           m.getjListPLok().setModel(o.fillListBox());
           m.getjListPLok().setVisible(true);
           
           
           
           
            }
        }
        /*if(ae.getSource().equals(m.getBKembali1())){
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
        }*/
        
        
        
        if (ae.getSource().equals(m.getBSimpan())){
            String name = m.getTFNamadpn().getText();
            String name2 = m.getTFNamablk().getText();
            String name3 = null;
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
                //ex.printStackTrace();
                
            }
            JOptionPane.showMessageDialog(m, "Mahasiswa Berhasil Didaftarkan");
            m.rDaftarGeladi();
            
        }
        if(ae.getSource().equals(l.getBLoginAdmin())){
            if((!l.getTFUsernameAdmin().getText().equals("Admin"))&&(!l.getjPasswordFieldAdmin().getText().equals("test"))){
                JOptionPane.showMessageDialog(l, "Username dan Password Tidak Ditemukan", "Error!!!", JOptionPane.WARNING_MESSAGE);
        } else{
           a.addListener(this);
           a.setVisible(true);
           l.setVisible(false);
           a.getjListLokasi().setVisibleRowCount(10);
           a.getjListLokasi().setModel(o.fillListBox());
           a.getjListLokasi().setVisible(true);
           a.getjListHK().setVisibleRowCount(6);
           a.getjListHK().setModel(o.fillListBoxLK2());
           a.getjListHK().setVisible(true);
           
           a.getjListHLok().setVisibleRowCount(6);
           a.getjListHLok().setModel(o.fillListBox());
           a.getjListHLok().setVisible(true);
           
           a.getjListHP().setModel(o.fillListBoxLP());
           a.getjListHP().setVisibleRowCount(6);
           a.getjListHP().setVisible(true);
           JOptionPane.showMessageDialog(a, "Anda Berhasil Masuk");
            }
        l.resetLA();
        }
        if(ae.getSource().equals(a.getBSimpanLokasi())){
            Lokasi lk = new Lokasi(Integer.parseInt(a.getTFnomorLokasi().getText()),a.getTFtambahnamalokasi().getText());
            model.menu4(lk);
            a.getjListLokasi().setVisibleRowCount(10);
            a.getjListLokasi().setModel(o.fillListBox());
            a.getjListLokasi().setVisible(true);
            a.getjListHLok().setVisibleRowCount(6);
            a.getjListHLok().setModel(o.fillListBox());
            a.getjListHLok().setVisible(true);
            a.resetIL(); 
        }
        if(ae.getSource().equals(a.getBSimpanKelompok())){
            Lokasi ll = model.getLokasi(a.getjTFUnmL().getText());
            model.menu6(ll,Integer.parseInt(a.getTFIdKelompoktambahklp().getText()));
            JOptionPane.showMessageDialog(m, "Kelompok Telah Disimpan");
            a.resetTK();
            
        }
        if(ae.getSource().equals(m.getBKembali1())){
            h = model.getLokasi(m.getTFULokasi().getText());
            JOptionPane.showMessageDialog(m, "Kelompok berhasil dipilih");
            m.resetLok();
            m.getjListPKel().setModel(o.fillListBoxKel(h));
            m.getjListPKel().setVisibleRowCount(10);
            m.getjListPKel().setVisible(true);
        }
        if(ae.getSource().equals(m.getBKembali2())){
            model.menu3(Integer.parseInt(m.getTFIDK().getText()), o.getMahasiswa(Long.parseLong(m.getTFgetNIMMhs().getText())),h);
            JOptionPane.showMessageDialog(m, "Anggota Telah ditambahkan kedalam Kelompok");
            m.resetPK();
        }
        if(ae.getSource().equals(m.getBCari())){
            m.getjListLK().setModel(o.fillListBoxSA(Integer.parseInt(m.getTFInsKelompok().getText())));
            JOptionPane.showMessageDialog(m, "Berhasil Ditemukan");
            m.getjListLK().setVisibleRowCount(10);
            m.getjListLK().setVisible(true);
        }
        if(ae.getSource().equals(a.getBHapusKelompok())){
            model.menu7(model.getLokasi(a.getjTFPLHL().getText()), Integer.parseInt(a.getTFIdKlphapuskelompok().getText()));
            a.getjListHK().setVisibleRowCount(6);
            a.getjListHK().setModel(o.fillListBoxLK2());
            a.getjListHK().setVisible(true);
            a.getjListLokasi().setVisibleRowCount(10);
            a.getjListLokasi().setModel(o.fillListBox());
            a.getjListLokasi().setVisible(true);
            a.resetHP();
            
        }
        if(ae.getSource().equals(a.getBHapusLokasi())){
            model.menu5(model.getLokasi(a.getTFnamalokasihapus().getText()));
            a.getjListHLok().setVisibleRowCount(6);
            a.getjListHLok().setModel(o.fillListBox());
            a.getjListHLok().setVisible(true);
            a.resetHLok();
        }
        if(ae.getSource().equals(a.getBSimpan2())){
            String name = a.getTFNamadpnpembimbing().getText();
            String name2 = a.getTFNamablkPembimbing().getText();
            String name3 = null;
            if(a.getRBLakipembimbing().isSelected()){
                name3 = "Laki-laki";
            } else{
                name3 = "Perempuan";
            }
            Date name8 = a.getBirth();
            String name4 = a.getTFTeleponpembimbing().getText();
            String name5 = a.getTFAlamatpembimbing().getText();
            long name7 = Long.parseLong(a.getTFnippembimbing().getText());
            try{
                Pembimbing p = new Pembimbing(name,name2,name3,name8,name4,name5,name7);
                model.addPembimbing(p);
                o.savePembimbing(p, o.getLokasi2(a.getJTFNL().getText()).getNomorLokasi());
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(a, "Pembimbing tidak dapat ditambahkan", "Error!!!", JOptionPane.WARNING_MESSAGE);
                //e.printStackTrace();
            }
            a.rTambahP();
            a.getjListHP().setModel(o.fillListBoxLP());
            a.getjListHP().setVisibleRowCount(6);
            a.getjListHP().setVisible(true);
            
        }
        if(ae.getSource().equals(a.getBHapusPembimbing())){
            model.deletePembimbing(Long.parseLong(a.getjTextFieldPP().getText()));
            a.getjListHP().setModel(o.fillListBoxLP());
            a.getjListHP().setVisibleRowCount(6);
            a.getjListHP().setVisible(true);
            a.resetHP2();
        }
        if(ae.getSource().equals(a.getBKeluarHapusKelompok())){
            a.setVisible(false);
            l.setVisible(true);
            
        }
        if(ae.getSource().equals(a.getBKeluarHapusLokasi())){
            a.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(a.getBKeluarHapusPembimbing())){
            a.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(a.getBKeluarHapusPeserta())){
            a.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(a.getBKeluarTambahKelompok())){
            a.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(a.getBKeluarTambahLokasi())){
            a.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(a.getBKeluarTambahPembimbing())){
            a.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(m.getBKeluarDaftarGeladi())){
            m.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(m.getBKeluarPilihKelompok())){
            m.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(m.getBKeluarPilihLokasi())){
            m.setVisible(false);
            l.setVisible(true);
        }
        if(ae.getSource().equals(m.getBKeluarView())){
            m.setVisible(false);
            l.setVisible(true);
        }
        
       
        
        /*if(ae.getSource().equals(m.getBKembali2())){
            try{
              
            }
        }*/
        
           
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
