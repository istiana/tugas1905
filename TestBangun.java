public class TestBangun {
	public static void main(String[] args) {
		segitiga sgt = new segitiga(2,3,6);
		sgt.CetakSegitiga();
		System.out.println("");
		sgt.HitungSegitiga();

		System.out.println();
		System.out.println();

		lingkaran lingkaran = new lingkaran(3);
		lingkaran.CetakLingkaran();
		System.out.println("");
		lingkaran.HitungLingkaran();
	}
}