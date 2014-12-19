package Hafta03;

class Sira{
	int sayi1, sayi2;

	public int getSayi1() {
		return sayi1;
	}

	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}

	public int getSayi2() {
		return sayi2;
	}

	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}
	
	public void doOrtancaSayi(){
		while(++sayi1<--sayi2);
		System.out.println("Ortanca Sayı: "+sayi1);
	}
	
	public void doSay(){
		int sayac=1;
		while (getSayi1()<getSayi2()) {
			//System.out.println(sayac++);
			sayac++;
			sayi1++;
			
		}
		System.out.println("Toplam "+sayac+" adet sayıldı.");
	}
	
}

public class Ornek06_Donguler02 {

	public static void main(String[] args) {
		Sira sira1=new Sira();
		sira1.setSayi1(5);
		sira1.setSayi2(9);
		sira1.doOrtancaSayi();
		
		Sira sira2=new Sira();
		sira2.setSayi1(5);
		sira2.setSayi2(9);
		sira2.doSay();

	}

}
