public class Mahasiswa 
{
    private String name;
    private int a;

    public Mahasiswa(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public void tampilkanBiodata(){
        System.out.println("-----Biodata Mahasiswa-----");
        System.out.println("name Mahasiswa="+name);
        System.out.println("a Mahasiswa="+a);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}