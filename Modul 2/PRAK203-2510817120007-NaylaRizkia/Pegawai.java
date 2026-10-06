package praktikum2.soal3;

// salah nama class, tidak sesuai nama file
// public class Employee {
public class Pegawai {
    public String nama;
//    tipe data tidak sesuai, harusnya string bukan char
//    public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

//    kurang parameter
//    public void setJabatan() {
    public void setJabatan(String jabatan) {
//        salah nama variabel
//        this.jabatan = j;
        this.jabatan = jabatan;
    }
}
