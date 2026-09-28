# Sistem Karyawan Kedai Kopi

## Deskripsi Project

Sistem Karyawan Kedai Kopi merupakan program sederhana berbasis Java yang digunakan untuk mengelola data karyawan pada sebuah kedai kopi.

Program ini dibuat sebagai penerapan konsep dasar Pemrograman Berorientasi Objek (PBO), yaitu **Inheritance, Polymorphism, Method Overriding, Method Overloading, Condition, dan Looping**.

Dalam program ini terdapat satu superclass yaitu `Karyawan` dan dua subclass yaitu `Barista` dan `Kasir`.

Program memungkinkan pengguna untuk:
- Menambahkan data karyawan.
- Memilih jabatan karyawan sebagai Barista atau Kasir.
- Menampilkan seluruh data karyawan.
- Menghitung total gaji berdasarkan jabatan dan jam kerja.
- Keluar dari program.

---

## Tujuan

Tujuan pembuatan program ini adalah:

1. Menerapkan konsep Inheritance dalam Java.
2. Menerapkan konsep Polymorphism.
3. Menerapkan Method Overriding.
4. Menerapkan Method Overloading.
5. Menerapkan percabangan menggunakan `if-else`.
6. Menerapkan perulangan menggunakan `while` dan `for`.
7. Membuat program sederhana dengan konsep Pemrograman Berorientasi Objek.

---

## Struktur Class

Struktur class pada program adalah sebagai berikut:

```text
                    Karyawan
                   Superclass
                       |
             ---------------------
             |                   |
          Barista              Kasir
         Subclass             Subclass
```

### Karyawan

`Karyawan` merupakan **superclass** yang menjadi induk dari class `Barista` dan `Kasir`.

Atribut yang terdapat pada class `Karyawan`:

- `id`
- `nama`
- `gajiPokok`
- `jamKerja`

Method yang terdapat pada class `Karyawan`:

- `hitungGaji()`
- `tampilkanData()`

### Barista

`Barista` merupakan **subclass** dari `Karyawan`.

Inheritance diterapkan menggunakan:

```java
public class Barista extends Karyawan
```

Class `Barista` melakukan overriding terhadap:

- `hitungGaji()`
- `tampilkanData()`

Ketentuan bonus Barista:

- Jam kerja >= 8 jam → bonus Rp500.000
- Jam kerja < 8 jam → bonus Rp250.000

### Kasir

`Kasir` merupakan **subclass** dari `Karyawan`.

Inheritance diterapkan menggunakan:

```java
public class Kasir extends Karyawan
```

Class `Kasir` melakukan overriding terhadap:

- `hitungGaji()`
- `tampilkanData()`

Ketentuan bonus Kasir:

- Jam kerja >= 8 jam → bonus Rp400.000
- Jam kerja < 8 jam → bonus Rp200.000

### Main

Class `Main` merupakan class utama untuk menjalankan program.

Class ini digunakan untuk:

- Menampilkan menu.
- Memasukkan data karyawan.
- Memilih jabatan Barista atau Kasir.
- Menyimpan data karyawan.
- Menampilkan data karyawan.
- Menerapkan Method Overloading.
- Menerapkan condition.
- Menerapkan looping.

---

# Konsep PBO yang Digunakan

## 1. Inheritance

Inheritance digunakan agar class `Barista` dan `Kasir` dapat mewarisi atribut dan method dari class `Karyawan`.

Contoh:

```java
public class Barista extends Karyawan
```

dan:

```java
public class Kasir extends Karyawan
```

Dengan demikian, struktur inheritance program adalah:

```text
Karyawan
   |
   |-- Barista
   |
   |-- Kasir
```

---

## 2. Superclass dan Subclass

Superclass pada program adalah:

```text
Karyawan
```

Subclass pada program adalah:

```text
Barista
Kasir
```

`Karyawan` menjadi class induk yang menyediakan atribut dan method dasar.

`Barista` dan `Kasir` mewarisi atribut serta method dari `Karyawan` dan dapat memiliki perilaku yang berbeda melalui Method Overriding.

---

## 3. Method Overriding

Method Overriding terjadi ketika subclass membuat kembali method yang sudah terdapat pada superclass.

Pada class `Barista`:

```java
@Override
public double hitungGaji()
```

Pada class `Kasir`:

```java
@Override
public double hitungGaji()
```

Method `tampilkanData()` juga di-override pada class `Barista` dan `Kasir`.

Dengan overriding, setiap jabatan dapat memiliki aturan perhitungan gaji dan tampilan data yang berbeda.

---

## 4. Method Overloading

Method Overloading diterapkan pada method `tambahKaryawan()`.

Method pertama:

```java
public static void tambahKaryawan(Karyawan karyawan)
```

Method kedua:

```java
public static void tambahKaryawan(
    int id,
    String nama,
    double gajiPokok,
    int jamKerja,
    int pilihanJabatan
)
```

Kedua method memiliki nama yang sama tetapi parameter yang berbeda sehingga merupakan penerapan Method Overloading.

---

## 5. Polymorphism

Polymorphism diterapkan menggunakan:

```java
ArrayList<Karyawan> daftarKaryawan
```

ArrayList tersebut memiliki tipe `Karyawan`, tetapi dapat menyimpan object dari subclass:

```text
Barista
Kasir
```

Contohnya:

```java
Barista barista = new Barista(...);
Kasir kasir = new Kasir(...);

daftarKaryawan.add(barista);
daftarKaryawan.add(kasir);
```

Ketika program menjalankan:

```java
karyawan.tampilkanData();
```

method yang dijalankan menyesuaikan dengan object sebenarnya, yaitu Barista atau Kasir.

---

## 6. Condition

Program menggunakan percabangan `if-else`.

Contoh pada pemilihan jabatan:

```java
if (pilihanJabatan == 1) {

    Barista barista = new Barista(...);

} else if (pilihanJabatan == 2) {

    Kasir kasir = new Kasir(...);

} else {

    System.out.println("Pilihan jabatan tidak tersedia.");
}
```

Condition juga digunakan dalam menentukan bonus berdasarkan jam kerja.

Contoh:

```java
if (jamKerja >= 8) {
    bonus = 500000;
} else {
    bonus = 250000;
}
```

---

## 7. Looping

Program menggunakan dua jenis looping.

### While

`while` digunakan untuk menjalankan menu utama secara berulang sampai pengguna memilih menu keluar.

```java
while (true) {
    ...
}
```

Program akan berhenti ketika pengguna memilih:

```text
3. Keluar
```

Kemudian program menjalankan:

```java
break;
```

### For

`for` digunakan untuk menampilkan seluruh data karyawan yang tersimpan dalam `ArrayList`.

```java
for (Karyawan karyawan : daftarKaryawan) {
    karyawan.tampilkanData();
}
```

---

# Alur Program

Alur penggunaan program adalah:

```text
Mulai
  |
  v
Menu Utama
  |
  +---- 1. Tambah Karyawan
  |          |
  |          v
  |      Input ID
  |          |
  |      Input Nama
  |          |
  |      Input Gaji
  |          |
  |      Input Jam Kerja
  |          |
  |      Pilih Jabatan
  |        /       \
  |       /         \
  |  Barista       Kasir
  |       \         /
  |        \       /
  |         v     v
  |       Simpan Data
  |
  +---- 2. Tampilkan Karyawan
  |          |
  |          v
  |      Tampilkan Data
  |
  +---- 3. Keluar
             |
             v
          Selesai
```

---

# Cara Menjalankan Program

## 1. Membuka Project

Program dibuat menggunakan bahasa Java dan dijalankan menggunakan NetBeans.

Buka project:

```text
Sistem_Karyawan_Kedai
```

## 2. Struktur File

Pastikan terdapat empat file Java:

```text
Source Packages
└── sistem_karyawan_kedai
    ├── Karyawan.java
    ├── Barista.java
    ├── Kasir.java
    └── Main.java
```

## 3. Menjalankan Program

Buka file `Main.java`.

Kemudian jalankan program menggunakan tombol **Run Project** atau tekan `F6`.

---

# Cara Menggunakan Program

## Menu Utama

Saat program dijalankan, akan muncul:

```text
================================
   SISTEM KARYAWAN KEDAI KOPI
================================
1. Tambah Karyawan
2. Tampilkan Karyawan
3. Keluar
Pilih menu:
```

Terdapat tiga pilihan:

### 1. Tambah Karyawan

Digunakan untuk menambahkan data karyawan baru.

### 2. Tampilkan Karyawan

Digunakan untuk menampilkan seluruh data karyawan yang telah ditambahkan.

### 3. Keluar

Digunakan untuk mengakhiri program.

---

# Contoh Penggunaan Program

## 1. Menambahkan Barista

Pilih menu:

```text
Pilih menu: 1
```

Masukkan data:

```text
===== TAMBAH KARYAWAN =====
ID: 1
Nama: Asep
Gaji Pokok: 3000000
Jam Kerja: 8
```

Kemudian pilih jabatan:

```text
Pilih Jabatan:
1. Barista
2. Kasir
Pilih jabatan: 1
```

Output:

```text
Data karyawan berhasil ditambahkan.
```

Data tersebut dibuat sebagai object `Barista`.

---

## 2. Menambahkan Kasir

Pilih kembali:

```text
Pilih menu: 1
```

Masukkan:

```text
ID: 2
Nama: Budi
Gaji Pokok: 2800000
Jam Kerja: 7
```

Kemudian:

```text
Pilih Jabatan:
1. Barista
2. Kasir
Pilih jabatan: 2
```

Output:

```text
Data karyawan berhasil ditambahkan.
```

Data tersebut dibuat sebagai object `Kasir`.

---

## 3. Menampilkan Data Karyawan

Pilih:

```text
Pilih menu: 2
```

Contoh output:

```text
===== DAFTAR KARYAWAN =====
----------------------------
Jabatan    : Barista
ID         : 1
Nama       : Asep
Gaji Pokok : Rp3000000.0
Jam Kerja  : 8 jam
Total Gaji : Rp3500000.0
----------------------------
Jabatan    : Kasir
ID         : 2
Nama       : Budi
Gaji Pokok : Rp2800000.0
Jam Kerja  : 7 jam
Total Gaji : Rp3000000.0
----------------------------
```

---

# Perhitungan Gaji

## Barista

Jika jam kerja >= 8 jam:

```text
Total Gaji = Gaji Pokok + Rp500.000
```

Contoh:

```text
Gaji Pokok = Rp3.000.000
Bonus      = Rp500.000
Total Gaji = Rp3.500.000
```

Jika jam kerja < 8 jam:

```text
Total Gaji = Gaji Pokok + Rp250.000
```

## Kasir

Jika jam kerja >= 8 jam:

```text
Total Gaji = Gaji Pokok + Rp400.000
```

Jika jam kerja < 8 jam:

```text
Total Gaji = Gaji Pokok + Rp200.000
```

---

# Dokumentasi Program Berjalan

Bagian ini berisi dokumentasi berupa screenshot ketika program berhasil dijalankan menggunakan NetBeans.

## 1. Tampilan Menu Utama

Screenshot berikut menunjukkan tampilan awal program setelah berhasil dijalankan.

**Dokumentasi:**

**[MASUKKAN SCREENSHOT MENU UTAMA DI SINI]**

Contoh tampilan:

```text
================================
   SISTEM KARYAWAN KEDAI KOPI
================================
1. Tambah Karyawan
2. Tampilkan Karyawan
3. Keluar
Pilih menu:
```

**Keterangan:**

Pada tampilan ini terdapat tiga pilihan menu, yaitu Tambah Karyawan, Tampilkan Karyawan, dan Keluar.

---

## 2. Proses Menambahkan Data Karyawan

Screenshot berikut menunjukkan proses memasukkan data karyawan.

**Dokumentasi:**

**[MASUKKAN SCREENSHOT PROSES INPUT DATA DI SINI]**

Contoh:

```text
===== TAMBAH KARYAWAN =====
ID: 1
Nama: Asep
Gaji Pokok: 3000000
Jam Kerja: 8
```

**Keterangan:**

Pengguna memasukkan ID, nama, gaji pokok, dan jam kerja karyawan.

---

## 3. Pemilihan Jabatan

Screenshot berikut menunjukkan pilihan jabatan Barista atau Kasir.

**Dokumentasi:**

**[MASUKKAN SCREENSHOT PILIHAN JABATAN DI SINI]**

Contoh:

```text
Pilih Jabatan:
1. Barista
2. Kasir
Pilih jabatan: 1
```

**Keterangan:**

Pengguna dapat memilih jabatan Barista atau Kasir. Pilihan tersebut menentukan subclass dari object karyawan yang dibuat.

---

## 4. Hasil Data Karyawan

Screenshot berikut menunjukkan data karyawan yang telah berhasil ditambahkan.

**Dokumentasi:**

**[MASUKKAN SCREENSHOT HASIL DATA KARYAWAN DI SINI]**

Contoh:

```text
===== DAFTAR KARYAWAN =====
----------------------------
Jabatan    : Barista
ID         : 1
Nama       : Asep
Gaji Pokok : Rp3000000.0
Jam Kerja  : 8 jam
Total Gaji : Rp3500000.0
----------------------------
Jabatan    : Kasir
ID         : 2
Nama       : Budi
Gaji Pokok : Rp2800000.0
Jam Kerja  : 7 jam
Total Gaji : Rp3000000.0
----------------------------
```

**Keterangan:**

Program menampilkan data karyawan yang telah ditambahkan, termasuk jabatan, ID, nama, gaji pokok, jam kerja, dan total gaji.

---

## 5. Program Selesai

Screenshot berikut menunjukkan program ketika pengguna memilih menu keluar.

**Dokumentasi:**

**[MASUKKAN SCREENSHOT PROGRAM SELESAI DI SINI]**

Contoh:

```text
Pilih menu: 3

Program selesai.
```

**Keterangan:**

Program berhenti setelah pengguna memilih menu `3. Keluar`.

---

# Struktur Folder Dokumentasi

Screenshot program dapat disimpan dalam folder `images`.

Struktur repository:

```text
Sistem_Karyawan_Kedai
│
├── README.md
│
├── images
│   ├── menu-utama.png
│   ├── tambah-karyawan.png
│   ├── pilihan-jabatan.png
│   ├── daftar-karyawan.png
│   └── program-selesai.png
│
└── src
    └── sistem_karyawan_kedai
        ├── Karyawan.java
        ├── Barista.java
        ├── Kasir.java
        └── Main.java
```

Nama file screenshot dapat disesuaikan dengan nama file yang digunakan pada repository GitHub.

---

# Teknologi yang Digunakan

- Java
- NetBeans
- ArrayList
- Scanner
- Pemrograman Berorientasi Objek (PBO)

---

# Struktur Project

```text
Sistem_Karyawan_Kedai
│
├── README.md
│
├── images
│   ├── menu-utama.png
│   ├── tambah-karyawan.png
│   ├── pilihan-jabatan.png
│   ├── daftar-karyawan.png
│   └── program-selesai.png
│
└── src
    └── sistem_karyawan_kedai
        ├── Karyawan.java
        ├── Barista.java
        ├── Kasir.java
        └── Main.java
```

---

# Kesimpulan

Program Sistem Karyawan Kedai Kopi berhasil menerapkan konsep dasar Pemrograman Berorientasi Objek menggunakan bahasa Java.

Program memiliki superclass `Karyawan` dan dua subclass yaitu `Barista` dan `Kasir` sebagai penerapan Inheritance.

Selain Inheritance, program juga menerapkan Polymorphism melalui Method Overriding dan Method Overloading. Method Overriding digunakan pada method `hitungGaji()` dan `tampilkanData()`, sedangkan Method Overloading diterapkan pada method `tambahKaryawan()`.

Program juga menggunakan percabangan `if-else` untuk menentukan jabatan dan bonus karyawan serta menggunakan looping `while` dan `for` untuk menjalankan menu dan menampilkan data karyawan.

Dengan demikian, program dapat digunakan sebagai contoh sederhana penerapan konsep Pemrograman Berorientasi Objek dalam studi kasus pengelolaan data karyawan pada kedai kopi.
