package Hafta02;

import java.util.Scanner;

//kullan�c�dan 2 say� al
//say�n�n get ve set metotlar�n� olu�tur
//say�lar�n 4 i�lem metotlar�n� olu�tur
//sonu�lar� yazd�r metotu ile ekrana yazd�r
//t�rk�e karakter ve b�y�k k���k uyumlar�na dikkat
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
		System.out.println("��lemin sonucu: " + sonuc);
	}
}

public class Ornek01_Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DortIslem0 Toplat = new DortIslem0();
		System.out.println("�lk say�y� giriniz.");
		Scanner input1 = new Scanner(System.in);
		
		double a = input1.nextDouble();
		System.out.println("�kinci say�y� giriniz.");
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
