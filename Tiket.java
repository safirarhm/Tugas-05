// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    protected String jenis;
    protected int harga;

    public Tiket(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    public abstract int hitungHarga(int jumlahTiket);
}
