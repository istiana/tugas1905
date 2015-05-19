public class segitiga {
	private int alas;
	private int tinggi;
	private int garisMiring;
	private double luas;
	private double keliling;

	public segitiga(int a, int t, int gm){
		alas = a;
		tinggi = t;
		garisMiring = gm;
	}

	public void CetakSegitiga(){
		System.out.println("=== SEGITIGA ===");
		System.out.println("Alas = " +alas);
		System.out.println("Tinggi = " +tinggi);
		System.out.println("Sisi Miring = " +garisMiring);
	}

	public void HitungSegitiga(){
		luas = 0.5*alas*tinggi;
		System.out.println("Luas Segitiga :0.5 x alas x tinggi = " +luas);

		keliling = alas+tinggi+garisMiring;
		System.out.println("Keliling Segitiga : alas + tinggi + Sisi miring = " +keliling);
	}
}