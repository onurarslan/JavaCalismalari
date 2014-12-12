package Hafta02;

class Cinsiyet{
	boolean cinsiyet;

	public boolean isCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(boolean cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
}

public class Ornek15_VeriTipleri16 {

	public static void main(String[] args) {
		Cinsiyet cinsiyet1=new Cinsiyet();
		cinsiyet1.setCinsiyet(false);
		System.out.println("Bayan Mı?"+cinsiyet1.isCinsiyet());

	}

}
