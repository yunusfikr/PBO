package P1.Tugas;

public class Sofa {
    private String warna;
    private int jumlahDudukan;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setJumlahDudukan(int jumlahDudukan) {
        this.jumlahDudukan = jumlahDudukan;
    }

    public void duduk() {
        System.out.println("Seseorang duduk di sofa warna " + warna + ".");
    }

    public void bersihkan() {
        System.out.println("Sofa dibersihkan dari debu.");
    }

    public void cetakInfo() {
        System.out.println("=== Info Sofa ===");
        System.out.println("Warna          : " + warna);
        System.out.println("Jumlah Dudukan : " + jumlahDudukan);
    }
}