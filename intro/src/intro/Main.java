package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World ♥");
		
		// Degisken isimlendirmeleri java'da camelCase yazilir.
		String ortaMetin = " İlginizi çekebilir ";
		String altMetin = " Vade Süresi ";
	
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.5;
		double dolarBugun = 18.5;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarDun > dolarBugun ) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} 
		else if( dolarDun < dolarBugun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {" Hızlı Kredi ", " Maaşını Halkbanktan alanlar ", " Mutlu Emekli "}; 
		
		for(int i = 0 ; i < krediler.length; i++) {
			System.out.println(krediler [i]); 
		}
	}
}
