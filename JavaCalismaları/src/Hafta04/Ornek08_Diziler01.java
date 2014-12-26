package Hafta04;

class Aylar2{
	String[] aylar={"Ocak","Þubat","Mart","Nisan","Mayýs","Haziran","Temmuz","Aðustos","Eylül","Ekim","Kasým","Aralýk"};
	int[] gun=new int[12];
	
	public void doAyEkle(){
		for (int i = 0; i < gun.length; i++) {
			gun[i]=i+1;
		}
	}
	
	public void doYazdir(){
		for (int i = 0; i < gun.length; i++) {
			System.out.println(gun[i] + ". " + aylar[i]);
		}
	}
}

public class Ornek08_Diziler01 {

	public static void main(String[] args) {
		Aylar2 aylar=new Aylar2();
		aylar.doAyEkle();
		aylar.doYazdir();

	}

}
