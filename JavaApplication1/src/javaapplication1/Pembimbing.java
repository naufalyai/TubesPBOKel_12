/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Naufal Dzaky
 */
public class Pembimbing extends Orang {
    private long nip;
	public Pembimbing(String firstNama,String lastNama, String jenisKelamin,String tanggalLahir,String telepon,String alamat,long nip){
		super(firstNama,lastNama,jenisKelamin,tanggalLahir,telepon,alamat);
		this.nip = nip;
	}
	public void setNip(long nip){
		this.nip = nip;
	}
	public long getNip(){
		return nip;
	}
}