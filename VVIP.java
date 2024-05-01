// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    public VVIP(boolean presale) {
        super("VVIP", presale ? 160 : 200);
    }

    @Override
    public int hitungHarga(int jumlahTiket) {
        return harga * jumlahTiket;
    }
}