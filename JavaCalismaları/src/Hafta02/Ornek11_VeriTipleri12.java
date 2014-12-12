package Hafta02;

class PrimitiveVeriTipleri5{
	float sayi;

	public float getSayi() {
		return sayi;
	}

	public void setSayi(float sayi) {
		this.sayi = sayi;
	}
}

public class Ornek11_VeriTipleri12 {

	public static void main(String[] args) {
		PrimitiveVeriTipleri5 tip1=new PrimitiveVeriTipleri5();
		tip1.setSayi(54546.05f);
		System.out.println(tip1.getSayi());

	}

}
