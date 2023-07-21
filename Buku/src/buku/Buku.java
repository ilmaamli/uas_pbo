public class Buku {
  String judul,penulis;
  int tahunTerbit,jmlHalaman;

  public Buku(String judul, String penulis, int tahunTerbit, int jmlHalaman){
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    this.jmlHalaman = jmlHalaman;
  }

  public void tambahHalaman(int jmlHalamanBaru){
    this.jmlHalaman += jmlHalaman;
  }

  public void UbahJudul(String judulBaru){
    this.judul = judulBaru;
  }

  public void ubahPenulis(String penulisBaru){
    this.penulis = penulisBaru;
  }

  public void ubahThnTerbit(int tahunTerbitBaru){
    this.tahunTerbit = tahunTerbitBaru;
  }
  


  public void tampilInformasi() {
    System.out.println("\n==========================");
    System.out.println("Informasi Buku:");
    System.out.println("Judul Buku: " + judul);
    System.out.println("Penulis: " + penulis);
    System.out.println("Tahun Terbit: " + tahunTerbit);
    System.out.println("Jumlah Halaman: " + jmlHalaman);
    System.out.println("==========================\n");
}
public static void main(String[] args) {
  Buku buku1 = new Buku("Menjadi Manfaat", "Ilma Amalia", 2023, 153);

  buku1.tampilInformasi();
  buku1.tambahHalaman(20);
  buku1.tampilInformasi();
}
  
}