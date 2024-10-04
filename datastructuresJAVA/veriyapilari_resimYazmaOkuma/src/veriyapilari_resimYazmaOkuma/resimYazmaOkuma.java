package veriyapilari_resimYazmaOkuma;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class resimYazmaOkuma {

	public static void main(String[] args) throws IOException {
		
		//oluşturma
		byte[] data = {0x01, 0x02};
		File binaryFile = new File("binary.dat");
		
		//yazmak
		FileOutputStream fos = new FileOutputStream(binaryFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(data);
		bos.close();
		
		//okumak
		FileInputStream fis = new FileInputStream(binaryFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		bis.read(data,0,data.length);
		bis.close();
		
		//konsolda çıktısı
		for (byte b : data) {
            System.out.printf("%02X ", b);  // Hexadecimal formatta yazdır
        }
		
	}

}
