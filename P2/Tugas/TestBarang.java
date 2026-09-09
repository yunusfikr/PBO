package P2.Tugas;

public class TestBarang {
    public static void main(String[] args) {
        
        Barang b1 = new Barang();
        b1.kode = "B1";
        b1.namaBarang = "Buku";
        b1.hargaDasar = 5000;
        b1.diskon = 0.1f;
        b1.hitungHargaJual();
        b1.tampilBarang();

    }
}
