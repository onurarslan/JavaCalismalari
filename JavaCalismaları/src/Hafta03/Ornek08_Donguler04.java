package Hafta03;

import java.io.IOException;

class Menu{
	char secenek;
	public void anaMenu() throws IOException{
		do{
			System.out.println("1. Havale Ýþlemleri");
			System.out.println("2. GSM TL Yükleme");
			System.out.println("3. Þifre Ýþlemleri");
			System.out.print("Ýþlem Seçiniz: ");
			secenek=(char)System.in.read();
		}while(secenek<'1' || secenek>'3');
	}
}

public class Ornek08_Donguler04 {

	public static void main(String[] args) throws IOException {
		Menu menu1=new Menu();
		menu1.anaMenu();

	}

}
