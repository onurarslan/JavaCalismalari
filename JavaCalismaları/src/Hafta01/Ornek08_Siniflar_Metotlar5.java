package Hafta01;

class KareAl{
	int sayi;
	public void setSayi(int sayi){
		this.sayi=sayi;
	}
	
	public int getSayi(){
		return sayi;
	}
	
	public int doHesapla(){
		return sayi*sayi;
	}
	
	public void doYazdir(){
		int sonuc=doHesapla();
		System.out.println("Girdiðiniz Sayý: "+getSayi());
		System.out.println("Alan: "+sonuc);
	}
	
}

public class Ornek08_Siniflar_Metotlar5 {

	public static void main(String[] args) {
		KareAl kare1=new KareAl();
		kare1.setSayi(4);
		kare1.doYazdir();

	}

}
