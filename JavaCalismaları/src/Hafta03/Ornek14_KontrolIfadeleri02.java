package Hafta03;

class DonguVeKontrol{
	public void ciftSayilar(){
		for (int i = 0; i < 10; i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}

public class Ornek14_KontrolIfadeleri02 {

	public static void main(String[] args) {
		DonguVeKontrol dongu1=new DonguVeKontrol();
		dongu1.ciftSayilar();

	}

}
