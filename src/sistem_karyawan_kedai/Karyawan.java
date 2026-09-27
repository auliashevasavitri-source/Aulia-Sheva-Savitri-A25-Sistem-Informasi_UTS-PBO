package sistem_karyawan_kedai;
public class Karyawan {

    // Atribut superclass
    protected int id;
    protected String nama;
    protected double gajiPokok;
    protected int jamKerja;

    // Constructor
    public Karyawan(int id, String nama, double gajiPokok, int jamKerja) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.jamKerja = jamKerja;
    }

    // Method yang akan di-override oleh subclass
    public double hitungGaji() {
        return gajiPokok;
    }

    // Method menampilkan data
    public void tampilkanData() {
        System.out.println("ID         : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Jam Kerja  : " + jamKerja + " jam");
    }
}