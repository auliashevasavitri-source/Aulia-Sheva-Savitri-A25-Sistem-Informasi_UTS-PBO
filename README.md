# Sistem Karyawan Kedai Kopi

## Deskripsi Program

Sistem Karyawan Kedai Kopi merupakan program berbasis Java yang digunakan untuk mengelola data karyawan pada sebuah kedai kopi. Program ini memungkinkan pengguna untuk menambahkan data karyawan berdasarkan jabatan, yaitu **Barista** atau **Kasir**, serta menampilkan data karyawan beserta perhitungan total gaji.

Program dibuat untuk menerapkan konsep **Pemrograman Berorientasi Objek (PBO)**, yaitu Inheritance, Polymorphism, Method Overriding, Method Overloading, percabangan `if-else`, dan perulangan.

---

## Tujuan Program

Tujuan dari pembuatan program ini adalah:

1. Mengelola data karyawan kedai kopi.
2. Menambahkan karyawan berdasarkan jabatan Barista atau Kasir.
3. Menghitung total gaji berdasarkan jabatan dan jam kerja.
4. Menampilkan seluruh data karyawan yang telah dimasukkan.
5. Menerapkan konsep dasar Pemrograman Berorientasi Objek dalam Java.

---

## Studi Kasus

Studi kasus yang digunakan adalah **Sistem Pengelolaan Data Karyawan Kedai Kopi**.

Dalam sebuah kedai kopi terdapat beberapa jenis karyawan, salah satunya adalah Barista dan Kasir. Setiap karyawan memiliki data berupa:

- ID
- Nama
- Gaji Pokok
- Jam Kerja
- Jabatan

Program memberikan pilihan kepada pengguna untuk menentukan jabatan karyawan saat memasukkan data.

---

## Struktur Class

Program terdiri dari empat class utama:

```text
Karyawan
├── Barista
└── Kasir

Main
```

### 1. Karyawan

`Karyawan` merupakan superclass atau class induk yang menyimpan data dasar seluruh karyawan.

Atribut yang digunakan:

- `id`
- `nama`
- `gajiPokok`
- `jamKerja`

Class ini juga memiliki method:

- `hitungGaji()`
- `tampilkanData()`

### 2. Barista

`Barista` merupakan subclass dari `Karyawan`.

Barista memiliki perhitungan bonus:

- Jam kerja >= 8 jam → bonus Rp500.000
- Jam kerja < 8 jam → bonus Rp250.000

Total gaji dihitung dari:

```text
Gaji Pokok + Bonus
```

### 3. Kasir

`Kasir` merupakan subclass dari `Karyawan`.

Kasir memiliki perhitungan bonus:

- Jam kerja >= 8 jam → bonus Rp400.000
- Jam kerja < 8 jam → bonus Rp200.000

Total gaji dihitung dari:

```text
Gaji Pokok + Bonus
```

### 4. Main

`Main` merupakan class utama yang digunakan untuk menjalankan program.

Class ini menyediakan menu:

```text
1. Tambah Karyawan
2. Tampilkan Karyawan
3. Keluar
```

---

# Penerapan Konsep PBO

## 1. Inheritance

Inheritance atau pewarisan diterapkan dengan membuat class `Barista` dan `Kasir` sebagai turunan dari class `Karyawan`.

Contoh:

```java
public class Barista extends Karyawan
```

dan:

```java
public class Kasir extends Karyawan
```

Dengan demikian, Barista dan Kasir dapat menggunakan atribut dan method yang terdapat pada class `Karyawan`.

---

## 2. Superclass dan Subclass

Superclass yang digunakan dalam program adalah:

```text
Karyawan
```

Sedangkan subclass yang digunakan adalah:

```text
Barista
Kasir
```

Strukturnya:

```text
Karyawan
   ├── Barista
   └── Kasir
```

---

## 3. Method Overriding

Method overriding diterapkan pada method:

```java
hitungGaji()
```

dan:

```java
tampilkanData()
```

Method tersebut terdapat pada class `Karyawan` dan kemudian dibuat kembali pada class `Barista` dan `Kasir` menggunakan annotation:

```java
@Override
```

Hal ini membuat setiap jenis karyawan memiliki implementasi method yang berbeda.

---

## 4. Method Overloading

Method overloading diterapkan pada method:

```java
tambahKaryawan()
```

Method tersebut dibuat dalam dua bentuk.

Bentuk pertama menerima objek `Karyawan`:

```java
public static void tambahKaryawan(Karyawan karyawan)
```

Bentuk kedua menerima beberapa parameter:

```java
public static void tambahKaryawan(
    int id,
    String nama,
    double gajiPokok,
    int jamKerja,
    int pilihanJabatan
)
```

Kedua method memiliki nama yang sama tetapi parameter yang berbeda.

---

## 5. Polymorphism

Polymorphism diterapkan menggunakan:

```java
ArrayList<Karyawan> daftarKaryawan
```

Walaupun tipe data list adalah `Karyawan`, objek yang disimpan dapat berupa:

```text
Barista
Kasir
```

Contohnya:

```java
daftarKaryawan.add(barista);
```

dan:

```java
daftarKaryawan.add(kasir);
```

Saat program menjalankan:

```java
karyawan.tampilkanData();
```

Java akan menjalankan method sesuai dengan jenis objek sebenarnya, yaitu method milik `Barista` atau `Kasir`.

---

## 6. Percabangan (If-Else)

Percabangan digunakan untuk menentukan jabatan karyawan.

Contoh:

```java
if (pilihanJabatan == 1) {
    Barista barista = new Barista(...);
} else if (pilihanJabatan == 2) {
    Kasir kasir = new Kasir(...);
} else {
    System.out.println("Pilihan jabatan tidak tersedia.");
}
```

Percabangan juga digunakan dalam menentukan bonus berdasarkan jam kerja.

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

Perulangan `while` digunakan untuk menjalankan menu utama program secara terus-menerus sampai pengguna memilih menu keluar.

Contoh:

```java
while (true) {
    // menu program
}
```

Perulangan `for` digunakan untuk menampilkan seluruh data karyawan yang terdapat dalam `ArrayList`.

Contoh:

```java
for (Karyawan karyawan : daftarKaryawan) {
    karyawan.tampilkanData();
}
```

---

# Alur Program

Alur program secara umum adalah sebagai berikut:

```text
Mulai
  |
  v
Menampilkan Menu
  |
  +---- 1. Tambah Karyawan
  |          |
  |          v
  |      Input ID, Nama,
  |      Gaji Pokok,
  |      dan Jam Kerja
  |          |
  |          v
  |      Pilih Jabatan
  |       /         \
  |   Barista      Kasir
  |       \         /
  |        \       /
  |          v
  |     Data Disimpan
  |
  +---- 2. Tampilkan Karyawan
  |          |
  |          v
  |    Menampilkan Data
  |    dan Total Gaji
  |
  +---- 3. Keluar
             |
             v
          Selesai
```

---

# Cara Menjalankan Program

## Menggunakan NetBeans

1. Buka project pada NetBeans.
2. Pastikan package yang digunakan adalah:

```text
sistem_karyawan_kedai
```

3. Pastikan terdapat empat file:

```text
Karyawan.java
Barista.java
Kasir.java
Main.java
```

4. Pastikan `Main.java` memiliki method:

```java
public static void main(String[] args)
```

5. Jalankan program menggunakan **Run Project** atau tekan `F6`.

6. Jika NetBeans meminta Main Class, pilih:

```text
sistem_karyawan_kedai.Main
```

---

# Cara Menggunakan Program

## 1. Menambahkan Karyawan

Pada menu utama pilih:

```text
1. Tambah Karyawan
```

Kemudian masukkan data:

```text
ID: 1
Nama: Asep
Gaji Pokok: 3000000
Jam Kerja: 8
```

Setelah itu program menampilkan pilihan:

```text
Pilih Jabatan:
1. Barista
2. Kasir
Pilih jabatan:
```

Masukkan `1` untuk Barista atau `2` untuk Kasir.

---

## 2. Menampilkan Data Karyawan

Pada menu utama pilih:

```text
2. Tampilkan Karyawan
```

Program akan menampilkan seluruh data karyawan yang sudah dimasukkan.

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
```

---

## 3. Keluar dari Program

Untuk menghentikan program, pilih:

```text
3. Keluar
```

Program akan menampilkan:

```text
Program selesai.
```

---

# Contoh Penggunaan Program

## Input Karyawan Pertama

```text
Pilih menu: 1

===== TAMBAH KARYAWAN =====
ID: 1
Nama: Asep
Gaji Pokok: 3000000
Jam Kerja: 8

Pilih Jabatan:
1. Barista
2. Kasir
Pilih jabatan: 1

Data karyawan berhasil ditambahkan.
```

## Input Karyawan Kedua

```text
Pilih menu: 1

===== TAMBAH KARYAWAN =====
ID: 2
Nama: Budi
Gaji Pokok: 2800000
Jam Kerja: 7

Pilih Jabatan:
1. Barista
2. Kasir
Pilih jabatan: 2

Data karyawan berhasil ditambahkan.
```

## Hasil Tampilan Data

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

# Dokumentasi Program Berjalan

Bagian ini digunakan untuk menyimpan screenshot sebagai bukti bahwa program dapat berjalan dengan baik.

## 1. Screenshot Menu Utama

Masukkan screenshot tampilan awal program setelah dijalankan.

**Keterangan:**

Menampilkan menu utama yang terdiri dari pilihan Tambah Karyawan, Tampilkan Karyawan, dan Keluar.

<img width="417" height="202" alt="image" src="https://github.com/user-attachments/assets/20042482-c9a8-4c57-9bbb-3155da7c4af9" />


---

## 2. Screenshot Proses Input Karyawan

Masukkan screenshot saat pengguna memasukkan data karyawan.

**Keterangan:**

Menampilkan proses penginputan ID, nama, gaji pokok, dan jam kerja karyawan.

<img width="414" height="251" alt="image" src="https://github.com/user-attachments/assets/b1b7e294-80cb-4e8b-b33c-f8c358265ed0" />


---

## 3. Screenshot Pemilihan Jabatan

Masukkan screenshot ketika pengguna memilih jabatan Barista atau Kasir.

**Keterangan:**

Menampilkan pilihan jabatan yang tersedia pada sistem, yaitu Barista dan Kasir.

<img width="467" height="123" alt="image" src="https://github.com/user-attachments/assets/d88c8eca-c5cd-4d53-be89-f4a3db5f2176" />


---

## 4. Screenshot Hasil Data Karyawan

Masukkan screenshot setelah memilih menu Tampilkan Karyawan.

**Keterangan:**

Menampilkan data karyawan beserta jabatan, jam kerja, gaji pokok, dan total gaji.

<img width="449" height="210" alt="image" src="https://github.com/user-attachments/assets/2fe8a088-0ac2-433b-8fe3-c596187694f1" />


---

## 5. Screenshot Program Selesai

Masukkan screenshot ketika pengguna memilih menu Keluar.

**Keterangan:**

Menampilkan pesan bahwa program telah selesai dijalankan.

<img width="481" height="185" alt="image" src="https://github.com/user-attachments/assets/8867fa0b-5c77-48f8-accd-880e504e63c2" />


---

# Teknologi yang Digunakan

- Java
- NetBeans IDE
- Java Collections (`ArrayList`)
- GitHub

---

# Kesimpulan

Program Sistem Karyawan Kedai Kopi berhasil dibuat untuk mengelola data karyawan dengan jabatan Barista dan Kasir. Program dapat melakukan penambahan data, menentukan jabatan karyawan, menghitung total gaji berdasarkan jam kerja, serta menampilkan seluruh data karyawan.

Dalam pembuatannya, program menerapkan konsep Pemrograman Berorientasi Objek berupa **Inheritance, Superclass dan Subclass, Method Overriding, Method Overloading, dan Polymorphism**, serta menggunakan **percabangan dan perulangan** untuk mengatur alur program.

Program ini juga memiliki pilihan jabatan secara langsung saat dijalankan sehingga pengguna dapat menentukan apakah karyawan yang ditambahkan merupakan **Barista atau Kasir**.
