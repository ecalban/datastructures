package YeniPkg;

import java.util.Scanner;
	
public class AnaSinif {
	
	String musteriIsim;
	String musteriSoyisim;
	int musteriButce;

	public static void main(String[] args) {
		AnaSinif.musteriUyeMi();
		
		IkinciSinif kitap1 = new IkinciSinif();
		ikinciSinifDegerYazdir(kitap1);
		
		IkinciSinif[] kitapListe = new IkinciSinif[2];
		for(int i=0;i<kitapListe.length;i++) {
			IkinciSinif kitap = new IkinciSinif();
			kitapListe[i] = kitap;
		}
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<kitapListe.length;i++) {

			System.out.println("Kitap İsmi: ");
			String kitapIsmi = scanner.nextLine();
			// scanner.nextLine();
			kitapListe[i].setKitapIsmı(kitapIsmi);
			
			System.out.println("Kitap Türü: ");
			String kitapTuru = scanner.nextLine();
			// scanner.nextLine();
			kitapListe[i].setKitapTuru(kitapTuru);;
				
			System.out.println("Kitap Yayımlanma Tarihi: ");
			String yayimYili = scanner.nextLine();
			// scanner.nextLine();
			kitapListe[i].setYayimYili(yayimYili);
			
			System.out.println("Kitap Sayfa Sayısı: ");
			String sayfaSayisi = scanner.nextLine();
			// scanner.nextLine();
			kitapListe[i].setSayfaSayisi(sayfaSayisi);
		}
		
		for (int i=0;i<kitapListe.length;i++) {
			System.out.println(kitapListe[i].getKitapIsmı());
			System.out.println(kitapListe[i].getKitapTuru());
			System.out.println(kitapListe[i].getYayimYili());
			System.out.println(kitapListe[i].getSayfaSayisi());
			System.out.println("-----------------------------------------");
			
		}
	}
	public AnaSinif(String musteriIsim, String musteriSoyisim) {
		this.musteriIsim = musteriIsim;
		this.musteriIsim = musteriIsim;
	}
	public AnaSinif(String musterIsim, String musteriSoyisim, int musteriButce) {
		this.musteriIsim = musterIsim;
		this.musteriSoyisim = musteriSoyisim;
		this.musteriButce = musteriButce;
	}
	public static void musteriUyeMi() {
		boolean musteriUyelik = true;
		System.out.println(musteriUyelik);
	}
	public static void ikinciSinifDegerYazdir(IkinciSinif kitap) {
		System.out.println(kitap.getKitapIsmı());
		System.out.println(kitap.getKitapTuru());
		System.out.println(kitap.getYayimYili());
		System.out.println(kitap.getSayfaSayisi());
	}
	
	public static IkinciSinif ikinciSinifaDegerAta(String kitapIsmi, String kitapTuru, String yayimYili, String sayfaSayisi) {
		IkinciSinif kitap2 = new IkinciSinif();
		kitap2.setKitapIsmı(kitapIsmi);
		kitap2.setKitapTuru(kitapTuru);;
		kitap2.setYayimYili(yayimYili);;
		kitap2.setSayfaSayisi(sayfaSayisi);
		return kitap2;	
	}
}
