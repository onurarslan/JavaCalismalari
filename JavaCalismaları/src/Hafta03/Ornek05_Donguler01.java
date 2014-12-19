package Hafta03;

class Ogrenci{
	public void doSay(int sayi){
		while (sayi>0) {
			System.out.println(sayi--);
		}
			
	}
}

public class Ornek05_Donguler01 {

	public static void main(String[] args) {
		Ogrenci ogrenci1=new Ogrenci();
		ogrenci1.doSay(5);

	}

}
