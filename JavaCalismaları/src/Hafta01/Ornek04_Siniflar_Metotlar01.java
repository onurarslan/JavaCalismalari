package Hafta01;

class IlkMesaj{
	public void doMesaj(){
		System.out.println("Bu metot ile ekrana mesaj yazdýrýyoruz.");
	}
}

public class Ornek04_Siniflar_Metotlar01 {

	public static void main(String[] args) {
		IlkMesaj mesaj1=new IlkMesaj();
		mesaj1.doMesaj();
		
		IlkMesaj mesaj2=new IlkMesaj();
		mesaj2.doMesaj();
	}

}
