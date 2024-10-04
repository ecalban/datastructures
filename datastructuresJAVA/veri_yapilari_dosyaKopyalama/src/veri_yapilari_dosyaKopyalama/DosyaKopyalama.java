package veri_yapilari_dosyaKopyalama;

import java.io.*;
import java.util.Scanner;

public class DosyaKopyalama {

	public static void main(String[] args) throws IOException {
		
		// gecici bir string açtık
		String gecici = "";
		
		// kopyasını alacağımız dosyayı File sınıfında nesneleştirdik
		File kopyalanacak = new File("kopyalanacakolan");
		
		// onu sonra scanner nesnesine atadık(girdi olarak düşüneceğiz)
		Scanner scanner = new Scanner(kopyalanacak);
		
		// girdi olarak düşündüğümüz metinden oluşan nesneyi gecici stringe kopyaladık
		while(scanner.hasNextLine()) {
			String satir = scanner.nextLine();
			gecici = gecici + satir;
		}
		// System.out.print(gecici);
		
		// geçici açtığımız stringde olan kopyalanacak metni, kopyalamak istediğimiz dosyaya aktardık
		File kopya = new File("kopya");
		FileWriter fw = new FileWriter(kopya,false);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(gecici);
		bw.close();
		
		// kopyalama işlemi gerçekleşti kalan kısımda kopyalandığını görmek için dosyayı yazdırıyoruz
		Scanner scanner1 = new Scanner(kopya);
		while(scanner1.hasNextLine()) {
			String satir = scanner1.nextLine();
			System.out.println(satir);
		}
		scanner1.close();
		
		
		
	}

}
