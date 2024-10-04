package veriyapilari_dosyaYazmaOkuma2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(DosyaOlusturma.dosya);
			while(scanner.hasNextLine()) {
				String satir = scanner.nextLine();
				System.out.print(satir);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya okunurken hata oluştu: " + e.getMessage());
		}
		
	}

}
