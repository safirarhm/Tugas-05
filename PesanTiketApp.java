import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        // Input nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = scanner.nextLine();

        // Input tahap pembelian
        System.out.println("Pilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih jenis tiket (1/2): ");
        int tahapPembelian = scanner.nextInt();

        if (tahapPembelian != 1 && tahapPembelian != 2) {
            System.out.println("Input tidak valid");
            System.exit(0); // untuk keluar/diberhentiin dari program
        }

        String tahap;
        int jenisTiket;
        Tiket tiket = null;

        // Input jenis tiket
        System.out.println("Pilih jenis tiket:");
        if (tahapPembelian == 1) {
            tahap = "Presale";
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            jenisTiket = scanner.nextInt();
            if (jenisTiket == 1) {
                tiket = new VIP(true);
            } else if (jenisTiket == 2) {
                tiket = new VVIP(true);
            } else {
                System.out.println("Input tidak valid");
                System.exit(0);
            }

        } else {
            tahap = "Reguler";
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            jenisTiket = scanner.nextInt();
            if (jenisTiket == 1) {
                tiket = new Festival();
            } else if (jenisTiket == 2) {
                tiket = new VIP(false);
            } else if (jenisTiket == 3) {
                tiket = new VVIP(false);
            } else {
                System.out.println("Input tidak valid");
                System.exit(0);
            }
        }

        System.out.println("Masukkan jumlah tiket yang akan ingin dibeli");
        int jumlahTiket = scanner.nextInt();

        Pemesanan tiket1 = new Pemesanan(namaPembeli, tahap, tiket, jumlahTiket);
        tiket1.cetakNota(); // memanggil cetak nota
    }
}
