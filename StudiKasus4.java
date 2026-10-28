import java.util.Scanner;

public class StudiKasus4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenis;
        int juara;
        int pendanaan;
        int dokumen;
        int kurang;

        System.out.println("=== VALIDASI DANA PENGHARGAAN ===");

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan: ");
        jenis = input.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA")
                || jenis.equals("BAKORMA")
                || jenis.equals("MANDIRI")) {

            System.out.print("Peringkat juara (1-3, 0 jika bukan juara): ");
            juara = input.nextInt();

            if (juara >= 1 && juara <= 3) {

                System.out.print("Jumlah dokumen (0-4): ");
                dokumen = input.nextInt();

                if (dokumen == 4) {
                    System.out.println();
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana: Berhak");
                    System.out.println("Alasan: Juara " + juara
                            + " dan dokumen lengkap.");
                } else {
                    kurang = 4 - dokumen;

                    System.out.println();
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana: Tidak berhak");
                    System.out.println("Alasan: Dokumen tidak lengkap.");
                    System.out.println("Dokumen kurang: " + kurang);
                }

            } else {
                System.out.println();
                System.out.println("Nama mahasiswa: " + nama);
                System.out.println("Status dana: Tidak berhak");
                System.out.println("Alasan: Dana hanya diberikan "
                        + "kepada Juara 1, 2, atau 3.");
            }

        } else if (jenis.equals("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak): ");
            pendanaan = input.nextInt();

            if (pendanaan == 1) {

                System.out.print("Jumlah dokumen (0-4): ");
                dokumen = input.nextInt();

                if (dokumen == 4) {
                    System.out.println();
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana: Berhak");
                    System.out.println("Alasan: PKM lolos pendanaan "
                            + "dan dokumen lengkap.");
                } else {
                    kurang = 4 - dokumen;

                    System.out.println();
                    System.out.println("Nama mahasiswa: " + nama);
                    System.out.println("Status dana: Tidak berhak");
                    System.out.println("Alasan: Dokumen tidak lengkap.");
                    System.out.println("Dokumen kurang: " + kurang);
                }

            } else {
                System.out.println();
                System.out.println("Nama mahasiswa: " + nama);
                System.out.println("Status dana: Tidak berhak");
                System.out.println("Alasan: PKM tidak lolos pendanaan.");
            }

        } else if (jenis.equals("LAINNYA")) {

            System.out.println();
            System.out.println("Nama mahasiswa: " + nama);
            System.out.println("Status dana: Tidak berhak");
            System.out.println("Alasan: Jenis kegiatan tidak "
                    + "termasuk ketentuan.");

        } else {

            System.out.println();
            System.out.println("Jenis kegiatan tidak valid.");
            System.out.println("Masukkan BELMAWA, BAKORMA, "
                    + "MANDIRI, PKM, atau LAINNYA.");
        }

        input.close();
    }
}
