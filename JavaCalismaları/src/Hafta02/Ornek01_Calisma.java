package Hafta02;

import java.util.Scanner;

//kullanýcýdan 2 sayý al
//sayýnýn get ve set metotlarýný oluþtur
//sayýlarýn 4 iþlem metotlarýný oluþtur
//sonuçlarý yazdýr metotu ile ekrana yazdýr
//türkçe karakter ve büyük küçük uyumlarýna dikkat
class DortIslem0{
	double a,b;
	double sonuc;
	public void setSayi(double a,double b){
		this.a=a;
		this.b=b;
		
		
	}
	public double Toplama(double a, double b){
		sonuc=a+b;
		return sonuc;
	}
	public double Cikarma(double a,double b){
		sonuc = a-b;
		return sonuc;
	}
	public double Carpma(double a,double b){
		sonuc = a*b;
		return sonuc;
	}
	public double Bolme(double a,double b)
	{
		sonuc = a/b;
		return sonuc;
	}
	public void getSonuc(){
		System.out.println("Ýþlemin sonucu: "+sonuc);
	}
}
public class Ornek01_Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DortIslem0 Toplat=new DortIslem0();
System.out.println("Ýlk sayýyý giriniz.");
Scanner input1=new Scanner(System.in);
double a=input1.nextDouble();
System.out.println("Ýkinci sayýyý giriniz.");
double b=input1.nextDouble();

Toplat.Toplama(a,b);
Toplat.getSonuc();
Toplat.Cikarma(a, b);
Toplat.getSonuc();
Toplat.Carpma(a, b);
Toplat.getSonuc();
Toplat.Bolme(a, b);
Toplat.getSonuc();
	}

}
