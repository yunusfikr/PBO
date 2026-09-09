package P1.Tugas;

public class TugasMain {
    public static void main(String[] args) {

        Sofa sofa = new Sofa();
        sofa.setWarna("Abu-abu");
        sofa.setJumlahDudukan(3);
        sofa.duduk();
        sofa.bersihkan();
        sofa.cetakInfo();
        System.out.println();

        Lemari lemari = new Lemari();
        lemari.setWarna("Coklat");
        lemari.setTinggi(180);
        lemari.bukaPintu();
        lemari.tutupPintu();
        lemari.cetakInfo();
        System.out.println();

        LemariPakaian lemariPakaian = new LemariPakaian();
        lemariPakaian.setWarna("Putih");
        lemariPakaian.setTinggi(200);
        lemariPakaian.setJumlahRak(4);
        lemariPakaian.setAdaKaca(true);
        lemariPakaian.bukaPintu();
        lemariPakaian.gantungBaju();
        lemariPakaian.lipatBaju();
        lemariPakaian.cetakInfo();
        System.out.println();

        LemariBuku lemariBuku = new LemariBuku();
        lemariBuku.setWarna("Hitam");
        lemariBuku.setTinggi(150);
        lemariBuku.setJumlahRak(5);
        lemariBuku.setKapasitasBuku(100);
        lemariBuku.taruhBuku(10);
        lemariBuku.ambilBuku(2);
        lemariBuku.cetakInfo();
        System.out.println();

    }
}
