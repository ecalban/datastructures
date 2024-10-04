package YeniPkg;

public class IkinciSinif {
	private String kitapIsmı;
	private String kitapTuru;
	private String yayimYili;
	private String sayfaSayisi;
	
	public IkinciSinif() {
		this.setKitapIsmı("A Dream of Spring");
		this.setKitapTuru("Fantasy");
		this.setYayimYili("Yayımlanmadı");
		this.setSayfaSayisi("Sayfa sayısı bilinmiyor.");
	}

	public String getKitapIsmı() {
		return kitapIsmı;
	}

	public void setKitapIsmı(String kitapIsmı) {
		this.kitapIsmı = kitapIsmı;
	}

	public String getKitapTuru() {
		return kitapTuru;
	}

	public void setKitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}

	public String getYayimYili() {
		return yayimYili;
	}

	public void setYayimYili(String yayimYili) {
		this.yayimYili = yayimYili;
	}

	public String getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(String sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
}
