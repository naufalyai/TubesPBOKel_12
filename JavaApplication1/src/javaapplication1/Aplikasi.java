/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
    
    
    
}
