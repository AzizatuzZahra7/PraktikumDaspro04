public class StudiKasus104 {
    import java.util.Scanner
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga = 18000;
        int jumlah;
        int total;
        int diskon = 0;
        int totalBayar;
        int uang;
        int kembalian;

        System.out.print("Jumlah cup: ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        if (total >= 100000) {
            diskon = total * 10 / 100;
        }

        totalBayar = total - diskon;

        System.out.print("Uang pembayaran: ");
        uang = input.nextInt();

        kembalian = uang - totalBayar;

        System.out.println("Total harga: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
        System.out.println("Kembalian: " + kembalian);

        input.close();
    }
}
