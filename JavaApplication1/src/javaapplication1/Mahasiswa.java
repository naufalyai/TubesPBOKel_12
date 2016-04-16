package javaapplication1;


import java.text.ParseException;
import java.util.Date;

public class Mahasiswa extends Orang{
	private int ipk;
	private long nim;
	
	public Mahasiswa ( String firstNama, String lastNama, String jenisKelamin, String tanggalLahir, String telepon, String alamat, int ipk, long nim) throws ParseException{
		super(firstNama,lastNama,jenisKelamin, tanggalLahir, telepon,alamat);
		this.ipk=ipk;
		this.nim=nim;
	}
        public Mahasiswa ( String firstNama, String lastNama, String jenisKelamin, Date tanggalLahir, String telepon, String alamat, int ipk, long nim) throws ParseException{
		super(firstNama,lastNama,jenisKelamin, tanggalLahir, telepon,alamat);
		this.ipk=ipk;
		this.nim=nim;
	}

	public void setIpk(int ipk){
		this.ipk=ipk;
	}
	
	public int getIpk(){
		return ipk;
	}
	
	public void setNim(long nim){
		this.nim=nim;
	}
	
	public long getNim(){
		return nim;
	}

    @Override
    public String toString() {
        return "Mahasiswa{" + "ipk=" + ipk + ", nim=" + nim + '}';
    }
        

}
