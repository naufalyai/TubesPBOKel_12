/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Naufal Dzaky
 */
public class Kelompok {
    private int idKelompok;
    private ArrayList<Mahasiswa> anggota;

    public Kelompok(int idKelompok) {
        this.idKelompok = idKelompok;
        anggota = new ArrayList();
    }

    public void setIdKelompok(int idKelompok) {
        this.idKelompok = idKelompok;
    }

    public int getIdKelompok() {
        return idKelompok;
    }
    public void addAnggota(Mahasiswa m){
        anggota.add(m);
    }
    public void deleteAnggota(Mahasiswa m){
        anggota.remove(m);
    }
}
