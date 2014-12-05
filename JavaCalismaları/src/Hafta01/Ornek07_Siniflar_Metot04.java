package Hafta01;

class DortIslem5{
	int sayi;
	public void setSayi(int sayi){
		this.sayi=sayi;
	}
	
	public int getSayi(){
		return sayi;
	}
}

public class Ornek07_Siniflar_Metot04 {

	public static void main(String[] args) {
		DortIslem5 dortIslem1=new DortIslem5();
		dortIslem1.setSayi(50);
		
		int sayi=dortIslem1.getSayi();
		
		System.out.println("Girdiðiniz Sayý:"+sayi);

	}

}
