import java.util.Scanner;

public class AnalisaText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Pilih operasi:");
        System.out.println("1. Hitung jumlah karakter");
        System.out.println("2. Hitung jumlah kata");
        System.out.println("3. Cari kata dalam teks");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Masukkan teks: ");
                String inputText = scanner.nextLine();
                int characterCount = inputText.length();
                System.out.println("Jumlah karakter: " + characterCount);
                break;

            case 2:
                System.out.print("Masukkan teks: ");
                String inputTextForWords = scanner.nextLine();
                String[] words = inputTextForWords.split("\\s+");
                int wordCount = words.length;
                System.out.println("Jumlah kata: " + wordCount);
                break;

            case 3:
                System.out.print("Masukkan teks: ");
                String textToSearch = scanner.nextLine();
                System.out.print("Cari kata: ");
                String searchWord = scanner.nextLine();
                boolean nemu = false;

                String[] wordsToSearch = textToSearch.split("\\s+");
                for (String word : wordsToSearch) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        nemu = true;
                        break;
                    }
                }

                if (nemu) {
                    System.out.println("Kata ditemukan dalam teks.");
                } else {
                    System.out.println("Kata tidak ditemukan dalam teks.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
