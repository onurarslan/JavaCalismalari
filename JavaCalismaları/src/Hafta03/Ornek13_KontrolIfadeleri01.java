package Hafta03;

class HavaDurumu{
	int sicaklik;
	public int getSicaklik() {
		return sicaklik;
	}
	public void setSicaklik(int sicaklik) {
		this.sicaklik = sicaklik;
	}
	
	public void doMesaj(){
		if(getSicaklik()>35){
			System.out.println("Çok dikkat edin");
		}
		else if(getSicaklik()<0) System.out.println("Çok soðuk");
		
		else
			System.out.println("Normal");
	}
}

public class Ornek13_KontrolIfadeleri01 {

	public static void main(String[] args) {
		HavaDurumu hava1=new HavaDurumu();
		hava1.setSicaklik(3);
		hava1.doMesaj();

	}

}
