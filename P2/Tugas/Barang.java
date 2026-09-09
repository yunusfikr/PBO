package P2.Tugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar - (int)(diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilBarang() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harga Jual : " + hitungHargaJual());
    }
}
