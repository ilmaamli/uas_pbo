public class persegi_panjang {
  float panjang, lebar;

  public persegi_panjang(float panjang, float lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public float hitungLuas(){
    return panjang * lebar;
  }

  public float hitungKeliling(){
    return 2 * (panjang+lebar);
  }

  public static void main(String[] args) {
    persegi_panjang p_panjang = new persegi_panjang(8.5f, 4.0f);
    float luas = p_panjang.hitungLuas();
    float keliling = p_panjang.hitungKeliling();

    System.out.println("Luas Persegi Panjang: " + luas);
    System.out.println("Keliling Persegi Panjang: " + keliling);
}

}