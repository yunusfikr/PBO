package P1.Tugas;

public class LemariBuku extends Lemari {
    private int jumlahRak;
    private int kapasitasBuku;
    private int jumlahBukuSaatIni = 0;

    public void setJumlahRak(int jumlahRak) {
        this.jumlahRak = jumlahRak;
    }

    public void setKapasitasBuku(int kapasitasBuku) {
        this.kapasitasBuku = kapasitasBuku;
    }

    public void taruhBuku(int jumlah) {
        jumlahBukuSaatIni += jumlah;
        if (jumlahBukuSaatIni > kapasitasBuku) {
            jumlahBukuSaatIni = kapasitasBuku;
        }
        System.out.println(jumlah + " buku diletakkan di lemari buku.");
    }

    public void ambilBuku(int jumlah) {
        jumlahBukuSaatIni -= jumlah;
        if (jumlahBukuSaatIni < 0) {
            jumlahBukuSaatIni = 0;
        }
        System.out.println(jumlah + " buku diambil dari lemari buku.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Rak       : " + jumlahRak);
        System.out.println("Kapasitas Buku   : " + kapasitasBuku);
        System.out.println("Buku Saat Ini    : " + jumlahBukuSaatIni);
        System.out.println("Jenis Lemari     : Lemari Buku");
    }
}