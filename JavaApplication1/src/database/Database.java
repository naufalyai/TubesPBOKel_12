/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import View.MenuAdmin;
import View.MenuMahasiswa;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaapplication1.Kelompok;
import javaapplication1.Lokasi;
import javaapplication1.Mahasiswa;
import javaapplication1.Pembimbing;
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
    private PreparedStatement ps;
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

            String query = "INSERT INTO mahasiswa(firstnama,lastnama,jenisK,tanggalLahir,telepon,alamat,ipk,nim) VALUES ('"+m.getFirstNama()+"','"+m.getLastNama()+"','"+m.getJenisKelamin()+"','"+m.getTanggalLahir()+"','"+m.getTelepon()+"','"+m.getAlamat()+"',"+m.getIpk()+","+m.getNim()+")";
            st.execute(query);
            JOptionPane.showConfirmDialog(n, "Data Telah di inputkan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(n, "Mahasiswa tak dapat di inputkan", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void savePembimbing (Pembimbing p,int idL) {

        try {

            String query = "INSERT INTO pembimbing VALUES ('"+p.getFirstNama()+"','"+p.getLastNama()+"','"+p.getJenisKelamin()+"','"+p.getTanggalLahir()+"','"+p.getTelepon()+"','"+p.getAlamat()+"',"+p.getNip()+","+idL+")";
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
  public Lokasi getLokasi2(String nL){
        Lokasi ll = null;
        try{
            String query = "SELECT * FROM lokasi WHERE nlokasi= '"+nL+"'";
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
  public DefaultListModel fillListBoxKel(Lokasi l){
      DefaultListModel s = new DefaultListModel();
     
      try{
          String sql = "SELECT idKelompok FROM kelompok WHERE nomorLokasi = "+l.getNomorLokasi();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              int id = rs.getInt("idKelompok");
              s.addElement("Kelompok "+String.valueOf(id)+" ID : "+String.valueOf(id));
          }
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Tidak Ada Lokasi", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
      return s;
      
        
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
  public DefaultListModel fillListBox(){
      DefaultListModel m = new DefaultListModel();
     
      try{
          String sql = "SELECT nlokasi FROM lokasi";
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              String name = rs.getString("nlokasi");
              m.addElement(name);
          }
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Tidak Ada Lokasi", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
      return m;
      
        
  }
  public DefaultListModel fillListBoxSA(int id){
      DefaultListModel m = new DefaultListModel();
     
      try{
          String sql = "SELECT idKelompok,firstnama,lastnama,nim FROM mahasiswa join kelompok using(idKelompok) WHERE  idKelompok = "+id;
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              String name1 = rs.getString("idKelompok");
              
              String name3 = rs.getString("firstnama");
              String name4 = rs.getString("lastnama");
              String name5 = rs.getString("nim");
              m.addElement(name5+": "+name3+" "+name4);
          }
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Tidak Ada Lokasi", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
      return m;
      
        
  }
  public void deleteKelompok(int idK){
      try{
         String query = "DELETE FROM kelompok WHERE idKelompok ="+idK;
         st.execute(query);
         JOptionPane.showMessageDialog(n, "Kelompok telah dihapus");
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Gagal Menghapus", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
  }
  public void deleteLokasi(String nlokasi){
      try{
         String query = "DELETE FROM lokasi WHERE nlokasi = '"+nlokasi+"'";
         st.execute(query);
         JOptionPane.showMessageDialog(n, "Lokasi telah dihapus");
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Gagal Menghapus", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
  }
  public DefaultListModel fillListBoxLK2(){
      DefaultListModel m = new DefaultListModel();
     
      try{
          String sql = "SELECT idKelompok,nlokasi FROM kelompok join lokasi using(nomorLokasi)";
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              String name1 = rs.getString("idKelompok");
              String name2 = rs.getString("nlokasi");
              m.addElement(name2+": Kelompok "+name1+" id: "+name1);
          }
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Tidak Ada Lokasi", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
      return m;
      
        
  }
  public DefaultListModel fillListBoxLP(){
      DefaultListModel m = new DefaultListModel();
     
      try{
          String sql = "SELECT nip,firstnama_p,lastnama_p,nlokasi FROM pembimbing join lokasi using(nomorLokasi)";
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
              String name1 = rs.getString("nip");
              String name2 = rs.getString("nlokasi");
              String name3 = rs.getString("firstnama_p");
              String name4 = rs.getString("lastnama_p");
              m.addElement("*Nama: "+name3+" "+name4+" NIP: "+name1+" Lokasi: "+name2);
          }
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Tidak Ada Lokasi", "Error!!!", JOptionPane.WARNING_MESSAGE);
          //e.printStackTrace();
      }
      return m;
      
        
  }
  public void deletePembimbing(String p){
      
      try{
          String query = "DELETE FROM pembimbing WHERE nip ="+p;
          st.execute(query);
          JOptionPane.showMessageDialog(n, "Pembimbing berhasil dihapus");
      } catch(Exception e){
          JOptionPane.showMessageDialog(n, "Gagal menghapus Pembimbing", "Error!!", JOptionPane.WARNING_MESSAGE);
      }
      
  }
  
}

