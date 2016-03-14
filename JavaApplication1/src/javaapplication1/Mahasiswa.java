public class Mahasiswa extends Orang{
	private int ipk;
	private long nim;
	
	public Mahasiswa ( String firstNama, String lastNama, String jenisKelamin, String tanggalLahir, String telepon, String alamat, int ipk, long nim){
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


	public void display(){
		System.out.println("Nama :"+super.getFirstNama());
		System.out.println("Nama Akhir :"+super.getLastNama());
		System.out.println("Jenis Kelamin :"+super.getJenisKelamin());
		System.out.println("Tanggal Lahir :"+super.getTanggalLahir());
		System.out.println("No Telepon : "+super.getTelepon());
		System.out.println("Alamat : "+super.getAlamat());
		System.out.println("NIM : "+getNim());
		System.out.println("IPK : "+getIpk());
	}
}
