/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rannypa
 */
public abstract class Orang {
    private String firstNama;
        
	private String lastNama;
	private long id;
	private String jenisKelamin;
	private String tanggalLahir;
        private Date tgl;
	private String telepon;
	private String alamat;
	
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
	public Orang(String firstNama, String lastNama, String jenisKelamin, String tanggalLahir, String telepon, String alamat) throws ParseException{
		this.firstNama=firstNama;
                this.lastNama = lastNama;
		this.jenisKelamin=jenisKelamin;
		tgl=sdf.parse(tanggalLahir);
		this.telepon=telepon;
		this.alamat=alamat;
	}
	
	
	
	public void setFirstNama(String firstNama){
		this.firstNama=firstNama;
	}
	
	public String getFirstNama(){
		return firstNama;
	}
	
	public void setLastNama(String lastNama){
		this.lastNama=lastNama;
	}

	public String getLastNama(){
		return lastNama;
	}
	
	public void setJenisKelamin(String jenisKelamin){
		this.jenisKelamin=jenisKelamin;
	}
	
	public String getJenisKelamin(){
		return jenisKelamin;
	}
	
	public void setTanggalLahir(String tanggalLahir){
		this.tanggalLahir=tanggalLahir;
	}
	
	public String getTanggalLahir(){
		return tanggalLahir;
	}
	
	public void setTelepon(String telepon){
		this.telepon=telepon;
	}
	
	public String getTelepon(){
		return telepon;
	}
	
	public void setAlamat(String alamat){
		this.alamat=alamat;
	}
	
	public String getAlamat(){
		return alamat;
	}
        
}