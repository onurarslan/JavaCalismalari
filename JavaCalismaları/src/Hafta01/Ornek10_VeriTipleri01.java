package Hafta01;

class VeriTabaniSec{
	String veriTabaniAdi;
	public void setVeriTabaniAdi(String veriTabaniAdi){
		this.veriTabaniAdi=veriTabaniAdi;
	}
	
	public String getVeriTabaniAdi(){
		return veriTabaniAdi;
	}
	
	public void doYazdir(){
		System.out.println("Veritabaný: "+veriTabaniAdi);
	}
	
}

public class Ornek10_VeriTipleri01 {

	public static void main(String[] args) {
		VeriTabaniSec veriTabani1=new VeriTabaniSec();
		
		veriTabani1.setVeriTabaniAdi("SQL Server");
		veriTabani1.doYazdir();
		
		
		
		veriTabani1.setVeriTabaniAdi("Oracle");
		veriTabani1.doYazdir();

	}

}
