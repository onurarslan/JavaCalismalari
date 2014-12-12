package Hafta02;

class PrimitiveVeriTipleri3{
	int sayi;

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
}

public class Ornek07_VeriTipleri08 {

	public static void main(String[] args) {
		PrimitiveVeriTipleri3 tip1=new PrimitiveVeriTipleri3();
		tip1.setSayi(5344534);
		System.out.println("Integer Tipindeki Sayý: "+tip1.getSayi());

	}

}
