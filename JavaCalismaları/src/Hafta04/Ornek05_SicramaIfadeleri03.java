package Hafta04;

public class Ornek05_SicramaIfadeleri03 {

	public static void main(String[] args) {
		boolean t=true;
		bir:{
			System.out.println("birinci blok");
			iki:{
				System.out.println("ikinci blok");
				uc: {
					if(t) break iki;
					System.out.println("Üçüncü blok");
				}
			}
			System.out.println("Çýktý mý");
		}

	}

}
