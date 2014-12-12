package Hafta02;

class PrimitiveVeriTipleri4{
	long sayi;

	public long getSayi() {
		return sayi;
	}

	public void setSayi(long sayi) {
		this.sayi = sayi;
	}
}

public class Ornek09_VeriTipleri10 {

	public static void main(String[] args) {
		PrimitiveVeriTipleri4 tip1=new PrimitiveVeriTipleri4();
		tip1.setSayi(4564554668L);
		System.out.println(tip1.getSayi());
		
	}

}
