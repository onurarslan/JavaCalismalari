package Hafta02;

class PrimitiveVeriTipleri6{
	double sayi;

	public double getSayi() {
		return sayi;
	}

	public void setSayi(double sayi) {
		this.sayi = sayi;
	}
}

public class Ornek13_VeriTipleri14 {

	public static void main(String[] args) {
		PrimitiveVeriTipleri6 tip1=new PrimitiveVeriTipleri6();
		tip1.setSayi(456456.457);
		System.out.println(tip1.getSayi());

	}

}
