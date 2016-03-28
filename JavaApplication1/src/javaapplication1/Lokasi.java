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
    
    public Lokasi(int nomorKelompok, String lokasi,Pembimbing p) {
        this.nomorKelompok = nomorKelompok;
        this.lokasi = lokasi;
        kelompok= new ArrayList();
        this.pembimbing = pembimbing;
    }
    
    

    public void setPembimbing(Pembimbing p) {
        pembimbing=p;
    }
    
    public void createKelompok(int idK){
        Kelompok n = new Kelompok(idK);
        kelompok.add(n);
    }
    
    public void deleteKelompok(Kelompok n){
        kelompok.remove(n);
    }

    public ArrayList<Kelompok> getKelompok() {
        return kelompok;
    }

    public void setKelompok(ArrayList<Kelompok> kelompok) {
        this.kelompok = kelompok;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public Pembimbing getPembimbing() {
        return pembimbing;
    }
    
}
