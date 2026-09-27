package sistem_karyawan_kedai;
public class Barista extends Karyawan {

    // Constructor
    public Barista(int id, String nama, double gajiPokok, int jamKerja) {
        super(id, nama, gajiPokok, jamKerja);
    }

    // METHOD OVERRIDING
    @Override
    public double hitungGaji() {

        double bonus;

        // CONDITION
        if (jamKerja >= 8) {
            bonus = 500000;
        } else {
            bonus = 250000;
        }

        return gajiPokok + bonus;
    }

    // METHOD OVERRIDING
    @Override
    public void tampilkanData() {

        System.out.println("Jabatan    : Barista");

        // Memanggil method dari superclass
        super.tampilkanData();

        System.out.println("Total Gaji : Rp" + hitungGaji());
    }
}