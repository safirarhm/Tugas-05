// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
   public VIP(boolean presale) {
      super("VIP", presale ? 120 : 150); // boolean (true n false) kyk if else tpi versi simple
   }

   @Override
   public int hitungHarga(int jumlahTiket) {
      return harga * jumlahTiket;
   }
}