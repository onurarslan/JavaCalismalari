package Hafta02;

class StatikDegiskenler{
	public static String isim;
	public static String soyisim;
	
	private static String babaAdi;
	private static final int TC=1111111111;
	
	public StatikDegiskenler(String isim, String soyisim, String babaAdi){
		this.isim=isim;
		this.soyisim=soyisim;
		this.babaAdi=babaAdi;
	}
	
	public void doYazdir(){
		System.out.println("Ad: "+isim);
		System.out.println("Soyad: "+soyisim);
		System.out.println("Baba Adý: "+babaAdi);
		System.out.println("T.C : "+TC);
	}
	
}

public class Ornek20_DegiskenTipleri03 {

	public static void main(String[] args) {
		StatikDegiskenler degisken1=new StatikDegiskenler("Mert", "Can", "Mahmut");
		degisken1.doYazdir();
	}

}
