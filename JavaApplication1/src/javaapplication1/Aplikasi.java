/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import database.Database;
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
    private Database con;
    public Aplikasi(){
        daftarPembimbing = new ArrayList<>();
        daftarMahasiswa = new ArrayList<>();
        daftarLokasi = new ArrayList<>();
        con = new Database();
        con.connect();
    }
    public void addPembimbing(Pembimbing p){
        daftarPembimbing.add(p);
    }
    public void addMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
        con.saveMahasiswa(m);
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
       try{
           Mahasiswa m = new Mahasiswa(firstNama,lastNama,jenisKelamin, tanggalLahir, telepon,alamat,ipk,nim);
           daftarMahasiswa.add(m);
       } catch(Exception e){
           System.out.println("Error");
       }
       
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
           System.out.println("10. Lihat Lokasi dan Kelompok");
           System.out.println("0. Keluar");
           System.out.print("Pilih : ");
           pil = pilih.nextInt();
           switch (pil){
               case 1: 
                   String namaDepan,namaBelakang,alamat,tanggalLahir,telp,jenisK;
                   int nim,ipk;
                   System.out.println("Daftar Geladi");
                   System.out.print("Masukkan Nama Depan: ");
                   namaDepan = pilih.next();
                   System.out.print("Masukkan Nama Belakang: ");
                   namaBelakang = pilih.next();
                   System.out.print("Masukkan Jenis Kelamin: ");
                   jenisK = pilih.next();
                   System.out.print("Masukkan Tanggal Lahir: ");
                   tanggalLahir = pilih.next();
                   System.out.print("Masukkan Telepon: ");
                   telp = pilih.next();
                   System.out.print("Masukkan Alamat: ");
                   pilih.nextLine();
                   alamat = pilih.nextLine();
                   System.out.print("Masukkan IPK: ");
                   ipk = pilih.nextInt();
                   System.out.print("Masukkan NIM: ");
                   nim = pilih.nextInt();
                   menu1(namaDepan,namaBelakang,jenisK,tanggalLahir,telp,alamat,ipk,nim);
                   System.out.println("Pendaftaran Selesai");
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
                   break;
                case 2:
                   System.out.println("Menu Pilih Lokasi");
                   try{
                       for(int i=0;i<daftarLokasi.size();i++){
                           System.out.println(i+". "+daftarLokasi.get(i).getLokasi());
                       }
                       System.out.print("Pilih Lokasi: ");
                       ll = pilih.nextInt();
                       menu2(daftarLokasi.get(ll).getLokasi());
                       System.out.println("Lokasi Terpilih");
                   } catch(Exception e){
                       System.out.println("Belum Ada Lokasi");
                   }
                    System.out.println("Press 'y' to back to home");
                    pilih.next();
                   break;
                case 3:
                   System.out.println("Menu Pilih Kelompok");
                   try{
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
                   } catch(Exception e){
                       System.out.println("Tidak Ditemukan Kelompok");
                   }
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
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
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
                   break;
                case 5:
                   System.out.println("Hapus Lokasi");
                   try{
                       for(int i=0;i<daftarLokasi.size();i++){
                           System.out.println(i+". "+daftarLokasi.get(i).getLokasi());
                       }
                       System.out.print("Pilih Lokasi yang akan dihapus: ");
                       int kk = pilih.nextInt();
                       menu5(daftarLokasi.get(kk));
                       System.out.print("Lokasi telah dihapus");
                   } catch(Exception e){
                       System.out.println("Tidak Ditemukan Lokasi");
                   }
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
                   break;
                case 6:
                   try{
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
                   } catch(Exception e){
                       System.out.println("Data Tidak Ditemukan");
                   }
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
                   break;
                case 7:
                   try{
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
                   } catch(Exception e){
                       System.out.println("Data Tidak Ditemukan");
                   }
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
                   break;
                case 8:
                    System.out.print("Masukkan Nama Depan: ");
                   String nDepan = pilih.next();
                   System.out.print("Masukkan Nama Belakang: ");
                   String nBelakang = pilih.next();
                   System.out.print("Masukkan Jenis Kelamin: ");
                   String jK = pilih.next();
                   System.out.print("Masukkan Tanggal Lahir: ");
                   String tLahir = pilih.next();
                   System.out.print("Masukkan Telepon: ");
                   String tlp = pilih.next();
                   System.out.print("Masukkan Alamat: ");
                   pilih.nextLine();
                   String almt = pilih.nextLine();
                   System.out.print("Masukkan NIP: ");
                   int nip = pilih.nextInt();
                   menu8(nDepan,nBelakang,jK,tLahir,tlp,almt,nip);
                   System.out.println("Press 'y' to back to home");
                   pilih.next();
                   break;
                case 9:
                    try{
                        for(int i = 0; i<daftarPembimbing.size();i++){
                            System.out.println(i+" "+daftarPembimbing.get(i).getFirstNama()+" "+daftarPembimbing.get(i).getLastNama());
                            System.out.println("NIP : "+daftarPembimbing.get(i).getNip());
                        }
                        System.out.print("Pilih Pembimbing: ");
                        long llk = pilih.nextLong();
                        menu9(llk);
                    } catch(Exception e){
                        System.out.println("Data Tidak Ditemukan");
                    }
                    System.out.println("Press 'y' to back to home");
                    pilih.next();
                    break;
                case 10:
                    try{
                        for (int i = 0; i<daftarLokasi.size();i++){
                            System.out.println(i+" Lokasi: "+daftarLokasi.get(i).getLokasi());
                        }
                        System.out.print("Pilih Lokasi: ");
                        int hh = pilih.nextInt();
                        for (int y = 0; y<daftarLokasi.get(hh).getKelompok().size();y++){
                            System.out.println("* "+daftarLokasi.get(hh).getKelompok().get(y).getIdKelompok());
                        }
                        System.out.print("Pilih Kelompok: ");
                        int jj = pilih.nextInt();
                        for (int x = 0; x<daftarLokasi.get(hh).getKelompok().get(jj).getAnggota().size();x++){
                            System.out.println("* "+daftarLokasi.get(hh).getKelompok().get(jj).getAnggota().get(x).getFirstNama()+" "+daftarLokasi.get(hh).getKelompok().get(jj).getAnggota().get(x).getLastNama());
                        }
                        pilih.nextLine();
                        
                    } catch(Exception e){
                        System.out.println("Data Tidak Ditemukan");
                    }
                    System.out.println("Press 'y' to back to home");
                    pilih.next();    
                    break;
                case 0: plh = 0; break;
                default: plh = 1; break;
                    
                   
                   
                    
                   
                
           
       }
       
       
    }   
}
}