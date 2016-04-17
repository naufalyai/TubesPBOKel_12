/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import View.MenuAdmin;
import View.MenuMahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaapplication1.Kelompok;
import javaapplication1.Lokasi;
import javaapplication1.Mahasiswa;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Naufal Dzaky
 */
public class Database {
    private String server = "jdbc:mysql://localhost/tubes", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;
    private MenuMahasiswa n;
    private MenuAdmin a;
    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    public void saveMahasiswa (Mahasiswa m) {

        try {

            String query = "INSERT INTO mahasiswa VALUES ('"+m.getFirstNama()+"','"+m.getLastNama()+"','"+m.getJenisKelamin()+"','"+m.getTanggalLahir()+"','"+m.getTelepon()+"','"+m.getAlamat()+"',"+m.getIpk()+","+m.getNim()+")";
            st.execute(query);
            JOptionPane.showConfirmDialog(n, "Data Telah di inputkan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(n, "Mahasiswa tak dapat di inputkan", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
  public Mahasiswa getMahasiswa(long nim){
        Mahasiswa m = null;
        try{
            String query = "SELECT * FROM mahasiswa WHERE nim= "+nim;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                m = new Mahasiswa(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getLong(8));
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(n, "Error: Mahasiswa Tidak Ada", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return m;
    }
  public void saveLokasi (Lokasi l) {

        try {

            String query = "INSERT INTO lokasi(nomorLokasi,nlokasi) VALUES ("+l.getNomorLokasi()+",'"+l.getLokasi()+"')";
            st.execute(query);
            JOptionPane.showConfirmDialog(n, "Data Telah di inputkan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(n, "Lokasi tak dapat di inputkan", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
  public Lokasi getLokasi(int idLokasi){
        Lokasi ll = null;
        try{
            String query = "SELECT * FROM lokasi WHERE nomorLokasi= "+idLokasi;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                ll = new Lokasi(rs.getInt(1),rs.getString(2));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(n, "Error: Mahasiswa Tidak Ada", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return ll;
    }
  public void saveKelompok(Lokasi l,int w){
      try {

            String query = "INSERT INTO kelompok(idKelompok,nomorLokasi) VALUES ("+w+","+l.getNomorLokasi()+")";
            st.execute(query);
            JOptionPane.showConfirmDialog(n, "Data Telah di inputkan");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(n, "Kelompok tak dapat di inputkan", "Error", JOptionPane.WARNING_MESSAGE);
        }
  }
  public Kelompok getKelompok(int idKelompok){
        Kelompok kk = null;
        try{
            String query = "SELECT * FROM kelompok WHERE idKelompok= "+idKelompok;
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                kk = new Kelompok(rs.getInt(1));
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(n, "Error: Mahasiswa Tidak Ada", "Error", JOptionPane.WARNING_MESSAGE);
        }
        return kk;
    }
  public void tambahAnggota(int idKelompok,int nim){
      
      try{
          String query = "UPDATE mahasiswa SET idKelompok = "+idKelompok+" WHERE nim ="+nim;
          st.execute(query);
          JOptionPane.showConfirmDialog(n, "Data Telah di inputkan");
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Anggota tidak bisa ditambahkan", "Error!!!!", JOptionPane.WARNING_MESSAGE);
      }
  }
  /*public void fillListBox(MenuAdmin a){
      try{
          String sql = "SELECT * FROM lokasi";
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              String name = rs.getString("nlokasi");
              a.setName(name);
          }
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Tidak Ada Lokasi", "Error!!!", JOptionPane.WARNING_MESSAGE);
      }
      
        
  }*/
  
  
  
}

