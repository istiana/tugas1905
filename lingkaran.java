public class lingkaran {
	private int jari;
	private double luasLingkaran;
	private double kelLingkaran;

	public lingkaran(int r){
		jari = r;
	}

	public void CetakLingkaran(){
		System.out.println("=== LINGKARAN ===");
		System.out.println("Jari-Jari lingkaran = " +jari);
	}

	public void HitungLingkaran(){
		luasLingkaran = Math.PI*jari*jari;
		System.out.println("Luas Lingkaran : 3,14 X jari-jari X jari-jari = " +luasLingkaran);

		kelLingkaran = Math.PI*(jari+jari);
		System.out.println("Kelililng Lingkaran : 3,14 X Diameter = " +kelLingkaran);
	}
}