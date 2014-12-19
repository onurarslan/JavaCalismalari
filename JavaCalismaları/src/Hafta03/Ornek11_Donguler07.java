package Hafta03;

class Sayilar{
	int[] sayilar={2,56,7,6,98,10,564};
	public void doYazdir(){
		for (int i = 0; i < sayilar.length; i++) {
			System.out.print(sayilar[i]+" ");
		}
	}
}

public class Ornek11_Donguler07 {

	public static void main(String[] args) {
		Sayilar sayilar1=new Sayilar();
		sayilar1.doYazdir();

	}

}
