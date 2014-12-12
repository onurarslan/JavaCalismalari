package Hafta02;

class Alfabe{
	char karakter;

	public char getKarakter() {
		return karakter;
	}

	public void setKarakter(char karakter) {
		this.karakter = karakter;
	}
	
}

public class Ornek17_VeriTipleri18 {

	public static void main(String[] args) {
		Alfabe harf1=new Alfabe();
		harf1.setKarakter('F');
		System.out.println("Harf1: "+harf1.getKarakter());
		
		Alfabe harf2=new Alfabe();
		harf2.setKarakter((char)71);
		System.out.println("Harf2: "+harf2.getKarakter());
		
		

	}

}
