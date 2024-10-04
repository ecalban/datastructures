package veriyapilari_dosyaYazmaOkuma2;

import java.io.File;
import java.io.IOException;

public class DosyaOlusturma {
    static File dosya = new File("dosya.txt");
	public static void main(String[] args) {
		try {
			if(dosya.createNewFile()) {
				System.out.println("Dosya oluşturuldu." + dosya.getName());
			}
			else {
				System.out.print("Dosya zaten mevcut");
			}
		} catch (IOException e) {
			System.out.print("Dosya oluşturulurken bir hata oluştu: " + e.getMessage());
		}
	}

}
