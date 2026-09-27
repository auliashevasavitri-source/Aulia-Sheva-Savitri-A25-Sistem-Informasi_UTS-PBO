package sistem_karyawan_kedai;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Menyimpan data seluruh karyawan
    static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    /*
     * METHOD OVERLOADING 1
     * Menerima object Karyawan
     */
    public static void tambahKaryawan(Karyawan karyawan) {

        daftarKaryawan.add(karyawan);

        System.out.println("Data karyawan berhasil ditambahkan.");
    }

    /*
     * METHOD OVERLOADING 2
     * Parameter berbeda dari method sebelumnya
     */
    public static void tambahKaryawan(
            int id,
            String nama,
            double gajiPokok,
            int jamKerja,
            int pilihanJabatan) {

        // CONDITION
        if (pilihanJabatan == 1) {

            // Membuat object subclass Barista
            Barista barista = new Barista(
                    id,
                    nama,
                    gajiPokok,
                    jamKerja
            );

            // Memanggil method tambahKaryawan versi pertama
            tambahKaryawan(barista);

        } else if (pilihanJabatan == 2) {

            // Membuat object subclass Kasir
            Kasir kasir = new Kasir(
                    id,
                    nama,
                    gajiPokok,
                    jamKerja
            );

            // Memanggil method tambahKaryawan versi pertama
            tambahKaryawan(kasir);

        } else {

            System.out.println("Pilihan jabatan tidak tersedia.");
        }
    }

    // Method untuk menampilkan seluruh data karyawan
    public static void tampilkanKaryawan() {

        if (daftarKaryawan.isEmpty()) {

            System.out.println("\nBelum ada data karyawan.");
            return;
        }

        System.out.println("\n===== DAFTAR KARYAWAN =====");

        /*
         * LOOPING
         */
        for (Karyawan karyawan : daftarKaryawan) {

            System.out.println("----------------------------");

            /*
             * POLYMORPHISM
             *
             * Method tampilkanData() akan menyesuaikan
             * dengan object Barista atau Kasir.
             */
            karyawan.tampilkanData();
        }

        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;

        /*
         * LOOPING MENU UTAMA
         */
        while (true) {

            System.out.println("\n================================");
            System.out.println("   SISTEM KARYAWAN KEDAI KOPI");
            System.out.println("================================");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Karyawan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            /*
             * CONDITION
             */
            if (pilihan == 1) {

                System.out.println("\n===== TAMBAH KARYAWAN =====");

                // Input ID
                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();

                // Input nama
                System.out.print("Nama: ");
                String nama = input.nextLine();

                // Input gaji
                System.out.print("Gaji Pokok: ");
                double gaji = input.nextDouble();

                // Input jam kerja
                System.out.print("Jam Kerja: ");
                int jam = input.nextInt();

                /*
                 * PILIH SUBCLASS
                 */
                System.out.println("\nPilih Jabatan:");
                System.out.println("1. Barista");
                System.out.println("2. Kasir");
                System.out.print("Pilih jabatan: ");

                int jabatan = input.nextInt();
                input.nextLine();

                /*
                 * Memanggil METHOD OVERLOADING
                 */
                tambahKaryawan(
                        id,
                        nama,
                        gaji,
                        jam,
                        jabatan
                );

            } else if (pilihan == 2) {

                // Menampilkan data
                tampilkanKaryawan();

            } else if (pilihan == 3) {

                System.out.println("\nProgram selesai.");
                break;

            } else {

                System.out.println("\nPilihan menu tidak tersedia.");
            }
        }

        input.close();
    }
}