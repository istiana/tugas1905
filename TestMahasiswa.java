public class TestMahasiswa
{
	public static void main(String[]args){
		Mahasiswa mhs = new Mahasiswa("Istiana",20);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setA(25);
		mhs.tampilkanBiodata();
	}
}