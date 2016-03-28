/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 *
 * @author rannypa
 */
public class Lokasi {
    private Pembimbing pembimbing;
    private ArrayList<Kelompok> kelompok;
    private String lokasi;
    public int nomorKelompok;

    public Lokasi(int nomorKelompok) {
        this.nomorKelompok = nomorKelompok;
        kelompok= new ArrayList();
    }

    public Lokasi(int nomorKelompok, String lokasi) {
        this.nomorKelompok = nomorKelompok;
        this.lokasi = lokasi;
        kelompok= new ArrayList();
    }
    

    public void setPembimbing(Pembimbing p) {
        pembimbing=p;
    }
    
    public void createKelompok(){
        Kelompok n = new Kelompok();
        kelompok.add(n);
    }
    
    public void deleteKelompok(Kelompok n){
        kelompok.remove(n);
    }
}
