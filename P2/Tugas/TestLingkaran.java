package P2.Tugas;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 2;
        System.out.println("Luas : " + l1.hitungLuas());
        System.out.println("Keliling :" + l1.hitungKeliling());
    }
}
