/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 *
 * @author Naufal Dzaky
 */
public class Aplikasi {
    private ArrayList<Pembimbing> daftarPembimbing;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<Lokasi> daftarLokasi;
    
    public void buatDaftar(){
        daftarPembimbing = new ArrayList<>();
        daftarMahasiswa = new ArrayList<>();
        daftarLokasi = new ArrayList<>();
    }
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
   public Lokasi menu2(String lokasi){
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
   //hapus kelompok
   public void menu7(Lokasi l, int idK){
    int no;
    for (int i = 0;i<l.getKelompok().size();i++){
        if (idK == l.getKelompok().get(i).getIdKelompok()){
            l.deleteKelompok(l.getKelompok().get(i));
        }
    }
   }
   //tambah pembimbing
   public void menu8(String firstNama,String lastNama, String jenisKelamin,String tanggalLahir,String telepon,String alamat,long nip) throws ParseException{
       Pembimbing p = new Pembimbing(firstNama,lastNama,jenisKelamin,tanggalLahir,telepon,alamat,nip);
       addPembimbing(p);
   }
   //hapus pembimbing
   public void menu9(long nip){
       deletePembimbing(nip);
   }
   
   //main menu
   public void mainmenu() throws ParseException{
       int plh = 1;
       int pil;
       int ll = 0;
       buatDaftar();
       Scanner pilih = new Scanner(System.in); 
       while (plh != 0) {
           System.out.println("=========Menu========");
           System.out.println("1. Daftar Geladi");
           System.out.println("2. Pilih Lokasi");
           System.out.println("3. Pilih Kelompok");
           System.out.println("4. Tambah Lokasi");
           System.out.println("5. Hapus Lokasi");
           System.out.println("6. Tambah Kelompok");
           System.out.println("7. Hapus Kelompok");
           System.out.println("8. Tambah Pembimbing");
           System.out.println("9. Hapus Pembimbing");
           System.out.println("0. Keluar");
           System.out.print("Pilih : ");
           pil = pilih.nextInt();
           switch (pil){
               case 1: 
                   String namaDepan,namaBelakang,alamat,tanggalLahir,telp,jenisK;
                   int nim,ipk;
                   System.out.println("Daftar Geladi");
                   System.out.print("Masukkan Nama Depan: ");
                   namaDepan = pilih.nextLine();
                   namaDepan = pilih.nextLine();
                   System.out.print("Masukkan Nama Belakang: ");
                   namaBelakang = pilih.nextLine();
                   namaBelakang = pilih.nextLine();
                   System.out.print("Masukkan Jenis Kelamin: ");
                   jenisK = pilih.nextLine();
                   jenisK = pilih.nextLine();
                   System.out.print("Masukkan Tanggal Lahir: ");
                   tanggalLahir = pilih.nextLine();
                   System.out.print("Masukkan Telepon: ");
                   telp = pilih.nextLine();
                   telp = pilih.nextLine();
                   System.out.print("Masukkan Alamat: ");
                   alamat = pilih.nextLine();
                   alamat = pilih.nextLine();
                   System.out.print("Masukkan IPK: ");
                   ipk = pilih.nextInt();
                   System.out.print("Masukkan NIM: ");
                   nim = pilih.nextInt();
                   menu1(namaDepan,namaBelakang,jenisK,tanggalLahir,telp,alamat,ipk,nim);
                   System.out.println("Pendaftaran Selesai");
                   break;
                case 2:
                   System.out.println("Menu Pilih Lokasi");
                   for(int i=0;i<daftarLokasi.size();i++){
                       System.out.println(i+". "+daftarLokasi.get(i).getLokasi());
                   }
                   System.out.print("Pilih Lokasi: ");
                   ll = pilih.nextInt();
                   menu2(daftarLokasi.get(ll).getLokasi());
                   System.out.println("Lokasi Terpilih");
                   break;
                case 3:
                   System.out.println("Menu Pilih Kelompok");
                   for(int i = 0;i<daftarLokasi.get(ll).getKelompok().size();i++){
                       System.out.println(i+". "+daftarLokasi.get(ll).getKelompok().get(i).getIdKelompok());
                   
                   }
                   System.out.print("Masukkan ID Kelompok Pilihan: ");
                   int kel = pilih.nextInt();
                   System.out.print("Masukkan NIM anda: ");
                   long ni = pilih.nextLong();
                   Mahasiswa mhs = getMahasiswa(ni);
                   menu3(kel,mhs,daftarLokasi.get(ll));
                   System.out.println("Anda Telah Masuk Sebagai Anggota Kelompok dengan ID "+kel+" dan Lokasi "+daftarLokasi.get(ll).getLokasi());
                   break;
                case 4:
                   System.out.println("Menu Tambah Lokasi"); 
                   System.out.print("Masukkan Nama Lokasi: ");
                   String nL = pilih.next();
                   System.out.print("Masukkan Nomor Lokasi: ");
                   int nolok = pilih.nextInt();
                   Lokasi l = new Lokasi(nolok,nL);
                   menu4(l);
                   System.out.println("Lokasi telah ditambah");
                   break;
                case 5:
                   System.out.println("Hapus Lokasi");
                   for(int i=0;i<daftarLokasi.size();i++){
                       System.out.println(i+". "+daftarLokasi.get(i).getLokasi());
                   }
                   System.out.print("Pilih Lokasi yang akan dihapus: ");
                   int kk = pilih.nextInt();
                   menu5(daftarLokasi.get(kk));
                   System.out.print("Lokasi telah dihapus");
                   break;
                case 6:
              
                   for(int i=0;i<daftarLokasi.size();i++){
                       System.out.println(i+". "+daftarLokasi.get(i).getLokasi());
                   }
                   System.out.print("Pilih Lokasi : ");
                   int no = pilih.nextInt();
                   for(int i = 0;i<daftarLokasi.get(no).getKelompok().size();i++){
                       System.out.println(i+". "+daftarLokasi.get(ll).getKelompok().get(i).getIdKelompok());
                   
                   }
                   System.out.print("Masukkan ID Kelompok : ");
                   int id = pilih.nextInt();
                   menu6(daftarLokasi.get(no),id);
                   System.out.println("Kelompok telah ditambahkan");
                   break;
                case 7:
                   for(int i=0;i<daftarLokasi.size();i++){
                       System.out.println(i+". "+daftarLokasi.get(i).getLokasi());
                   }
                   System.out.print("Pilih Lokasi: ");
                   int pL = pilih.nextInt();
                   for(int i = 0;i<daftarLokasi.get(pL).getKelompok().size();i++){
                       System.out.println(i+". "+daftarLokasi.get(pL).getKelompok().get(i).getIdKelompok());
                   }
                   System.out.print("Pilih ID Kelompok yang dihapus: ");
                   int idh = pilih.nextInt();
                   menu7(daftarLokasi.get(pL),idh);
                   System.out.println("Kelompok telah dihapus");
                case 8:
                    System.out.print("Masukkan Nama Depan: ");
                   String nDepan = pilih.nextLine();
                   nDepan = pilih.nextLine();
                   System.out.print("Masukkan Nama Belakang: ");
                   String nBelakang = pilih.nextLine();
                   nBelakang = pilih.nextLine();
                   System.out.print("Masukkan Jenis Kelamin: ");
                   String jK = pilih.nextLine();
                   jK = pilih.nextLine();
                   System.out.print("Masukkan Tanggal Lahir: ");
                   String tLahir = pilih.nextLine();
                   tLahir = pilih.nextLine();
                   System.out.print("Masukkan Telepon: ");
                   String tlp = pilih.nextLine();
                   tlp = pilih.nextLine();
                   System.out.print("Masukkan Alamat: ");
                   String almt = pilih.nextLine();
                   almt = pilih.nextLine();
                   System.out.print("Masukkan NIP: ");
                   int nip = pilih.nextInt();
                   menu8(nDepan,nBelakang,jK,tLahir,tlp,almt,nip);
                 
                   
                   
                    
                   
                
           
       }
       
       
    }   
}
