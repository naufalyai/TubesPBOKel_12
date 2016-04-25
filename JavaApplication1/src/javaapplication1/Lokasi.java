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
    private int nomorLokasi;

    public Lokasi() {
    }
    
    
    public Lokasi(int nomorLokasi) {
        this.nomorLokasi = nomorLokasi;
        kelompok= new ArrayList();
    }

    public Lokasi(int nomorLokasi, String lokasi) {
        this.nomorLokasi = nomorLokasi;
        this.lokasi = lokasi;
        kelompok= new ArrayList();
    }
    
    public Lokasi(int nomorLokasi, String lokasi,Pembimbing p) {
        this.nomorLokasi = nomorLokasi;
        this.lokasi = lokasi;
        kelompok= new ArrayList();
        this.pembimbing = pembimbing;
    }

    public int getNomorLokasi() {
        return nomorLokasi;
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

    @Override
    public String toString() {
        return "Lokasi{" + "pembimbing=" + pembimbing + ", kelompok=" + kelompok + ", lokasi=" + lokasi + ", nomorLokasi=" + nomorLokasi + '}';
    }
    
}
