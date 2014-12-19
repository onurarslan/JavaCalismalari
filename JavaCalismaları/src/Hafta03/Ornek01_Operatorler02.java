package Hafta03;

class IliskiselOperatorler{
	boolean sonuc;
	
	public boolean isEsit(int sayi1, int sayi2){
		return sonuc=sayi1==sayi2;
	}
	
	public boolean isEsitDegil(int sayi1, int sayi2){
		return sonuc=sayi1!=sayi2;
	}
	
	public boolean isBuyuk(int sayi1, int sayi2){
		return sonuc=sayi1>sayi2;
	}
	
	public boolean isKucuk(int sayi1, int sayi2){
		return sonuc=sayi1<sayi2;
	}
	
	public boolean  isBuyukVeyaEsit(int sayi1, int sayi2){
		return sonuc=sayi1>=sayi2;
	}
	
	public boolean isKucukVeyaEsit(int sayi1, int sayi2){
		return sonuc=sayi1<=sayi2;
	}
	
	public void doYazdir(){
		System.out.println("Sonuc: "+sonuc);
	}
}

public class Ornek01_Operatorler02 {

	public static void main(String[] args) {
		IliskiselOperatorler operator1=new IliskiselOperatorler();
		
		operator1.isEsit(5, 5);	operator1.doYazdir();
		operator1.isEsit(5, 7); operator1.doYazdir();
		
		operator1.isEsitDegil(5, 7);operator1.doYazdir();
		operator1.isEsitDegil(5, 5); operator1.doYazdir();
		
		operator1.isBuyuk(7, 5); operator1.doYazdir();
		operator1.isBuyuk(1, 3); operator1.doYazdir();
		
		operator1.isKucuk(5, 7); operator1.doYazdir();
		operator1.isKucuk(7, 5); operator1.doYazdir();
		
		operator1.isBuyukVeyaEsit(5, 5); operator1.doYazdir();
		operator1.isKucukVeyaEsit(3, 2); operator1.doYazdir();

	}

}
