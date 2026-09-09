package P1.Tugas;

public class LemariPakaian extends Lemari {
    private int jumlahRak;
    private boolean adaKaca;

    public void setJumlahRak(int jumlahRak) {
        this.jumlahRak = jumlahRak;
    }

    public void setAdaKaca(boolean adaKaca) {
        this.adaKaca = adaKaca;
    }

    public void gantungBaju() {
        System.out.println("Baju digantung di dalam lemari pakaian.");
    }

    public void lipatBaju() {
        System.out.println("Baju dilipat dan disusun di rak lemari pakaian.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Rak     : " + jumlahRak);
        System.out.println("Ada Kaca       : " + (adaKaca ? "Ya" : "Tidak"));
        System.out.println("Jenis Lemari   : Lemari Pakaian");
    }
}