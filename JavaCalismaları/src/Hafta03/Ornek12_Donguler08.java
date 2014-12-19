package Hafta03;

class Meyveler{
	public void doYazdir(){
		String[] meyveler={"Elma","Armut","Kiraz","Karpuz","Muz"};
		for(String meyve : meyveler){
			System.out.println(meyve);
		}
		int[] sayilar={2,48,68,48,111,123,41};
		for(int sayi:sayilar){
			System.out.print(sayi+" ");
		}
	}
}

public class Ornek12_Donguler08 {

	public static void main(String[] args) {
		Meyveler meyve1=new Meyveler();
		meyve1.doYazdir();

	}

}
