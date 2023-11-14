import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih operasi:");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    akarKuadrat();
                    break;
                case 2:
                    pangkat();
                    break;
                case 3:
                    logaritma();
                    break;
                case 4:
                    faktorial();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }

        } while (pilihan != 5);
    }

    private static void akarKuadrat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = input.nextDouble();
        double akar = Math.sqrt(angka);
        System.out.println("Akar kuadrat dari " + angka + " adalah " + akar);
    }

    private static void pangkat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = input.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double pangkat = input.nextDouble();
        double hasil = Math.pow(angka, pangkat);
        System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
    }

    private static void logaritma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        double angka = input.nextDouble();
        double hasil = Math.log(angka);
        System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
    }

    private static void faktorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int hasil = faktorialcoba(angka);
        System.out.println(angka + "! = " + hasil);
    }

    private static int faktorialcoba(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialcoba(n - 1);
        }
    }
}
