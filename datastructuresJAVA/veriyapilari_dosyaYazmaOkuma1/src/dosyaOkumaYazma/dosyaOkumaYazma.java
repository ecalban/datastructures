package dosyaOkumaYazma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class dosyaOkumaYazma {
	public static void main(String[] args) throws IOException { 
		
		//oluşturma
		String yazilacakMetin = "Javada dosya işlemleri";
		File file = new File("yazi.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//yazma
		FileWriter filewriter = new FileWriter(file,false);
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		bufferedwriter.write(yazilacakMetin);
		bufferedwriter.close();
		
		//okuma
		FileReader filereader = new FileReader(file);
		String line;
		BufferedReader bufferedreader = new BufferedReader(filereader);
		while((line = bufferedreader.readLine()) !=null) {
			System.out.print(line);
		}
		bufferedreader.close();
		}
}