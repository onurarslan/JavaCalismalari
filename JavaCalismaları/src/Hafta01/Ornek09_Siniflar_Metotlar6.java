package Hafta01;

class UcgeninCevresi{
	int sonuc;
	public int cevreHesapla(int kenar){
		sonuc=kenar+kenar+kenar;
		return sonuc;
	}
	public int cevreHesapla(int kenar1, int kenar2){
		sonuc=kenar1+kenar1+kenar2;
		return sonuc;
	}
	
	public int cevreHesapla(int kenar1, int kenar2, int kenar3){
		sonuc=kenar1+kenar2+kenar3;
		return sonuc;
	}
	
	
	public void getSonuc(){
		System.out.println("Üçgenin Çevresi: "+sonuc);
	}
}

public class Ornek09_Siniflar_Metotlar6 {

	public static void main(String[] args) {
		UcgeninCevresi cevre1=new UcgeninCevresi();
		
		cevre1.cevreHesapla(10);
		cevre1.getSonuc();
		
		cevre1.cevreHesapla(10,20,30);
		cevre1.getSonuc();
		
		cevre1.cevreHesapla(20, 30);
		cevre1.getSonuc();

	}

}
