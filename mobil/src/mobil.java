public class mobil {
    private String merek;
    private int tahun;
    private String warna;
    private int kecepatan;

    public mobil(String merek, int tahun, String warna, int kecepatan) {
        this.merek = merek;
        this.tahun = tahun;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void percepat(int nilaiKecepatan) {
        kecepatan += nilaiKecepatan;
    }


    public void tampilInformasi() {
        System.out.println("\n--------------------------");
        System.out.println("Informasi Mobil");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println("------------------------\n");
    }

    public static void main(String[] args) {
        mobil Mobil = new mobil("Toyota", 2020, "Silver", 200);
        

        Mobil.tampilInformasi();
        Mobil.percepat(80);
        Mobil.tampilInformasi();

    }
}