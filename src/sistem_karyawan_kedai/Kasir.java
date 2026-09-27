package sistem_karyawan_kedai;

public class Kasir extends Karyawan {

    // Constructor
    public Kasir(int id, String nama, double gajiPokok, int jamKerja) {
        super(id, nama, gajiPokok, jamKerja);
    }

    // METHOD OVERRIDING
    @Override
    public double hitungGaji() {

        double bonus;

        // CONDITION
        if (jamKerja >= 8) {
            bonus = 400000;
        } else {
            bonus = 200000;
        }

        return gajiPokok + bonus;
    }

    // METHOD OVERRIDING
    @Override
    public void tampilkanData() {

        System.out.println("Jabatan    : Kasir");

        // Memanggil method dari superclass
        super.tampilkanData();

        System.out.println("Total Gaji : Rp" + hitungGaji());
    }
}