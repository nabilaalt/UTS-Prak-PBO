Explanation: 

Program tersebut adalah sebuah program Java yang digunakan untuk menghitung luas dan keliling dari berbagai bangun datar seperti persegi, persegi panjang, segitiga, dan lingkaran. User diminta untuk memilih bangun datar yang ingin dihitung, kemudian memasukkan nilai-nilai yang diperlukan (misalnya panjang sisi, panjang, lebar, alas, tinggi, atau jari-jari). Setelah itu, program akan menghitung luas dan keliling berdasarkan input user dan menampilkannya.

Hal yang mengandung konsep-konsep dari OOP (Object-Oriented Programming) dalam program ini adalah:

1. Encapsulation: 
   - Terlihat dalam penggunaan variabel privat (private fields) dalam kelas-kelas seperti `Persegi`, `PersegiPanjang`, `Segitiga`, dan `Lingkaran`. Variabel ini tidak dapat diakses secara langsung dari luar kelas, melainkan melalui metode-metode publik yang disediakan. Contohnya adalah variabel `sisi` dalam kelas `Persegi` atau `panjang` dan `lebar` dalam kelas `PersegiPanjang`.

2. Inheritance:
   - Konsep ini terlihat dari penggunaan abstract class `BangunDatar` sebagai superclass untuk semua jenis bangun datar seperti `Persegi`, `PersegiPanjang`, `Segitiga`, dan `Lingkaran`. Semua kelas ini mewarisi sifat dan perilaku yang sama dari `BangunDatar`, seperti memiliki nama dan metode untuk menghitung luas dan keliling.

3. Polymorphism:
   - Dalam program ini, polimorfisme terlihat ketika objek-objek dari kelas turunan seperti `Persegi`, `PersegiPanjang`, `Segitiga`, dan `Lingkaran` diinisialisasi menggunakan referensi superclass `BangunDatar`. Ini memungkinkan kita untuk menggunakan objek-objek ini dengan cara yang sama meskipun mereka adalah jenis yang berbeda.

4. Interface:
   - Terdapat sebuah interface bernama `Bentuk` yang mendefinisikan dua metode `hitungLuas()` dan `hitungKeliling()`. Kelas-kelas seperti `Persegi`, `PersegiPanjang`, `Segitiga`, dan `Lingkaran` mengimplementasikan interface ini. Ini memastikan bahwa semua kelas tersebut memiliki metode-metode tersebut, meskipun implementasinya mungkin berbeda-beda.
