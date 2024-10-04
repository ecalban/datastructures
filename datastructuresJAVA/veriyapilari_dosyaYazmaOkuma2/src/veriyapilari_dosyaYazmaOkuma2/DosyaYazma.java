package veriyapilari_dosyaYazmaOkuma2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaYazma {
	static String yazilacakMetin = "Bu bir deneme metni";
	public static void main(String[] args) {
		
		try {
			FileWriter filewriter = new FileWriter(DosyaOlusturma.dosya);
			BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write(yazilacakMetin);
			bufferedwriter.close();
		} catch (IOException e) {
			System.out.println("Dosya bulunamadı" + e.getMessage());
		}


	}

}
