package P3.Tugas;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private int kapasitasMaksimal;
    private int beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, int kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public int getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(int berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println("Muatan melebihi kapasitas maksimal!");
        }
    }

    public void kurangiMuatan(int berat) {
        if (berat <= beratMuatanSaatIni) {
            beratMuatanSaatIni -= berat;
        } else {
            System.out.println("Muatan yang dibongkar melebihi muatan saat ini!");
        }
    }
}