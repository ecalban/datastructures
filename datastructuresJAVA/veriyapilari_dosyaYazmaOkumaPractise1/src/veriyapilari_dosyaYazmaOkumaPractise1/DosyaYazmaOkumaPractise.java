package veriyapilari_dosyaYazmaOkumaPractise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DosyaYazmaOkumaPractise {
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		// Kullanıcıdan dosya ismi ve dosya içeriği alma kısmı
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dosya ismi: ");
		String fileName = scanner.nextLine();
		System.out.println("Dosyaya yazılacak metin: ");
		String fileContent = scanner.nextLine();
		
		// alınan dosya ismi ile dosya oluşturma kısmı
		File dosyaNesnesi = new File(fileName + ".txt");
		if(!dosyaNesnesi.exists()) {
			dosyaNesnesi.createNewFile();
		}
		
		// alınan dosya içeriğini dosyaya yazma kısmı
		FileWriter filewriter = new FileWriter(dosyaNesnesi,false);
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		bufferedwriter.write(fileContent);
		bufferedwriter.close();
		
		// dosyayı okuma kısmı
		FileReader filereader = new FileReader(dosyaNesnesi);
		String line;
		BufferedReader bufferreader = new BufferedReader(filereader);
		while((line = bufferreader.readLine()) != null) {
			System.out.print(line);
		}
		bufferreader.close();
	}

}
