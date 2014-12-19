package Hafta02;

import java.util.Scanner;

//kullanýcýdan 2 sayý al
//sayýnýn get ve set metotlarýný oluþtur
//sayýlarýn 4 iþlem metotlarýný oluþtur
//sonuçlarý yazdýr metotu ile ekrana yazdýr
//türkçe karakter ve büyük küçük uyumlarýna dikkat
class DortIslem0 {
	double a, b;
	double sonuc;

	public void setSayi(double a, double b) {
		this.a = a;
		this.b = b;

	}

	public double Toplama() {
		sonuc = a + b;
		return sonuc;
	}

	public double Cikarma() {
		sonuc = a - b;
		return sonuc;
	}

	public double Carpma() {
		sonuc = a * b;
		return sonuc;
	}

	public double Bolme() {
		sonuc = a / b;
		return sonuc;
	}

	public void getSonuc() {
		System.out.println("Ýþlemin sonucu: " + sonuc);
	}
}

public class Ornek01_Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DortIslem0 Toplat = new DortIslem0();
		System.out.println("Ýlk sayýyý giriniz.");
		Scanner input1 = new Scanner(System.in);
		
		double a = input1.nextDouble();
		System.out.println("Ýkinci sayýyý giriniz.");
		double b = input1.nextDouble();
		
		Toplat.setSayi(a, b);
		
		Toplat.Toplama();
		Toplat.getSonuc();
		
		Toplat.Cikarma();
		Toplat.getSonuc();
		
		Toplat.Carpma();
		Toplat.getSonuc();
		
		Toplat.Bolme();
		Toplat.getSonuc();
	}

}
