/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Naufal Dzaky
 */
public class Aplikasi {
    private ArrayList<Pembimbing> daftarPembimbing;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<Lokasi> daftarLokasi;
    
    public void addPembimbing(Pembimbing p){
        daftarPembimbing.add(p);
    }
    public void addMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
    }
    public void addLokasi(Lokasi l){
        daftarLokasi.add(l);
    }

    public Pembimbing getPembimbing(long nip) {
        Pembimbing p = null;
        for (int i=0;i<daftarPembimbing.size();i++){
            if(nip == daftarPembimbing.get(i).getNip()){
                 p = daftarPembimbing.get(i);
            }
        }
        return p;
    }


    public Mahasiswa getMahasiswa(long nim) {
        Mahasiswa m = null;
        for (int i=0;i<daftarMahasiswa.size();i++){
            if(nim == daftarMahasiswa.get(i).getNim()){
                 m = daftarMahasiswa.get(i);
            }
        }
        return m;
    }
    
    public void deleteMahasiswa(long nim){
        for (int i=0;i<daftarMahasiswa.size();i++){
            if(nim == daftarMahasiswa.get(i).getNim()){
                 daftarMahasiswa.remove(i);
            }
        }
    }
    public void deletePembimbing(long nip){
        for (int i=0;i<daftarPembimbing.size();i++){
            if(nip == daftarPembimbing.get(i).getNip()){
                 daftarPembimbing.remove(i);
            }
        }
    }
    
    
    //daftar geladi
   public void menu1(String firstNama, String lastNama, String jenisKelamin, String tanggalLahir, String telepon, String alamat, int ipk, long nim) throws ParseException{
       Mahasiswa m = new Mahasiswa(firstNama,lastNama,jenisKelamin, tanggalLahir, telepon,alamat,ipk,nim);
       daftarMahasiswa.add(m);
   }
   //pilih lokasi
   public Lokasi menu3(String lokasi){
       Lokasi des = null;
       for (int i = 0; i<daftarLokasi.size();i++){
           if (daftarLokasi.get(i).getLokasi() == lokasi){
               des = daftarLokasi.get(i);
           }

       }
       return des;
   }
   //pilih kelompok
   public void menu3(int idK,Mahasiswa m,Lokasi m3){
           for (int j = 0; j<m3.getKelompok().size();j++){
               if (idK == m3.getKelompok().get(j).getIdKelompok()){
                   m3.getKelompok().get(j).addAnggota(m);
               }
           }   
       
   }
   //tambah lokasi
   public void menu4(Lokasi l){
       daftarLokasi.add(l);
   }
   //hapus lokasi
   public void menu5(Lokasi l){
       daftarLokasi.remove(l);
   }
   //tambah kelompok
   public void menu6(Lokasi l,int idK){
       l.createKelompok(idK);
   }
   //tambah pembimbing
   public void menu7(String firstNama,String lastNama, String jenisKelamin,String tanggalLahir,String telepon,String alamat,long nip) throws ParseException{
       Pembimbing p = new Pembimbing(firstNama,lastNama,jenisKelamin,tanggalLahir,telepon,alamat,nip);
       addPembimbing(p);
   }
   //hapus pembimbing
   public void menu8(long nip){
       deletePembimbing(nip);
   }
   
   
   
   
   
   
}
