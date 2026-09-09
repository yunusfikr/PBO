package P1.Tugas;

public class Lemari {
    private String warna;
    private int tinggi; // dalam cm
    protected boolean pintuTerbuka = false;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public String getWarna() {
        return warna;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void bukaPintu() {
        pintuTerbuka = true;
        System.out.println("Pintu lemari dibuka.");
    }

    public void tutupPintu() {
        pintuTerbuka = false;
        System.out.println("Pintu lemari ditutup.");
    }

    public void cetakInfo() {
        System.out.println("=== Info Lemari ===");
        System.out.println("Warna  : " + warna);
        System.out.println("Tinggi : " + tinggi + " cm");
    }
}