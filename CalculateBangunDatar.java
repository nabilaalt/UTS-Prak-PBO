import java.util.Scanner;

// Interface untuk bangun datar
interface Bentuk {
    double hitungLuas();

    double hitungKeliling();
}

// Abstract class sebagai blueprint untuk semua jenis bangun datar
abstract class BangunDatar implements Bentuk {

    private String name;

    public BangunDatar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * alas;
    }
}

class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        super("Lingkaran: ");
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

// Main class untuk menjalankan program
public class CalculateBangunDatar {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pil;

        do {

            System.out.println("MENGHITUNG LUAS DAN KELILING BANGUN DATAR");
            System.out.println("===========================================");
            System.out.println();
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi");
            System.out.println("2. PersegiPanjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("Pilih: ");
            int pilihan = scanner.nextInt();

            double luas = 0;
            double keliling = 0;

            switch (pilihan) {
                case 1:
                    System.out.println("Menghitung Luas dan Keliling Persegi");
                    System.out.println("======================================");
                    System.out.println("Masukan nilai panjang sisi:");
                    double sisi = scanner.nextDouble();
                    Persegi persegi = new Persegi(sisi);
                    luas = persegi.hitungLuas();
                    keliling = persegi.hitungKeliling();
                    System.out.println("Luas: " + luas);
                    System.out.println("Keliling: " + keliling);
                    break;

                case 2:
                    System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
                    System.out.println("============================================");
                    System.out.println("Masukan nilai panjang:");
                    double panjang = scanner.nextDouble();
                    System.out.println("Masukan nilai lebar:");
                    double lebar = scanner.nextDouble();
                    PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                    luas = persegipanjang.hitungLuas();
                    keliling = persegipanjang.hitungKeliling();
                    System.out.println("Luas: " + luas);
                    System.out.println("Keliling: " + keliling);
                    break;

                case 3:
                    System.out.println("Menghitung Luas dan Keliling Segitiga");
                    System.out.println("======================================");
                    System.out.println("Masukan nilai alas:");
                    double alas = scanner.nextDouble();
                    System.out.println("Masukan nilai tinggi:");
                    double tinggi = scanner.nextDouble();
                    Segitiga segitiga = new Segitiga(alas, tinggi);
                    luas = segitiga.hitungLuas();
                    keliling = segitiga.hitungKeliling();
                    System.out.println("Luas: " + luas);
                    System.out.println("Keliling: " + keliling);
                    break;

                case 4:
                    System.out.println("Menghitung Luas dan Keliling Lingkaran");
                    System.out.println("======================================");
                    System.out.println("Masukan nilai jari-jari:");
                    double radius = scanner.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(radius);
                    luas = lingkaran.hitungLuas();
                    keliling = lingkaran.hitungKeliling();
                    System.out.println("Luas: " + luas);
                    System.out.println("Keliling: " + keliling);
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            scanner.nextLine();

            System.out.println();
            System.out.println("apakah anda ingin mengulang program (0. ya/1. tidak) : ");
            pil = scanner.nextInt();

        } while (pil != 1);

        scanner.close();
    }
}