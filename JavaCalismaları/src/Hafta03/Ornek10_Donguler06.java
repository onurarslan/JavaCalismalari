package Hafta03;

class IkiDongu{
	public void doBaslast(){
		for (int i = 0, j=10; i < 10 && j>0; i++,j--) {
			System.out.print("i: "+i);
			System.out.println("j: "+j);
		}
	}
}

public class Ornek10_Donguler06 {

	public static void main(String[] args) {
		IkiDongu dongu1=new IkiDongu();
		dongu1.doBaslast();

	}

}
