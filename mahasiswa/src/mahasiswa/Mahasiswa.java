public class Mahasiswa {
  String nama, nim, jurusan;
  float ipk;

  public Mahasiswa(String nama, String nim, String jurusan, float ipk) {
    this.nama = nama;
    this.nim = nim;
    this.jurusan = jurusan;
    this.ipk = ipk;
  }

  public void ubahNama(String namaBaru) {
    this.nama = namaBaru;
  }
  public void ubahNIM(String nimBaru) {
    this.nim = nimBaru;
  }
  public void ubahJurusan(String jurusanBaru) {
    this.jurusan = jurusanBaru;
  }

  public void tampilInformasi() {
    System.out.println("\n==========================");
    System.out.println("Informasi Mahasiswa:");
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("Jurusan: " + jurusan);
    System.out.println("IPK: " + ipk);
    System.out.println("==========================\n");
  }

  public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa("Ilma", "C2083207016", "Pendidikan Teknologi Informasi",4);

    mahasiswa1.tampilInformasi();
    mahasiswa1.ubahNama("Amalia");
    mahasiswa1.ubahNIM("C2083207018");
    mahasiswa1.ubahJurusan("Teknologi Informasi");
    mahasiswa1.tampilInformasi();
  }
}