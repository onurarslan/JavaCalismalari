package Hafta03;

class SoruIsaretiOperatoru{
	int sayi;

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	
	
	public String ifThenElse(){
		return sayi>0 ? "Büyük" : "Küçük";
	}
	public void doYazdir(){
		System.out.println(ifThenElse());
	}
}

public class Ornek03_Operatorler04 {

	public static void main(String[] args) {
		SoruIsaretiOperatoru soru1=new SoruIsaretiOperatoru();
		soru1.setSayi(41);
		soru1.doYazdir();
		

	}

}
